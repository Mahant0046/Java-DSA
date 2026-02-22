package BasicRecurrsion;

public class print1toN {
    public static void printNum(int n){
        int count=0;
        if (count==n)
            return;
        else
            printNum(n-1);
        System.out.println(n); //backtracking it prints number returnig after base case
    }

    public static void main(String[] args) {
        printNum(5);
    }
}
