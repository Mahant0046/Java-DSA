package Arrays.Medium;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

    private static void BruteForce(int []arr){
        int count=1;
        int max=0;
//        for (int i = 0; i < arr.length; i++) {
//            int num=arr[i];
//            for (int j = 0; j < arr.length; j++) {
//                if (num-arr[j]==1){
//                    count++;
//                    num=arr[j];
//                }
//            }
//            max=Math.max(count,max);
//            count=1;
//        }
        for (int i = 0; i < arr.length ; i++) {
            int n=arr[i]+1;
            count=1;
            while (LinearSerach(arr,n)==true){
                n=n+1;
                count++;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);

    }

    private static void Better(int []arr){
        Arrays.sort(arr);
        int lastElement=Integer.MIN_VALUE;
        int count=1;
        int max=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]-1==lastElement){
                count++;
                lastElement=arr[i];
            } else if (arr[i]!=lastElement) {
                lastElement=arr[i];
                count=1;
            }
            max=Math.max(count,max);
        }
        System.out.println(max);
    }

    private static void Optimal(int []a){
        int max=1;
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i:a)
            hashSet.add(i);

        for (int n:hashSet){
            if (!hashSet.contains(n-1)){
                int x=n;
                int count=1;
                while (hashSet.contains(x+1)){
                    x=x+1;
                    count++;
                }
                max=Math.max(max,count);
            }
        }

        System.out.println(max);
    }

    private static boolean LinearSerach(int []a,int element){
        for (int i = 0; i < a.length ; i++) {
            if (a[i]==element)
                return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        int []arr={102,4,100,1,101,3,2,1,1};
//        BruteForce(arr);
//        Better(arr);
        Optimal(arr);
    }
}
