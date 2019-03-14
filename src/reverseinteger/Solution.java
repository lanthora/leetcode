package reverseinteger;

public class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        String reverse = new StringBuffer(s).reverse().toString();
        try {
            if (x < 0) {
                reverse = new StringBuffer(reverse).deleteCharAt(reverse.length() - 1).toString();
                return -1 * Integer.valueOf(reverse);
            }

            return Integer.valueOf(reverse);
        } catch (Exception e) {
            return 0;
        }
    }
}
