// 0 1 1 2 3 5 8

package BasicRecurrsion;

public class Fibbonacci {

    // Reccursion

    public static int fib(int n){
        if (n<=1)
            return 1;
        int f=fib(n-1);
        int l=fib(n-2);
        return f+l;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

//    public static void main(String[] args) {
//        int n = 5;
//
//        // If n is 0, print only the first term
//        if (n == 0) {
//            System.out.println("The Fibonacci Series up to " + n + "th term:");
//            System.out.println(0);
//        } else {
//            int secondLast = 0; // (i-2)th term
//            int last = 1;       // (i-1)th term
//
//            System.out.println("The Fibonacci Series up to " + n + "th term:");
//            System.out.print(secondLast + " " + last + " ");
//
//            int cur;
//            for (int i = 2; i <= n; i++) {
//                cur = last + secondLast;  // Calculate current term
//                secondLast = last;        // Slide the window
//                last = cur;
//                System.out.print(cur + " ");
//            }
//        }
//    }
}
