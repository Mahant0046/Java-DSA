package StriverDSA.src.BinarySearch;

public class Ceilarray {
    public static void main(String[] args) {
        int[] arr={-28,13,29,34,49,56};
        int temp=serchB(arr,46);
        if(temp>-1)
            System.out.println("Item found at :"+arr[temp]);
        else
            System.out.println("Item not found");
    }
    static int serchB(int[] arr,int target)
    {
        int l=0;
        int h=arr.length-1;
         while (l<=h)
        {
           int mid=l+(h-l)/2;
            if (arr[mid]==target) {
                return mid;
            } else if (arr[mid] < target)
                l = mid + 1;
            else
                h = mid - 1;
        }
         return l;
    }

}
