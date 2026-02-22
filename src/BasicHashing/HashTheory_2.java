/*
 In hashTheory we seen that in order find the count of an array element we have to call the
 funtion for each query which has time complexity of O(n*q)

 In this code we use hash table to which store the count of each element and in order to get
 the count we have to refer to the index i.e the element of an array
 The size of the hash table is the maximum element of the array
 Storing and fecthing

 */


package BasicHashing;

import java.util.Scanner;

public class HashTheory_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int max=0;
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
            // finding the maximum at the time of reading the array
//            max=Math.max(max,arr[i]);
        }

        //finding the maximum by looping
        for (int i = 0; i <n; i++) {
            if(arr[i]>max)
                max=arr[i];
        }

        // finding the maximum number in an array using stream api
//        int max=Arrays.stream(arr).max().getAsInt();

        //prepare table upto the maximum of the array
        int[] hash=new int[max+1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Reading the queries
        int q=sc.nextInt();
        int []nums=new int[q];
        for (int i = 0; i <q ; i++) {
            nums[i]= sc.nextInt();
        }

        // Fecting the count of each query
        for (int i = 0; i <q ; i++) {
            System.out.println("Count of "+nums[i] +" is "+hash[nums[i]]);

        }



    }
}
