package threesum;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left;
        int right;
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> t_ans;
        int tmp;
        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                tmp = nums[i] + nums[left] + nums[right];
                if (tmp == 0) {
                    t_ans = new ArrayList<>();
                    t_ans.add(nums[i]);
                    t_ans.add(nums[left]);
                    t_ans.add(nums[right]);
                    ans.add(t_ans);
                    left++;
                } else if (tmp < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
