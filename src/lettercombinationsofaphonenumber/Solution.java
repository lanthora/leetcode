package lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        int len = digits.length();
        List<String> ans = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            tmp.clear();
            tmp.addAll(ans);
            ans.clear();
            Character character = digits.charAt(i);
            String s = map.get(character);
            int l = s.length();
            for (int j = 0; j < l; j++) {
                String current = String.valueOf(s.charAt(j));
                if (tmp.size() == 0) {
                    ans.add(current);
                } else {
                    for (String t : tmp) {
                        ans.add(t + current);
                    }
                }
            }
        }
        return ans;
    }
}
