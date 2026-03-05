package StriverDSA.src.Practice;// Given an integer array Arr of size N the task is to find the count of
// elements whose value is greater than all of its prior elments
import  java.util.Scanner;

public class Promblem_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }
        int count=1;
        int max=a[0];
        for (int i= 1; i< a.length; i++) {
           if (a[i]>max){
               count++;
               max=a[i];
           }

        }
        System.out.println(count);
        sc.close();
    }
}
