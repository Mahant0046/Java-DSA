package Arrays.Medium;

public class KadanesAlgorithm {

    public static int BruteForce(int []nums){
          /* Initialize maximum sum with
           the smallest possible integer */
        int maxi = Integer.MIN_VALUE;

        // Iterate over each starting index of subarrays
        for (int i = 0; i < nums.length; i++) {

            /* Iterate over each ending index
               of subarrays starting from i */
            for (int j = i; j < nums.length; j++) {

                /* Variable to store the sum
                   of the current subarray */
                int sum = 0;

                // Calculate the sum of subarray nums[i...j]
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                /* Update maxi with the maximum of its current
                   value and the sum of the current subarray */
                maxi = Math.max(maxi, sum);
            }
        }

        // Return the maximum subarray sum found
        return maxi;
    }


    public static void Better(int []a){
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i < a.length ; i++) {
            sum=0;
            for (int j = 0; j < a.length; j++) {
                sum+=a[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        System.out.println(maxSum);
    }

    public static void Optimal(int []nums){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length ; i++) {
            sum+=nums[i];
            maxSum=Math.max(sum,maxSum);
            if (sum<0){
                sum=0;
            }
        }
        System.out.println(maxSum);
    }

    // Function to find maximum sum of subarrays and print the subarray having maximum sum
    public static int maxSubArray(int[] nums) {

        // Maximum sum
        long maxi = Long.MIN_VALUE;

        // Current sum of subarray
        long sum = 0;

        // Starting index of current subarray
        int start = 0;

        // Indices of the maximum sum subarray
        int ansStart = -1, ansEnd = -1;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            // Update starting index if sum is reset
            if (sum == 0) {
                start = i;
            }

            // Add current element to the sum
            sum += nums[i];

            // Update maxi and subarray indices if current sum is greater
            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            // Reset sum to 0 if it becomes negative
            if (sum < 0) {
                sum = 0;
            }
        }

        // Printing the subarray
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");

        // Return the maximum subarray sum found
        return (int) maxi;
    }

    public static void main(String[] args) {
        int []nums={-2, -3, -7, -2, -10, -4};
//        int result=BruteForce(nums);
//        System.out.println(result);
//        Optimal(nums);
        // Optimal sum along with subarray
         int result=maxSubArray(nums);
        System.out.println(result);
    }
}
