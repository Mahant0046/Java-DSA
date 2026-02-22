package Arrays.Medium;

import java.util.Optional;

public class StockBuyAndSell {

    public static void BruteForce(int []prices){
        // Initialize max profit to 0
        int maxProfit = 0;

        // Loop through each day as a potential buy day
        for (int i = 0; i < prices.length; i++) {
            // Loop through each future day as a potential sell day
            for (int j = i + 1; j < prices.length; j++) {
                // Calculate profit
                int profit = prices[j] - prices[i];

                // Update max profit if higher
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        System.out.println(maxProfit);
    }


    public static void Better(int []nums){

        int min=Integer.MAX_VALUE;
        int pos=0;
        int maxProfit=0;
        for (int i = 0; i < nums.length; i++) {
            if (min>nums[i]){
                min=nums[i];
                pos=i;
            }
        }
        for (int i = pos+1; i <nums.length ; i++) {
            int profit = nums[i]-min;

            maxProfit = Math.max(maxProfit, profit);
        }

        System.out.println(maxProfit);

    }

    public static void Optimal(int []nums){
        int maxProfit=0;
        int min=nums[0];

        for (int i = 1; i <nums.length ; i++) {
            int profit=nums[i]-min;
            maxProfit=Math.max(maxProfit,profit);
            min=Math.min(min,nums[i]);
        }

        System.out.println(maxProfit);
    }


    public static void main(String[] args) {
        int []nums={7,6,4,3,1};
//        BruteForce(nums);
//        Better(nums);
        Optimal(nums);
    }
}
