package xubai.leetcode.list;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * 输入数组为(2 -> 4 -> 3) 和 (5 -> 6 -> 4) ，预期输出数组为 7 -> 0 -> 8
 *
 * Created by xubai on 15/9/15.
 */
public class AddTwoNumbersTest {
    private AddTwoNumbers o = new AddTwoNumbers();
    private AddTwoNumbers.ListNode l1 = null;
    private AddTwoNumbers.ListNode l2 = null;

    @Before
    public void setUp() {
//        int[] array1 = {2, 4, 3};
//        l1 = o.createLinkedList(array1);
//        int[] array2 = {5, 6, 4};
//        l2 = o.createLinkedList(array2);
        int[] array1 = {9};
        l1 = o.createLinkedList(array1);
        int[] array2 = {9, 9};
        l2 = o.createLinkedList(array2);
    }

    @Test
    public void test() {
        AddTwoNumbers.ListNode result = o.addTowNumbers(l1, l2);
        System.out.println(o.output(result));
        assertTrue("7, 0, 8".equals(o.output(result)));
    }
}
