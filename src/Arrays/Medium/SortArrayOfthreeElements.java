package Arrays.Medium;

import java.util.Arrays;

public class SortArrayOfthreeElements {

    public static void Better(int[] a){
        int count=0,count1=0,count2=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0)
                count++;
            else if (a[i]==1)
                count1++;
            else
                count2++;
        }
//        for (int i = 0; i <count ; i++) {
//            a[i]=0;
//        }
//        for (int i = count; i <count+count1 ; i++) {
//            a[i]=1;
//        }
//        for (int i = count+count1; i < a.length ; i++) {
//            a[i]=2;
//        } OR

         int index=0;
         while (count-->0)
             a[index++]=0;
         while (count1-->0)
            a[index++]=1;
         while (count2-->0)
            a[index++]=2;
    }

    public static void Optimal(int []nums){
// Initialize three pointers: low and mid at 0, high at the end
        int low = 0, mid = 0, high = nums.length - 1;

        // Continue processing until mid crosses high
        while (mid <= high) {
            // If current element is 0, swap with low and move both low and mid forward
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            // If current element is 1, just move mid forward
            else if (nums[mid] == 1) {
                mid++;
            }
            // If current element is 2, swap with high and move only high backward
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }

        }

    }


    public static void main(String[] args) {
      int []nums = {1, 0, 2, 1, 0};
      // BruteForce Approach
      //Arrays.sort(nums);

//        Better(nums);
        Optimal(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
