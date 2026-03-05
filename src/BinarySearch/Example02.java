package StriverDSA.src.BinarySearch;

//find a starting and ending position of a target
public class Example02 {
    public static void main(String[] args) {
        int[] a={1,4,7,7,7,8,8,8,9};
        int[] ans={-1,-1};
        ans[0]=binaryS(a,7,true);
        if (ans[0]!=-1)
            ans[1]=binaryS(a,7,false);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int binaryS(int[] arr,int target,boolean flag)
    {
        int ans=-1;
        int l=0;
        int h= arr.length-1;
        while (l<=h)
        {
            int mid=l+(h-l)/2;
            if (arr[mid]<target)
                l=mid+1;
            else if (arr[mid]>target)
                h=mid-1;
            else
            {
               ans=mid;
               if (flag)
                 h=mid-1;
               else
                 l=mid+1;
            }

        }
        return ans;


    }


}

