package xubai.leetcode.string;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return
 * the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * 
 * For example, Given s = "Hello World", return 5.
 * 
 * Created by xubai on 15/11/5.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        if (s == null || s.length() == 0) {
            return count;
        }
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) <= 'z' && s.charAt(i) >= 'A') {
                flag = true;
                count++;
            } else {
                if (flag) {
                    break;
                }
            }
        }
        return count;
    }
}
