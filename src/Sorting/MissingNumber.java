package StriverDSA.src.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        int num=MissingN(arr);
        System.out.println("Missing Number is: "+num);
    }
    public static int MissingN(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        {
            //here element index and values are same
            int actual=arr[i];

            //checking whether element is greater than array size and checking the index and element
            if (actual<arr.length && arr[actual]!=arr[i])
                //if actual index is not matching with index swap the element with correct index
                swap(arr,i,actual);
            else
                //otherwise go with next element
                i++;
        }

        //search for first missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j)
                return arr[j];
        }

        //if the array size is 2 and the array elements are 0,1 then the missing number is arr.length which is size only 2
        return arr.length;
    }
    public static void swap(int[] arr,int s,int e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
