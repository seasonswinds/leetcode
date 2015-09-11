package xubai.leetcode.list;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and
 * return the new length. Do not allocate extra space for another array, you must do this in place
 * with constant memory. For example, Given input array A = [1,1,2], Your function should return
 * length = 2, and A is now [1,2].
 * 
 * Created by xubai on 15/9/6.
 */
public class RemoveDuplicatesFromSortedArray {
    /**
     * 由于在数组中删除一个元素需要将后面的元素向前移动，使用了2个指针，一个正常自增，一个记录当前新数组的位置。
     * 当两个指针指向的数据不同时，表示正常自增的指针指向的数据需要保留。
     * 
     * @param array
     * @return
     */
    public int removeDuplicatesFromSortedArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[index] != array[i]) {
                array[++index] = array[i];
            }
        }
        return index + 1;
    }
}
