package trappingrainwater;

public class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int direction = 1;
        int i, location;
        i = location = left;
        if (right < 0) {
            return 0;
        }
        int current_height = height[i];
        int ans = 0;
        while (left < right) {
            i += direction;
            if ((i == left || i == right) && height[i] < current_height) {
                direction = -direction;
                current_height = height[left + right - location];
            } else if (height[i] >= current_height) {
                if (direction > 0) {
                    for (int j = left + 1; j < i; j++) {
                        ans += (height[left] - height[j]);
                    }
                    left = i;

                } else {
                    for (int j = i + 1; j < right; j++) {
                        ans += (height[right] - height[j]);
                    }
                    right = i;
                }
                location = i;
                current_height = height[i];
            }
        }
        return ans;
    }
}
