package Arrays.Easy;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {

        // BRUTE FORCE
        int []a={7,3,4,2,3,4,5,6,7,8,6,2,5,10};
//        HashSet<Integer> hashSet=new HashSet<>();
//        for (int i = 0; i < a.length ; i++) {
//            hashSet.add(a[i]);
//        }
//        for (int i:hashSet){
//            System.out.print(i+" ");
//        }
//        System.out.println("\n"+hashSet.size());

        // OPTIMAL APPROACH
        Arrays.sort(a);
//        for (int i:a)
//            System.out.print(i+" ");
//        System.out.println();
//        int index=1;
//        for (int i = 1; i <a.length ; i++) {
//            if (a[i]!=a[i-1]){
//                a[index++]=a[i];
//            }
//        }
//        for (int i = 0; i <index ; i++) {
//            System.out.print(a[i]+" ");
//        }
        // If array is empty, return 0
//        if (a.length == 0)
//            return;

        // Pointer for last unique element
        int i = 0;

        // Start from second element
        for (int j = 1; j < a.length; j++) {
            // If new unique element is found
            if (a[j] != a[i]) {
                // Move unique position forward
                i++;
                // Place new unique element
                a[i] = a[j];
            }
        }
        for (int j = 0; j <i+1 ; j++) {  // i is last index of unique element, count = i + 1
            System.out.print(a[j]+" ");
        }
    }
}
