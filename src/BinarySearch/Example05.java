package StriverDSA.src.BinarySearch;

// Peak index in a mountain array
// find the target position
/*
a=[1,2,3,4,5,3,1]  target=3
output=3
    3 Exist in ,at index=2 and index =5 return the minimum index which is 2
 */
public class Example05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 8, 7, 3, 2};
        //passing the array
        int peak = findPeakIndex(arr);
        int ans1=serchB(arr,3,0,peak);
        int ans2=serchB(arr,3,peak,(arr.length-1));
//        if (ans1!=-1 || ans2!=-1)
//            System.out.println();
//        else if (ans1!=-1 && an)
//            System.out.println(an);
    }

    public static int findPeakIndex(int[] arr) {
        int l = 0;
        int h = arr.length;
        while (l < h) {
            int mid = l + (h - l) / 2;

            if (arr[mid] > arr[mid + 1]) {
                h = mid;
            } else
                l = mid + 1;

        }
        return l;

    }

    static int serchB(int[] arr, int target, int start, int end) {
        int l = start;
        int h = end;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[h]>arr[l])
            {
                if (arr[mid] < target)
                 l = mid + 1;
                else
                  h = mid - 1;

            }
            else
            {
                 if (arr[mid] > target)
                l = mid + 1;
              else
                h = mid - 1;
            }
        }
        return -1;
    }

}
