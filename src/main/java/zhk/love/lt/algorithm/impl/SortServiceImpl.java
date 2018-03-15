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
}
