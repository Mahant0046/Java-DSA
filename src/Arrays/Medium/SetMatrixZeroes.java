package Arrays.Medium;

import java.util.Arrays;

public class SetMatrixZeroes {

    private static void BruterForce(int [][]a){

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if (a[i][j]==0){
                    markTheRow(a,i);
                    marksTheColumn(a,j);
                }
            }
        }

        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if (a[i][j]==-1){
                    a[i][j]=0;
                }
            }
        }
    }
    private static void markTheRow(int [][]a,int row){
        for (int j = 0; j <a[row].length; j++) {
           if (a[row][j]!=0){
               a[row][j]=-1;
           }
        }
    }
    private static void marksTheColumn(int [][]a,int col){
        for (int j = 0; j <a[col].length; j++) {
            if (a[j][col]!=0){
                a[j][col]=-1;
            }
        }
    }
    private static void Better(int [][]a){
        int []row=new int[a.length];
        int []col=new int[a.length];
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if (a[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if (row[i]==1 || col[j]==1){
                    a[i][j]=0;
                }
            }
        }
    }

    private static void Optimal(int [][]a){
        // int col_0=matrix[.. ][0]
        // int row_0=matrix[0][...]
        int col1=1;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a[i].length; j++) {
                if (a[i][j]==0){
                    // mark the matrix ith position
                    a[i][0]=0;
                    // mark the matrix jth position
                    if (j!=0)
                        a[0][j]=0;
                    else
                        col1=0;
                }
            }
        }

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                if (a[i][j]!=0){
                    if (a[i][0]==0 || a[0][j]==0){
                        a[i][j]=0;
                    }
                }
            }
        }
        if (a[0][0]==0 ){
            for (int i = 0; i <a.length ; i++) {
                a[0][i]=0;
            }
        }
        if (col1==0){
            for (int i = 0; i <a.length ; i++) {
                a[i][0]=0;
            }
        }
    }

    public static void main(String[] args) {
        int [][]arr={{1,1,1,1},
                     {1,0,0,1},
                     {1,1,1,1},
                     {1,1,1,1}};
//        BruterForce(arr);
//        Better(arr);
        Optimal(arr);
        for (int []row:arr){
            for (int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
