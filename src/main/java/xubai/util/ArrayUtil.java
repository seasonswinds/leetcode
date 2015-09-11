package xubai.util;

/**
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
}
