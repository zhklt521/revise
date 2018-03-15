package zhk.love.lt.algorithm.impl;

import org.springframework.stereotype.Service;
import zhk.love.lt.algorithm.SearchService;

/**
 * Created by zhklt521 on 2018/3/15.
 */
@Service("searchService")
public class SearchServiceImpl implements SearchService {

    public int binarySearch(int[] array, int value) {
        //定义最大索引和最小索引
        int max = array.length - 1;
        int min = 0;

        //计算中间索引值
        int mid = (max + min) / 2;

        //拿中间索引值和要查找的值做比较
        while (array[mid] != value) {
            if (array[mid] > value) {
                max = mid - 1;
            } else if (array[mid] < value) {
                min = mid + 1;
            }
            //加入判断，如果数组中不包含目标元素，则返回-1
            if (min > max) {
                return -1;
            }

            mid = (max + min) / 2;
        }
        return mid;
    }
}
