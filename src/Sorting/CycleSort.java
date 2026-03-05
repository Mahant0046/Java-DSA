package StriverDSA.src.Sorting;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={1,9,7,3,5,8,6,2,4};
        int i=0;
        while (i< arr.length)
        {
            //actual is the actual index of the element
            int actual=arr[i]-1;

            //checking whether index is matching with actual index
            if (arr[actual]!=arr[i])
                //if actual index is not matching with index swap the element with correct index
                swap(arr,i,actual);
            else
                //otherwise go with next element
                i++;
        }
        for (int a:arr)
            System.out.print(a+" ");
    }
    public static void swap(int[] arr,int s,int e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
