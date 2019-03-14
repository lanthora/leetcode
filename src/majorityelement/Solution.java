package majorityelement;

public class Solution {
    public int majorityElement(int[] nums) {
        int answer = nums[0];
        int counter = 1;
        for (int num : nums) {
            if (num != answer) {
                counter--;
                if (counter == 0) {
                    counter = 1;
                    answer = num;
                }
            } else {
                counter++;
            }
        }
        return answer;
    }
}
