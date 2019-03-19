package minimumwindowsubstring;

public class Main {
    public static void main(String[] args) {
        String S = "ask_not_what_your_country_can_do_for_you_ask_what_you_can_do_for_your_country";
        String T = "ask_country";
        Solution solution = new Solution();
        System.out.println(solution.minWindow(S, T));
    }
}
