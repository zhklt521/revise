package zhk.love.lt.algorithm.impl;

import org.springframework.stereotype.Service;
import zhk.love.lt.algorithm.SortService;

/**
 * Created by zhklt521 on 2018/3/15.
 */
@Service("sortService")
public class SortServiceImpl implements SortService {

    public void arrayBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void quickSort(int[] array) {
        if (array.length > 0)
            quickSort(array, 0, array.length - 1);
    }

    public void quickSort(int[] array, int low, int high) {
        if (low >= high) { // i大于或等于j，直接返回
            return;
        }

        int i = low; // i，左下标
        int j = high; // j，右下标
        int key = array[low]; // 基准元素，默认取数组的第一个元素


        // 让数组中的全部元素都比较
        while (true) {
            // j往前走
            while (j > i) {
                if (array[j] < key) { // 找到第一个小于key的值A[j]，A[i]与A[j]交换
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    break;
                } else {
                    j--;
                }
            }


            // i往后走
            while (j > i) {
                if (array[i] > key) { // 找到第一个大于key的A[i]，A[i]与A[j]交换
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    break;
                } else {
                    i++;
                }
            }


            // 终结最外层while循环，表示一趟排序结束（全部元素都进行了比较）
            if (i == j) {
                break;
            }
        }


        // 继续排序基准元素的左边元素
        quickSort(array, low, i - 1);


        // 继续排序基准元素的右边元素
        quickSort(array, i + 1, high);
    }
}
