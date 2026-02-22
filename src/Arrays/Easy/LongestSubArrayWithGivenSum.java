package Arrays.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubArrayWithGivenSum {
    private static void BruteForce(int []a,int k){
        int sum=0,length=-1;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i; j <a.length ; j++) {
                sum+=a[j];
                if (sum==k){
                    length=Math.max(length,j-i+1);
                }
            }
            sum=0;
        }

        System.out.println(length);
    }

    private static void Better(int []nums,int k){
        int n = nums.length;
        Map<Integer, Integer> preSumMap = new HashMap<>(); // prefix sum -> index
        int sum = 0;       // Running sum
        int maxLen = 0;    // Longest subarray length

        for (int i = 0; i < n; i++) {
            sum += nums[i]; // Update running prefix sum

            // Case 1: If full subarray from 0 to i has sum = k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: If (sum - k) was seen before
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem); // Length of current valid subarray
                maxLen = Math.max(maxLen, len);
            }

            // Store the first occurrence of a prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }
    private static void Optimal(int []nums,int k){
        int n = nums.length;

        // To store the maximum length of the subarray
        int maxLen = 0;

        // Pointers for sliding window
        int left = 0, right = 0;

        // Sum of the current window
        int sum = nums[0];

        // Traverse through the array
        while (right < n) {

            // Shrink the window if sum exceeds k
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            // Update max length if sum equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Expand the window to the right
            right++;
            if (right < n) {
                sum += nums[right];
            }
        }

        System.out.println(maxLen);
    }


    public static void main(String[] args) {
        int []nums = {3,-3,1,1,1};
        int k=3;
//        Better(nums,k);
        Optimal(nums,k);
    }
}
