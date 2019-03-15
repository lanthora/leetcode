package longestvalidparentheses;

public class Solution {
    public int longestValidParentheses(String s) {
        int dp[] = new int[s.length()];
        int ans = 0;
        int i;
        for (i = 1; i < dp.length; i++) {
            if (s.charAt(i) == ')' && s.charAt(i - 1) == '(') {
                dp[i] = dp[i - 2 >= 0 ? i - 2 : 0] + 2;
            } else if (s.charAt(i) == ')'
                    && s.charAt(i - 1) == ')'
                    && i - dp[i - 1] - 1 >= 0
                    && s.charAt(i - dp[i - 1] - 1) == '('
            ) {
                dp[i] = dp[i - 1] + 2 + dp[i - dp[i - 1] - 2 > 0 ? i - dp[i - 1] - 2 : 0];
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
