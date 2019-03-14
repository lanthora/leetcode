package threesumclost;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-5,3,-4};
        Solution solution = new Solution();
        int ans = solution.threeSumClosest(nums,-1);
        System.out.println(ans);
    }
}
