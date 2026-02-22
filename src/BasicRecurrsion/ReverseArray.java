package BasicRecurrsion;

public class ReverseArray {
    public static void reverse(int []a,int i,int n){
        if (i>=n/2)
            return;
        int temp=a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;
        reverse(a,i+1,n);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        reverse(a,0,a.length);
        for (int i:a)
            System.out.print(i+" ");
    }
}
