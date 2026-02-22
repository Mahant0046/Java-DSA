package extras;

import java.util.ArrayList;

public class Permutations {

    private static void getPermuataion(int []arr, int index, ArrayList<Integer> ans){

        if (index== arr.length-1){
            for (int num:arr){
                System.out.print(num+" ");
                ans.add(num);
            };
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length ; i++) {

            // swap(arr[index],arr[i]);  ith elements choice
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

            getPermuataion(arr,index+1,ans);

            // swap(arr[index],arr[i]); //backtacking
            temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }


    public static void main(String[] args) {
        int []nums={1,2,3};
        ArrayList<Integer> ans=new ArrayList<>();
        getPermuataion(nums,0,ans);

//        System.out.println(ans);
    }
}
