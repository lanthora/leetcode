package jumpgameii;

public class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int dp[] = new int[nums.length + 1];
        dp[0] = 1;
        dp[1] = nums[0] + 1;
        if (dp[1] >= nums.length) {
            return 1;
        }
        for (int i = 2; i <= nums.length; i++) {
            for (int j = dp[i - 2]; j <= Math.min(dp[i - 1], nums.length); j++) {
                dp[i] = Math.max(dp[i], j + nums[j - 1]);
            }
            if (dp[i] >= nums.length) {
                return i;
            }
        }
        return 0;
    }
}
