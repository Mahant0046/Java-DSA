package KnowTheBasics;

public class ReverseNumber {
    public static void main(String[] args) {
        int revNum=reverseNum(120);
        System.out.println(revNum);
        System.out.println((int)Math.pow(2,32));
        System.out.println(Integer.MIN_VALUE);
    }
    public static int reverseNum(int num){
        int reversed=0;
        while (num != 0) {
            int digit = num % 10;
            // Overflow check for positive numbers
            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Underflow check for negative numbers
            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            reversed = digit + 10 * reversed;
            num /= 10;
        }
        return reversed;
    }
}
