package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int []a={2,7,3,4,8,6,1,5};
        sort(a);
    }

    private static void sort(int []a){
        int flag=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-i ; j++) {
                if (a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                    flag=1;
                }
            }
            if (flag==0)   // if there is no swap then it is already sorted
                break;
        }

        for (int i:a){
            System.out.print(i+" ");
        }
    }
}
