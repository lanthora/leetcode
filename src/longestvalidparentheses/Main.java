package longestvalidparentheses;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = ")()())";
        System.out.println(solution.longestValidParentheses(string));
    }
}
