package zhk.love.lt.algorithm;

import org.junit.Test;
import zhk.love.lt.AbstractTest;
import zhk.love.lt.utils.JsonUtils;

import javax.annotation.Resource;

/**
 * Created by zhklt521 on 2018/3/15.
 */
public class SortServiceTest extends AbstractTest {

    @Resource
    private SortService sortService;

    @Test
    public void testArrayBubble() {
        int[] arry = {21, 18, 36, 14, 48, 30, 65, 53};

        System.out.println("排序前：");
        System.out.println(JsonUtils.toJsonString(arry));
        System.out.println("排序后：");
        sortService.arrayBubble(arry);
        System.out.println(JsonUtils.toJsonString(arry));
    }

    @Test
    public void testQuickSort(){
        int[] arry = {21, 18, 36, 14, 48, 30, 65, 53};

        System.out.println("排序前：");
        System.out.println(JsonUtils.toJsonString(arry));
        System.out.println("排序后：");
        sortService.quickSort(arry);
        System.out.println(JsonUtils.toJsonString(arry));
    }
}
