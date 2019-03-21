package editdistance;

public class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];

        for (int m = 1; m <= word1.length(); m++) {
            dp[m][0] = m;
        }

        for (int n = 1; n <= word2.length(); n++) {
            dp[0][n] = n;
        }

        for (int m = 1; m <= word1.length(); m++) {
            for (int n = 1; n <= word2.length(); n++) {
                if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
                    dp[m][n] = dp[m - 1][n - 1];
                } else {
                    dp[m][n] = 1 + Math.min(dp[m - 1][n - 1], Math.min(dp[m - 1][n], dp[m][n - 1]));
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
