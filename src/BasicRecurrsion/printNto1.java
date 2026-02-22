package BasicRecurrsion;

public class printNto1 {
    public static void printNum(int n){
        if (n<=0)
            return;
        else {
            System.out.println(n);
            printNum(n - 1);
        }
    }

    public static void main(String[] args) {
        printNum(5);
    }
}
