package KnowTheBasics;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcdOfNumbers(20,15));
    }
    public static int gcdOfNumbers(int a,int b){

        // Brute Force
//        for (int i = 2; i <Math.min(x,y) ; i++) {
//            if (x%i==0 && y%i==0 )
//                return i;
//        }
          // OR BETTER APPROCH
//        for (int i = Math.min(x,y); i >0 ; i--) {
//            if (x%i==0 && y%i==0 )
//                return i;
//        }
//        return 1;

        // OPTIMAL APPROCH
        a = Math.abs(a);
        b = Math.abs(b);
        // Euclidean algorithm: repeatedly replace (a, b) with (b, a % b)
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int gcdRecursive(int a, int b) {
        b = Math.abs(b);
        return b == 0 ? a : gcdRecursive(b, a % b);
    }
}
