package xubai.leetcode.string;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * Created by xubai on 15/11/5.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        if (strings.length == 1) {
            return strings[0];
        }
        StringBuilder sb = new StringBuilder();
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < minLength) {
                minLength = strings[i].length();
            }
        }
        for (int i = 0; i < minLength; i++) {
            int j = 1;
            for (; j < strings.length; j++) {
                if (strings[j].charAt(i) != strings[j - 1].charAt(i)) {
                    break;
                }
            }
            if (j == strings.length) {
                sb.append(strings[0].charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
