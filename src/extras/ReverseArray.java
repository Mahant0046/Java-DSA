package extras;

import java.util.*;

public class ReverseArray {
       public static void main(String[] args) {
           int[] arr={1,2,3,4,5,6,7,8};

           // Using another array
//           int[] reversed = new int[arr.length];
//           for (int i = 0; i < arr.length; i++) {
//               reversed[i] = arr[arr.length - 1 - i];
//           }

           // Using while loop
//            int low=0,high=arr.length-1;
//            while (low<high){
//                int temp=arr[low];
//                arr[low]=arr[high];
//                arr[high]=temp;
//                low++;
//                high--;
//            }

           StringBuilder str= new StringBuilder(String.valueOf(arr));
           System.out.println(str.toString());
           for (int i:arr)
               System.out.print(i+" ");

       }

}
