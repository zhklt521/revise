package zhk.love.lt.algorithm;

/**
 * 排序相关的算法
 *
 * @author zhklt521
 * @version 1.0
 * @since 1.7
 */
public interface SortService {

    /**
     * 冒泡排序（ 时间复杂度O(n2) ）
     * 原理：相邻元素两两比较，大的往后放（以从小到大排序为例）。
     * 第一次完毕后，最大值就出现在了最大索引处。
     * 也就是说，冒泡排序每经过一次，至少有一个元素处于最终位置。
     * 同理，继续循环，即可得到一个排序好的数组。冒泡排序次数是数组长度-1次。
     *
     * @param array
     *         需要排序的数组
     */
    void arrayBubble(int[] array);
}
