package StriverDSA.src.Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] arr=new char[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.next().charAt(0);
        }

        char result=checkOddColur(arr,n);
        System.out.println(result);
    }

    public static  char checkOddColur(char[] arr,int n)
    {
        HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
        char ans=' ';

        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }

        for (int i = 0; i <n ; i++) {
            if (mp.get(arr[i])%2!=0)
            {
                ans=arr[i];
                break;
            }
        }
        return ans;

        //odd time, even time ->specially given ans single single odd timex
//        char ans=0;
//        for (int i = 0; i <n ; i++) {
//            ans^=arr[i];
//        }
//        return  ans;
    }

}
