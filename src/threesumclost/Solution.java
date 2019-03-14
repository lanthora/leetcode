package threesumclost;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int left;
        int right;
        int tmp;
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                tmp = nums[i] + nums[left] + nums[right];
                if (tmp - target == 0) {
                    return tmp;
                }
                if (Math.abs(tmp - target) < Math.abs(ans - target)) {
                    ans = tmp;
                }
                if (tmp - target < 0) {
                    left++;
                } else if (tmp - target > 0) {
                    right--;
                }
            }
        }
        return ans;
    }
}
