package extras;

import java.util.ArrayList;
import java.util.Arrays;

public class printNonDuplicateSubsets {

    private static void printSubset(int []arr,ArrayList<Integer> ans,int i){

        if (i== arr.length){
            for (int num:ans){
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }
        // include the element
        ans.add(arr[i]);
        printSubset(arr,ans,i+1);

        //exclude the element
        ans.removeLast();

        // before calling to next we check if the element is excluded in the previous call because of same subsets
        int index=i+1;
        while (index<arr.length && arr[index]==arr[index-1]){
            index++;
        }

        printSubset(arr,ans,index);
    }

    public static void main(String[] args) {
        int []nums={4,1,2,2,3};
        Arrays.sort(nums);
        ArrayList<Integer> temp=new ArrayList<>();
        printSubset(nums,temp,0);
    }
}
