package largestrectangleinhistogram;

import java.util.*;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        /* 后面三行仅仅为了给数组追加一个0 */
        int[] tmp = new int[heights.length + 1];
        System.arraycopy(heights, 0, tmp, 0, heights.length);
        heights = tmp;

        Stack<Integer> index = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!index.empty() && heights[i] < heights[index.peek()]) {
                int h = heights[index.pop()];
                int prev = index.empty() ? -1 : index.peek();
                maxArea = Math.max(maxArea, (i - prev - 1) * h);
            }
            index.push(i);
        }
        return maxArea;
    }
}
