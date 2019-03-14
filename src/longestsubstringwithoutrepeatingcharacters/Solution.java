package longestsubstringwithoutrepeatingcharacters;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0) {
            return 0;
        }
        int ret = 1;
        int[] tmp = new int[len];
        tmp[0] = 1;

        for (int i = 1; i < len; i++) {
            tmp[i] = tmp[i - 1] + 1;
            for (int j = 1; j <= tmp[i - 1]; j++) {
                if (s.charAt(i - j) == s.charAt(i)) {
                    tmp[i] = j;
                    break;
                }
            }
            if (tmp[i] > ret) {
                ret = tmp[i];
            }
        }
        return ret;
    }
}