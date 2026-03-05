package StriverDSA.src.LogicBuilding;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int Orginal=sc.nextInt();

        // Using Algorithm
//        int rev=0;
//        int Orginal=num;
//        while(num>0){
//            rev=10*rev+num%10;
//            num/=10;
//        }

//      // Using StringBuffer class
//      StringBuffer sb=new StringBuffer(String.valueOf(Orginal));
//      StringBuffer rev= sb.reverse();


        // Using StringBuilder()
        StringBuilder sb=new StringBuilder(String.valueOf(Orginal));
        StringBuilder rev=sb.reverse();

        System.out.println("Original Number :"+Orginal);
        System.out.println("Reverse Number :"+ rev);
    }
}
