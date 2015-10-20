package xubai.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Array common method.
 *
 * Created by xubai on 15/9/11.
 */
public class ArrayUtil {
    public static void reverse(int[] array, int left, int right) {
        if (array == null || array.length == 0) {
            return;
        }
        if (left < 0 || right > array.length - 1) {
            return;
        }
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static List reverse(List list) {
        if (list == null || list.size() < 2) {
            return list;
        }
        List result = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }
}
