package xubai.leetcode.sort;

/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same
 * color are adjacent, with the colors in the order red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue
 * respectively.
 * 
 * 
 * Created by xubai on 15/10/9.
 */
public class SortColors {
    public void sortColors(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int[] countArray = new int[3];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        int j = 0;
        int k = 0;
        while (j <= 2) {
            if (countArray[j] != 0) {
                array[k++] = j;
                countArray[j]--;
            } else {
                j++;
            }
        }
    }
}
