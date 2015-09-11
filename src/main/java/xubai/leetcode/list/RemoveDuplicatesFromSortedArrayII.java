package xubai.leetcode.list;

/**
 * Follow up for ”Remove Duplicates”: What if duplicates are allowed at most twice? For example,
 * Given sorted array A = [1,1,1,2,2,3], Your function should return length = 5, and A is now
 * [1,1,2,2,3]
 * 
 * Created by xubai on 15/9/6.
 */
public class RemoveDuplicatesFromSortedArrayII {
    /**
     * 思路与RemoveDuplicatesFromSortedArray类似，只是在判断是否需要保留时，增加一个计数。
     * 当计数器为0时依然保留，当计数器为1时才丢弃。可扩展为允许n次重复。
     * 
     * @param array
     * @return
     */
    public int removeDuplicatesFromSortedArrayII(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int index = 0;
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[index] == array[i]) {
                if (count != 1) {
                    array[++index] = array[i];
                    ++count;
                }
            } else {
                array[++index] = array[i];
                count = 0;
            }
        }
        return index + 1;
    }
}
