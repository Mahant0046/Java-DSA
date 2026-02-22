package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int []a={2,7,3,4,8,6,1,5};
        sort(a);
    }

    private static void sort(int []nums){

        for (int i = 1; i <nums.length ; i++) {
            int key = nums[i]; // Current element as key
            int j = i - 1;

            // Shift elements that are greater than key by one position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key; // Insert key at correct position
        }

        for (int i:nums){
            System.out.print(i+" ");
        }
    }
}
