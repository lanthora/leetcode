package minimumwindowsubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    private int[] chars = new int[96];

    private boolean overZero() {
        for (int i : chars) {
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    public String minWindow(String s, String t) {

        int begin = 0;
        int end = 0;

        int ansStart = 0;
        int ansEnd = 0;

        int ansLength = s.length();

        Set<Character> set = new HashSet<>();
        for (char current_char : t.toCharArray()) {
            chars[current_char] += 1;
            set.add(current_char);
        }

        char current_char;
        /* 滑动窗口 */
        while (end < s.length()) {
            while (this.overZero() && end < s.length()) {
                current_char = s.charAt(end);
                if (set.contains(current_char)) {
                    chars[current_char] -= 1;
                }
                end++;
            }
            while (!this.overZero() && begin < s.length()) {
                current_char = s.charAt(begin);
                if (set.contains(current_char)) {
                    chars[current_char] += 1;
                }
                begin++;
            }
            if (end - begin < ansLength) {
                ansLength = end - begin;
                ansStart = begin - 1;
                ansEnd = end;
            }
        }
        if (ansStart == -1) {
            return "";
        } else {
            return s.substring(ansStart, ansEnd);
        }
    }
}
