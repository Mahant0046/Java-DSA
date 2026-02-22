package Sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int []a={2,7,3,4,8,6,1,5};
        sort(a);
    }

    private static void sort(int []a){
        for (int i = 0; i < a.length ; i++) {
            int min=i;
            for (int j = i+1; j <a.length ; j++) {
                if (a[j]<a[min]){
                   min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for (int i:a){
            System.out.print(i+" ");
        }
    }

}
