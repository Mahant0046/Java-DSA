package KnowTheBasics;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(2147483647));
        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(12455421));
    }
    public static boolean checkPalindrome(int n){

        if (n<0)
            return false;

        int original=n;
        int reverse=0;  //  Initialize a variable to store the reverse of the number
        while(n!=0){
            int digit = n % 10; // Extract the last digit of the number

            if (reverse>Integer.MAX_VALUE/10 ||
                    reverse==Integer.MAX_VALUE && digit>7)
                return false;

            if(reverse<Integer.MIN_VALUE/10 ||
                    reverse==Integer.MIN_VALUE && digit<-8)
                return  false;

            reverse = (reverse * 10) + digit; // Build the reverse number by appending the last digit
            n = n / 10; // Remove the last digit from the original number
        }
//        if (original==reverse)
//            return true;
//        else
//            return false;
        return original==reverse;
    }

}

class Solution{
    public boolean isPalindrome(int x)
    {
        return String.valueOf(x).
                equals(new StringBuilder(String.valueOf(x)).
                        reverse().toString())?true:false;
    }
}






/*
Input: x = -121
Output: false
Explanation: From left to right, it reads -121.
 From right to left, it becomes 121-.
 Therefore, it is not a palindrome.
 */