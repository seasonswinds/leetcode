package xubai.leetcode.string;

import java.util.*;

/**
 * Given an array of strings, group anagrams together.
 * 
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 
 * Return: [ ["ate", "eat","tea"], ["nat","tan"], ["bat"] ]
 * 
 * Note:
 * 
 * For the return value, each inner list's elements must follow the lexicographic order.
 * 
 * All inputs will be in lower-case.
 * 
 * Created by xubai on 15/11/3.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(List<String> stringList) {
        List<List<String>> result = new ArrayList<List<String>>();
        if (stringList == null || stringList.size() == 0) {
            return result;
        }
        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
        int i = 0;
        for (String string : stringList) {
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            if (map.containsKey(sortedString)) {
                map.get(sortedString).add(i);
            } else {
                List<Integer> indexList = new ArrayList<Integer>();
                indexList.add(i);
                map.put(sortedString, indexList);
            }
            i++;
        }
        for (List<Integer> indexList : map.values()) {
            List<String> list = new ArrayList<String>(indexList.size());
            for (int index : indexList) {
                list.add(stringList.get(index));
            }
            result.add(list);
        }
        return result;
    }
}
