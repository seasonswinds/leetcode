package xubai.leetcode.string;

/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of
 * haystack.
 * 
 * Created by xubai on 15/11/4.
 */
public class ImplementStrStr {
    public int implementStrStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return 0;
        }
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0 ; i <= haystack.length() - needle.length() ; i++) {
            int j = 0;
            for (; j < needle.length() ; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public int implementStrStr1(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return 0;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int[] next = getNext(needle);
        int i = 0;
        int j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == needle.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    private int[] getNext(String needle) {
        int[] next = new int[needle.length()];
        next[0] = -1;
        int j = -1;
        int i = 0;
        while (i < needle.length() -1) {
            if (j == -1 || needle.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        return next;
    }
}
