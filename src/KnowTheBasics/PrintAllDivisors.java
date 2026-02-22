package KnowTheBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisors {
    public static void main(String[] args) {

        int N = 36;

        List<Integer> result = getDivisors(N);

        // Print the result
        System.out.print("Divisors of " + N + ": ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // BRUTE FORCE APPROCH
//    public static List<Integer> getDivisors(int N) {
//
//        List<Integer> res = new ArrayList<>();
//        for (int i = 1; i <= N; i++) {
//            if (N % i == 0) {
//                res.add(i);
//            }
//        }
//        return res;
//    }

    // OPTIMAL APPROCH
    public static List<Integer> getDivisors(int N) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
           if (N % i == 0) {
                res.add(i);

                // If N / i is different from i, add N / i too
                if (i != N / i) {
                    res.add(N / i);
                }
            }
        }
        return res.stream().sorted().toList();
    }
}
