package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {7, 9, 3, 4, 8, 6, 2, 5, 10};
        int n = arr.length;

        // Brute Force Approch
//        Arrays.sort(a);
//        System.out.println("Second Largest Element "+a[a.length-2]);
//        System.out.println("Second Smallest Element "+a[1]);

        // Better Approch
//
////      Edge case: when the array has less than 2 elements
//        if (n == 0 || n == 1) {
//            System.out.println(-1 + " " + -1);  // Print -1 for both second smallest and second largest
//            return;
//        }
//
////      Initialize variables to track the smallest, second smallest, largest, and second largest elements
//        int small = Integer.MAX_VALUE, second_small = Integer.MAX_VALUE;
//        int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;
//
////      Find the smallest and largest elements in the array
//        for (int i = 0; i < n; i++) {
//            small = Math.min(small, arr[i]);  // Update the smallest element
//            large = Math.max(large, arr[i]);  // Update the largest element
//        }
//
////      Find the second smallest and second largest elements
//        for (int i = 0; i < n; i++) {
//            if (arr[i] < second_small && arr[i] != small) {
//                second_small = arr[i];  // Update second smallest if a smaller element is found
//            }
//            if (arr[i] > second_large && arr[i] != large) {
//                second_large = arr[i];  // Update second largest if a larger element is found
//            }
//        }
//
////      Output the second smallest and second largest elements
//        System.out.println("Second smallest is " + second_small);
//        System.out.println("Second largest is " + second_large);

        // Optimal Approch

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        // Edge case: if the array has fewer than 2 elements
        if (n < 2){
            small=-1;
            second_small=-1;
        }
        // Loop through the array to find the second smallest element
        for (int i = 0; i < n; i++) {
            // Update the smallest and second smallest values
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }


        int large = Integer.MIN_VALUE, second_large = Integer.MIN_VALUE;

        // Loop through the array to find the second largest element
        for (int i = 0; i < n; i++) {
            // Update the largest and second largest values
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
    }
}
