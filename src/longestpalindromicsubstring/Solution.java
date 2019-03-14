package longestpalindromicsubstring;

class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();

        if (len == 0) {
            return "";
        }

        int maxLength = 0;
        int begin = 0;
        int end = 0;
        /* isPal[i][j]从i到j是否回文 */
        boolean[][] isPal = new boolean[len][len];
        for (int j = 0; j < len; j++) {
            for (int i = j; i >= 0; i--) {
                /* i和j的值相等，且在i+1到j-1之间是回文，则i到j是回文 */
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || isPal[i + 1][j - 1])) {
                    isPal[i][j] = true;
                    if (j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        begin = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(begin, end + 1);
    }
}