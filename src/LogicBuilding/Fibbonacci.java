package StriverDSA.src.LogicBuilding;
// 0 1 1 2 3 5 8 13

public class Fibbonacci {
    public static void main(String[] args) {
        Fib(5);
    }

    public static void Fib(int n){
        int a=0,b=1,c;
        for (int i = 0; i < n; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(a+" ");
        }
        System.out.println("\n"+a);

    }
}
