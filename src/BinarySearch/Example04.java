package StriverDSA.src.BinarySearch;

// Peak index in a mountain array
public class Example04 {
    public static void main(String[] args) {
        int[] arr={1,2,3,9,8,7,3,2};
        //passing the array
        int peak=findPeakIndex(arr);
        System.out.println(peak);
    }
    public static int findPeakIndex(int[]arr)
    {
        int l=0;
        int h=arr.length;
        while (l<h)
        {
            int mid=l+(h-l)/2;

             if (arr[mid]>arr[mid+1]) {
            //you are in the decreasing part of array
             //there may be possible that previous element is also greater than mid
                h=mid;
            } else
                //the array is sorted there is no possibility that the element presenting after the mid
                l = mid + 1;

        }
        //after the loop the value of start index and end index equals the loop will break
        return arr[l];

    }
}
