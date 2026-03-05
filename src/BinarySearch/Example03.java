package StriverDSA.src.BinarySearch;//Position of an element in infinite sorted array

//assuming that we have the following array
public class Example03 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,6,7,8,9,12,32,34,57,234};
        int target=7;
        System.out.println(Search(a,target));

    }
    public  static int Search(int[] arr,int target)
    {
        //first we are taking the first two elements gradually increase the size of the array
        int s=0;
        int e=1;

        while (arr[e]<target)
        //if there is target present after the after end
        {
            //saving the new start value in the temporary variable
            int ns=e+1;
            //increasing the box size
            e=e+(e-s+1)*2;
            //swapping the value of start from temporary to start
            s=ns;

        }
        //if the element present inside the box then simply apply binary search
        return serchB(arr,target,s,e)+1 ;
    }
    static int serchB(int[] arr,int target,int start ,int end)
    {
        int l=start;
        int h=end;
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
        return -1;
    }
}
