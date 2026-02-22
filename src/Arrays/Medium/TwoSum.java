package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void BruteForce(int []a,int target){

        boolean flag=false;
        int index[]={-1,-1};
        for (int i = 0; i <a.length ; i++) {
            for (int j = i; j <a.length ; j++) {
                if ((a[i]+a[j])==target){
                    flag=true;
                    index[0]=i;
                    index[1]=j;
                    break;
                }
            }
        }
        System.out.println(flag);
        System.out.println("["+index[0]+","+index[1]+"]");

    }

    public static void Better(int []a,int target){
        boolean flag=false;
        int index[]={-1,-1};
        HashMap<Integer,Integer> hs=new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            int sumNeeded=target-a[i];
            if(hs.containsKey(sumNeeded)){
                flag=true;
                index[0]=i;
                index[1]=hs.get(target-a[i]);
                break;
            }
            else
                hs.put(a[i],i);
        }
        System.out.println(flag);
        if (index[0]>index[1]){
           Arrays.sort(index);
        }
        System.out.println("["+index[0]+","+index[1]+"]");
    }


    public static void Optimal(int []a,int target){
        boolean flag=false;
        int i=0,j=a.length-1;
        Arrays.sort(a);
        while (i<j) {
            if (a[i] + a[j] == target){
                flag = true;
                break;
            }
            else if (a[i]+a[j]>target)
                j--;
            else
                i++;
        }
        System.out.println(flag);
    }

    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11}; // 2 5 6 8 11
        int target=14;
//        BruteForce(arr,target);
        Better(arr,target);
//        Optimal(arr,target);
    }

}
