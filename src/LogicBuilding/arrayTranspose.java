package StriverDSA.src.LogicBuilding;

public class arrayTranspose {
    public static void main(String[] args) {

        int a[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Before Transpose");
        for (int arr[]:a) {
            for (int b:arr)
                System.out.print(b);
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j <a.length ; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

        System.out.println("After Transpose");
        for (int arr[]:a) {
            for (int b:arr)
                System.out.print(b);
            System.out.println();
        }
    }
}
