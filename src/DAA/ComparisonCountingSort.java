package StriverDSA.src.DAA;

//Comparison Counting Sort
public class ComparisonCountingSort {
    public static void main(String[] args) {
        int[] arr={62,31,84,96,19,47};
        sorted(arr);

    }
    public static void sorted(int[] arr)
    {
        int n=arr.length;
        int[] count=new int[n];
        int[] s=new int[n];
        for (int j = 0; j < n; j++) {
            count[j]=0;
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i]<arr[j])
                    count[j]++;
                else
                    count[i]++;
            }
        }
        for (int i = 0; i <n ; i++) {
            s[count[i]]=arr[i];
        }
        for (int a:s)
            System.out.print(a+" ");

    }
}
