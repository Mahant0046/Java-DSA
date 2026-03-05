package StriverDSA.src.LinearSearch;

import java.util.Scanner;

public class Search2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=Integer.parseInt(args[0]);
        int c=Integer.parseInt(args[1]);
        int[][] a=new int[r][c];
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the key to be searched");
        int key=sc.nextInt();
        sc.close();
        search(a,key);
    }
    static void search(int[][] a,int key)
    {
        for (int i=0;i<a.length;i++)
           for (int j=0;j<a[0].length;j++)
               if(key==a[i][j])
               {
                   System.out.println("Item found at"+"["+i+","+j+"]");
                   return;
               }
        System.out.println("Item not found in array");
    }
}
