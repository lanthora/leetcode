package palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s1 = String.valueOf(x);
        String s2 = new StringBuffer(s1).reverse().toString();
        return s1.equals(s2);
    }
}
