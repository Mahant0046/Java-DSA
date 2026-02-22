package Arrays.Medium;

import java.util.Arrays;

public class RotateMatrixBy90Degree {

    private static void BruteForce(int [][]a){
        int n=a.length;
        int [][]ans=new int[n][n];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                ans[j][n-1-i]=a[i][j];
            }
        }

        for (int []row:ans){
            for (int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    private static void Optimal(int [][]a){
        int n=a.length;

        // transpose the matrix
        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

        // reverse each row
        for (int i = 0; i <n ; i++) {
            reverse(a[i]);
        }

    }
    private static void reverse(int []a){
        int i=0,j=a.length-1;
        while (i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}
                    };
//        BruteForce(arr);
        Optimal(arr);

        for (int []row:arr){
            for (int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }
}
