package KnowTheBasics;

public class CountDigits {
    public static void main(String[] args) {
        countDigits(123666);
    }
    public static void countDigits(int n){
        // Brute Force Approch
//        int count=0;
//        while (n>0){
//            count++;
//            n/=10;
//        }
//        System.out.println(count);

        // Optimal Approch
        System.out.println((int)Math.log10(Math.abs(n))+1);
        System.out.println(String.valueOf(Math.abs(n)).length());
    }

}
