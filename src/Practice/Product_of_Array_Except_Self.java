package StriverDSA.src.Practice;/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
 */





import java.util.Arrays;
class Solution {
    public static void main (String[] args) {
        int[] nums={1,2,3,4};
        int[] result=productExceptSelf(nums);
        for(int i:result){
            System.out.println(i);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        Arrays.fill(prefix,1);
        Arrays.fill(suffix,1);


        //BRUTE FORCE APPROCH TAKES N2 TIME COMPLEXITY
        // for(int i=0;i<nums.length;i++){
        //     int product=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i!=j){
        //             product*=nums[j];
        //         }
        //     }
        //     result[i]=product;
        // }
        // return result;


        // OPTIMAL APPROCH BUT TAKES EXTRA SPACE
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            result[i]=prefix[i]*suffix[i];
        }

        return result;
    }
}