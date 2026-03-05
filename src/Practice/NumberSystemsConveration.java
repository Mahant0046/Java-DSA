package StriverDSA.src.Practice;
// BINARY TO DECIMAL CONVERTION
import  java.util.Scanner;
public class NumberSystemsConveration {
    public static void main(String[] args) {
        System.out.println("Enter a Decimal number");
        Scanner sc=new Scanner(System.in);
        int DN=10;
        DecimalToBinary(DN);
//        int BN=sc.nextInt();
//        BinaryToDecimal(BN);
    }

    public  static void DecimalToBinary(int DN){
        int rem,pow=1,ans=0;
        while(DN>0){
            rem=DN%2;
            DN=DN/2;
            ans+=rem*pow;
            pow=pow*10;
        }
         // OR
//        String ans=Integer.toString(DN,2);    // Integer.toString converts number to String
//        int ans=Integer.parseInt(Integer.toString(DN,2));
        System.out.println("The Binary Equivalent of Decimal Number "+DN+"is "+ans);

    }


    public static void BinaryToDecimal(int BN){
        int rem,pow=1,ans=0;
        while(BN>0){
            rem=BN%10;
            BN=BN/10;
            ans+=rem*pow;
            pow=pow*2;
        }
//        String binary=Integer.toString(BN);
//        int ans=Integer.parseInt(binary,10);
        System.out.println("The Decimal Equivalent of Binary Number "+BN+"is "+ans);

    }
}

