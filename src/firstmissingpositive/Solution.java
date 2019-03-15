package firstmissingpositive;

public class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 1, tmp;
        while (i <= nums.length) {
            if (nums[i - 1] == i || nums[i - 1] < 1 || nums[i - 1] > nums.length || nums[nums[i - 1] - 1] == nums[i - 1]) {
                i++;
            } else if (nums[i - 1] > 0 && nums[i - 1] <= nums.length) {
                tmp = nums[nums[i - 1] - 1];
                nums[nums[i - 1] - 1] = nums[i - 1];
                nums[i - 1] = tmp;
            }
        }
        for (i = 1; i <= nums.length; i++) {
            if (nums[i - 1] != i) {
                return i;
            }
        }
        return nums.length + 1;
    }
}
