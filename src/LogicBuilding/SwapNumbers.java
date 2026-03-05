package StriverDSA.src.LogicBuilding;

public class SwapNumbers {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println("Before Swap "+a+" "+b);

        //using Temp variable
//        int t=a;
//        a=b;
//        b=t;

        // Using + and -
//        a=a+b;
//        b=a-b;
//        a=a-b;

        // Using * and /
//        a=a*b;
//        b=a/b;
//        a=a/b;


        // Using XOR operator
//        a=a^b;
//        b=a^b;
//        a=a^b;

        // Using single statement
        b=a+b-(a=b);


        System.out.println("After Swap "+a+" "+b);



    }
}
