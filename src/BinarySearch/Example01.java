package StriverDSA.src.BinarySearch;

//SMALLEST NUMBER GREATER THAN THE TARGET
public class Example01 {
    public static void main(String[] args) {
        char[] arr={'a','b','c','d'};
        char temp=serchB(arr,'c');
        System.out.println(temp);
    }
    static char serchB(char[] arr,char target)
    {
        int l=0;
        int h= arr.length-1;
        while (l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]<target)
                l=mid+1;
            else
                h=mid-1;
        }
        if (l== arr.length)
            return arr[0];
        else
             return arr[h];
    }

}

