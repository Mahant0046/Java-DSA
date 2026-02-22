/*

 When you given array of size n and ask for the count of an array
 element with q number of queries to solve this problem
 using brute force approach we can use function and call the function n times
 the time complexity should be n*q

 */
package BasicHashing;

import java.util.Scanner;

public class HashTheory {
    public static int countNum(int n,int[] arr){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==n)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int []arr=new int[n];
        // Reading the array elements
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }

        // Reading the queries
        int q=sc.nextInt();
        int []nums=new int[q];
        for (int i = 0; i <q ; i++) {
            nums[i]= sc.nextInt();
        }

        // Fecting the count of each query
        for (int i = 0; i <q ; i++) {
            System.out.println("Count of "+nums[i] +" is "+countNum(nums[i],arr));

        }
    }
}
