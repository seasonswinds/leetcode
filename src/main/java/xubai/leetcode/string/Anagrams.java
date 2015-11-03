package xubai.leetcode.string;

import java.util.*;

/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * 
 * Note: All inputs will be in lower-case.
 * 
 * For example:
 * 
 * Input: ["tea","and","ate","eat","den"]
 * 
 * Output: ["tea","ate","eat"]
 * 
 * Created by xubai on 15/11/3.
 */
public class Anagrams {
    /**
     * Anagrams(回文构词法)是指由颠倒字母顺序组成的单词。
     * 回文构词法有一个特点：单词里的字母的种类和数目没有改变，只是改变了字母的排列顺序。
     * 因此，可以通过将单词按照字母顺序进行排序，来判断是否是anagrams。
     * 
     * @param stringList
     * @return
     */
    public List<String> anagrams(List<String> stringList) {
        List<String> result = new ArrayList<String>();
        if (stringList == null || stringList.size() == 0) {
            return result;
        }
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        for (int i = 0; i < stringList.size(); i++) {
            char[] charArray = stringList.get(i).toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            if (map.get(sortedString) == null) {
                List<Integer> indexList = new ArrayList<Integer>();
                indexList.add(i);
                map.put(sortedString, indexList);
            } else {
                map.get(sortedString).add(i);
            }
        }
        for (List<Integer> indexList : map.values()) {
            if (indexList.size() > 1) {
                for (Integer i : indexList) {
                    result.add(stringList.get(i));
                }
            }
        }
        return result;
    }
}
