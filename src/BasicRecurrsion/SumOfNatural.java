package BasicRecurrsion;

public class SumOfNatural {
    public static int sumNum(int n){
        if (n==1){
            return 1;
        }
        return n+sumNum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumNum(4));
    }
}
