package containerwithmostwater;

public class Solution {
    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int most = 0;
        int tmp;
        boolean flag = true;
        while (flag) {
            flag = false;
            tmp = Math.min(height[left], height[right]) * (right - left);
            if (tmp > most) {
                most = tmp;
            }
            if (height[left] < height[right]) {
                int nextLeft = left;
                while (nextLeft < right) {
                    if (height[nextLeft] > height[left]) {
                        left = nextLeft;
                        flag = true;
                        break;
                    }
                    nextLeft++;
                }
            } else {
                int nextRight = right;
                while (nextRight > left) {
                    if (height[nextRight] > height[right]) {
                        right = nextRight;
                        flag = true;
                        break;
                    }
                    nextRight--;
                }
            }

        }
        return most;
    }
}
