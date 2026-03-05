package StriverDSA.src.Practice;// Maximum Subarray Sum

public class Kadanes_Algoritham {
    public static void main(String[] args) {
        // printing the all subarrays of array
        int arr[]={1,-2,4,5,-1,7,-8};
//        printAllSubarrays(arr);
//        int maxSum=maxSubArray(arr);
          int maxSum=Kadane(arr);
        System.out.println(maxSum);

    }

    public static void printAllSubarrays(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i; j++) {
                for (int k = i; k <arr.length-j ; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public  static int maxSubArray(int arr[]){
        int curSum;
        int maxSum=0;
        for (int start=0 ;start<arr.length;start++){
            curSum=0;
            for (int end=start;end<arr.length;end++){
                curSum+=arr[end];
                maxSum=Math.max(curSum,maxSum );
            }
        }
        return maxSum;
    }

    public static int Kadane(int arr[]){
        int curSum=0,maxSum=0;
        for (int start=0;start<arr.length;start++){
            curSum+=arr[start];
            maxSum=Math.max(maxSum,curSum);
            if (curSum<0){
                curSum=0;
            }
        }

        return maxSum;
    }


}
