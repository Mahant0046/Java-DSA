package Arrays.Easy;

import java.util.Scanner;

public class leftRotateByDPlaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []a={1,2,3,4,5,6,7};
        int D=sc.nextInt()%a.length;

        // Brute Force Approach;
//            int[] temp = new int[D];

              // Copying the first D elements
//            for (int i = 0; i < D; i++) {
//                temp[i] = a[i];
//            }

              // Shifting other elements
//            for (int i = D; i < a.length; i++) {
//                a[i - D] = a[i];
//            }

            // Copying elements from temp
////         for (int i =0 ; i <D ; i++) {
////            a[a.length-D+i]=temp[i];
////         }
//            // OR
//            int j=0;
//            for (int i = a.length - D; i < a.length; i++) {
//                a[i] = temp[i - a.length + D];
////            j++;
//            }


        String rotate="left";
        // Optimal Approach
        if (rotate.equals("left")) {  //Left Rotation
            reverse(a, 0, D - 1);
            reverse(a, D, a.length - 1);
            reverse(a, 0, a.length - 1);
        }
        else{                         //Right Rotation
            reverse(a,0,a.length-1);
            reverse(a,0,D-1);
            reverse(a,D,a.length-1);
        }
        for (int i : a)
            System.out.print(i + " ");

    }

    public static void reverse(int []arr,int low ,int high){
            while (low<high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
    }
}
