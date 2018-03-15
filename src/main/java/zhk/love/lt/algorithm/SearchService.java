package zhk.love.lt.algorithm;

/**
 * 搜索相关的算法
 * @author zhklt521
 * @version 1.0
 * @since 1.7
 */
public interface SearchService {

    /**
     * 二分查找
     * 原理：每次拿目标数值（以下用value表示）与数组中间位置的数据（以下用arry[mid]表示，mid表示数组中间位置索引值）
     * 进行比较，如果value大于arry[mid]，继续将value与大于arry[mid]部分的中间位置的值进行比较；如果value小于arry[mid]，
     * 继续将value与小于arry[mid]部分的中间位置值进行比较。
     * @param array 需要查找的有序数组
     * @param value 需要查找的数据
     * @return 索引值
     */
    int binarySearch(int[] array, int value);

}
