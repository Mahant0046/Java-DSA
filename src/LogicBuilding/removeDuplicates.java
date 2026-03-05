package StriverDSA.src.LogicBuilding;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 8,2, 2, 8,3, 4, 4, 4, 5, 5};

        // By using hashset
//        HashSet<Integer> hashSet=new HashSet<>();
//
//        int index=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (!hashSet.contains(arr[i])){
//                hashSet.add(arr[i]);
//                arr[index++]=arr[i];
//            }
//        }
//
//        for (int i = 0; i <index ; i++) {
//            System.out.print(arr[i]+" ");
//        }

        // Without using Hashset

        Arrays.sort(arr);
        int index=1;
        for (int i = 1; i < arr.length ; i++) {

            if(arr[i] !=arr[i-1]){
                arr[index++]=arr[i];
            }
        }

        for (int i = 0; i <index ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
