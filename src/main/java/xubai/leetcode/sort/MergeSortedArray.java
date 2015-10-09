package xubai.leetcode.sort;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * 
 * Note: You may assume that A has enough space to hold additional elements from B. The number of
 * elements initialized in A and B are m and n respectively.
 * 
 * Created by xubai on 15/10/9.
 */
public class MergeSortedArray {
    public void mergeSortedArray(int[] arrayA, int m, int[] arrayB, int n) {
        while (m > 0 && n > 0) {
            if (arrayA[m - 1] > arrayB[n - 1]) {
                arrayA[m + n - 1] = arrayA[m - 1];
                m--;
            } else {
                arrayA[m + n - 1] = arrayB[n - 1];
                n--;
            }
        }
        while (n > 0) {
            arrayA[n - 1] = arrayB[n - 1];
            n--;
        }
    }
}
