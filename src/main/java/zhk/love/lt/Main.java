package zhk.love.lt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhklt521 on 2018/3/15.
 */
public class Main {

    public static Map<String, List<Long>> ipMap = new HashMap<String, List<Long>>();

    public static Map<String, Long> blackMap = new HashMap<String, Long>();

    /**
     * 思路：
     * 1、首先判断黑名单里面有没有这个ip，有这个ip的话，再去判断这个锁定时间是不是超过了30分钟，如果没有超过30分钟，
     * 则flag = false（并不返回，因为还需要把这次请求记录在内），如果超过30分钟，则把黑名单这条数据remove掉
     * 2、然后判断存储的ip列表里面是不是包含这个ip，如果不包含这个ip的话，则把这个时间加入到这个ip对应的队列里面，
     * 如果包含这个ip，则把队列取出来，遍历队列，删除超过30分钟的数据，然后把当前时间加入队列里面，对比长度是否超过30，
     * 如果超过30，则更新ip的map，同时加入黑名单，flag=false，如果没有超过30个，则更新ip对应的map就可以了
     * @param IP
     * @return
     */
    public static boolean canLogin(String IP) {
        boolean flag = true;
        if (blackMap.containsKey(IP)) {
            Long startTime = blackMap.get(IP);
            if (System.currentTimeMillis() - startTime > 1800000L) {//3000L
                blackMap.remove(IP);
            } else {
                flag = false;
            }
        }
        if (ipMap.containsKey(IP)) {
            List<Long> ipTimeList = ipMap.get(IP);
            for(int i = 0;i < ipTimeList.size();i++){
                if(System.currentTimeMillis() - ipTimeList.get(i) > 1800000L){//1800000L
                    ipTimeList.remove(i);
                }
            }
            ipTimeList.add(System.currentTimeMillis());
            if(ipTimeList.size() > 30){//3
                ipMap.put(IP,ipTimeList);
                blackMap.put(IP,System.currentTimeMillis());
                flag = false;
            }else{
                ipMap.put(IP,ipTimeList);
            }
        } else {
            List<Long> ipTimeList = new ArrayList<Long>();
            ipTimeList.add(System.currentTimeMillis());
            ipMap.put(IP,ipTimeList);
        }
        return flag;
    }

    public static void main(String args[]) throws InterruptedException {
        for(int i = 0;i < 10;i++){
            System.out.println(canLogin("127.0.0.1"));
            if(i > 3){
                Thread.sleep(3000);
            }
        }
    }

}
