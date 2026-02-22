package KnowTheBasics;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNum(6));
    }
    public static boolean primeNum(int num){
        for (int i = 2; i <num ; i++) {
            if (num%i==0)
                return false;
        }
        return true;
    }

}
