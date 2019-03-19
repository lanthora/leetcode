package pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] dp = new int[rowIndex + 3][rowIndex + 3];
        dp[2][1] = 1;
        for (int m = 3; m <= rowIndex + 2; m++) {
            for (int n = 1; n <= m; n++) {
                dp[m][n] = dp[m - 1][n - 1] + dp[m - 1][n];
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= rowIndex + 1; i++) {
            ans.add(dp[rowIndex + 2][i]);
        }
        return ans;
    }
}
