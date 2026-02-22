package extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllSubsets {

    // Printing all the subsets
    private static void printSubset(int []arr,ArrayList<Integer> ans,int i){
        if (i== arr.length ){
            for (int n:ans)
                System.out.print(n+" ");
            System.out.println();
            return;
        }
        // include
        ans.add(arr[i]);
        printSubset(arr,ans,i+1);

        ans.removeLast();
        //exclude
        printSubset(arr,ans,i+1);
    }

    // storing all the subsets in the arraylist allsubsets
    private static void printSubset2(int []arr,ArrayList<Integer> ans,int i,ArrayList<Integer> allSubset){
        if (i== arr.length ){
            allSubset.addAll(ans);
            return;
        }
        // include
        ans.add(arr[i]);
        printSubset2(arr,ans,i+1,allSubset);

        ans.removeLast();
        //exclude
        printSubset2(arr,ans,i+1,allSubset);
    }


    public static void main(String[] args) {
        int []nums={1,2,3};
        ArrayList<Integer> temp=new ArrayList<>();
        ArrayList<Integer> allSubset=new ArrayList<>();
        printSubset(nums,temp,0);
//        printSubset2(nums,temp,0,allSubset);
//        for (int i:allSubset)
//            System.out.println(i);


    }
}
