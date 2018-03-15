package zhk.love.lt.algorithm;

import org.junit.Assert;
import org.junit.Test;
import zhk.love.lt.AbstractTest;
import zhk.love.lt.algorithm.impl.SearchServiceImpl;

import javax.annotation.Resource;

/**
 * Created by zhklt521 on 2018/3/15.
 */
public class SearchServiceTest extends AbstractTest {

    @Resource
    private SearchService searchService;

    @Test
    public void testBinarySearch() {
        int[] arry = {10, 20, 30, 40, 50, 60}; //有序数组
        int value = 50; //目标数据

        //二分查找实现一
        int index = searchService.binarySearch(arry, value);
        Assert.assertEquals(4,index);
    }

}
