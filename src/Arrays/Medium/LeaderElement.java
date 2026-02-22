package Arrays.Medium;

import java.util.ArrayList;

public class LeaderElement {

    private static void BruteForce(int []arr){
        ArrayList<Integer> ans=new ArrayList<>();
        int flag=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]<arr[j]){
                    flag=1;
                }
            }
            if (flag==0){
                ans.add(arr[i]);
            }
            flag=0;
        }

        System.out.println(ans);
    }

    private static void Optimal(int []a){
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i =a.length-1; i >=0 ; i--) {
            if (a[i]>max){
                ans.add(a[i]);
                max=a[i];
            }
//            max=Math.max(a[i],max);
        }

//        System.out.println(ans);

        // if you want to preserve the order
        System.out.println(ans.reversed());
    }

    public static void main(String[] args) {
        int []arr={10,22,12,3,0,6};
//        BruteForce(arr);
        Optimal(arr);
    }
}
