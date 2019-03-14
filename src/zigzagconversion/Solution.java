package zigzagconversion;

public class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s == "" || s.length() < numRows) {
            return s;
        }

        int a = 2 * numRows - 2;
        int b = 0;
        int k = 0;
        int len = s.length();
        String ret = "";
        while (k < numRows) {
            int i = k;
            ret += s.charAt(i);
            while (i < len) {
                i += a;
                if (a != 0 && i < len) {
                    ret += s.charAt(i);
                }
                i += b;
                if (b != 0 && i < len) {
                    ret += s.charAt(i);
                }
            }
            a -= 2;
            b += 2;
            k++;
        }
        return ret;
    }
}
