package StriverDSA.src.BinarySearch;

public class Main {
    public static void main(String[] args) {
       int low ,high,key;
        int[] a={1,2,3,4,6,7,8};
         int f=serchB(a,2);
        if(f==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at location "+f);
    }
    static int serchB(int[] n,int key)
    {
        int l=0;
        int h=n.length-1;
        boolean isAsc=n[l]<n[h];
        int mid;
        while(l<=h)
        {
            mid=(l+h)/2;
            if (n[mid]==key)
                return  mid;
             if(isAsc)
            {
                if (n[mid]>key)
                    h=mid-1;
                else if (n[mid]<key)
                    l=mid+1;
            }
             else
             {
                 if (n[mid]>key)
                     l=mid+1;
                 else if (n[mid]<key)
                     h=mid-1;
             }
        }
        return -1;

    }
}