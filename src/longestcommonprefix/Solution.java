package longestcommonprefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }


        int i;
        for (i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                try {
                    if (strs[0].charAt(i) != strs[j].charAt(i)) {
                        return strs[0].substring(0, i);
                    }
                } catch (Exception e) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i);
    }
}
