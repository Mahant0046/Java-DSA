package StriverDSA.src.LogicBuilding;

public class Main {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(5);
//        pattern12();
//        pattern13(5);
//        pattern14(5);
//        pattern15(5);
//        pattern16(5);
    //  pattern17(4);
    //  pattern18(4);
        pattern19(5);

    }
    public  static void pattern1(int n)
    {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static void pattern2(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static void pattern3(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
//
//    public  static void pattern4(int n) {
//        for (int i = 0; i < 2*n-1; i++) {
//            if (i<5) {
//                for (int j = 0; j <= i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//            } else {
//                for (int j = 0; j <2*n-1-i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//
//        }
//    }
            //OR
    public  static void pattern4(int n) {
        for (int i = 0; i < 2*n; i++) {

             int totalcols=i>n?2*n-i:i;
                for (int j = 0; j <totalcols; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    public  static void pattern5(int n)
    {
        for (int i = 0; i <n ; i++) {
            for (int k = 0; k <n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  static void pattern6(int n)
    {
        for (int i = 0; i <n ; i++) {
            for (int k = 0; k <i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static void pattern7(int n)
    {
        for (int i = 0; i <n ; i++) {
            for (int k = 0; k <n-i ; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <2*i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public  static void pattern8(int n)
    {
        for (int i = 0; i <n ; i++) {
            for (int k = 0; k <i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <2*n-2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public  static void pattern9(int n)
    {
        for (int i = 0; i <n ; i++) {
            for (int k = 0; k <n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public  static void pattern10(int n)
    {
        for (int i = 0; i <n ; i++) {
            for (int k = 0; k <i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public  static void pattern11(int n)
    {
        for (int i = 0; i <2*n ; i++) {
            int cols=i<n?n-i:i-n+1;
            int totlaspace=i<n?i:2*n-i-1;
            for (int k = 0; k <totlaspace ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <cols ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public  static void pattern13(int n) {
        for (int i = 0; i < 2*n; i++) {

            int totalcols=i>n?2*n-i:i;
            int totalspace=n-totalcols;
            for (int k = 0; k < totalspace; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <totalcols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern14(int n)
    {
        for (int row = 1; row <=n; row++) {
            for (int k = 0; k <n-row ; k++) {
                System.out.print("  ");
            }
            for (int cols = row; cols >=1 ; cols--) {
                System.out.print(cols+" ");
            }
            for (int j = 2; j <=row ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public  static  void pattern15(int n)
    {
        for (int row = 1; row <=2*n ; row++) {
            int totalcols=row<n?row:2*n-row;
            int totalspace=row<n?2*n-2*row:2*row-2*n;
               for (int cols = 1; cols <=totalcols; cols++)
                    System.out.print("*");
                for (int i = 0; i <totalspace; i++)
                    System.out.print(" ");
                for (int cols = 1; cols<=totalcols ; cols++)
                    System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern16(int n)
    {
        for (int row = 1; row <=2*n; row++) {
            int c=row<n?row:2*n-row;
            for (int k = 0; k <n-c; k++) {
                System.out.print("  ");
            }
            for (int cols = c; cols >=1 ; cols--) {
                System.out.print(cols+" ");
            }
            for (int j = 2; j <=c ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n)
    {
        n=2*n;
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <=n ; col++) {
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n)
    {
        int OrigianalN=n;
        n=2*n;
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n ; col++) {
                int atEveryIndex=OrigianalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    public static void pattern19(int n){
        int a[][]=new int[n+1][n+1];
        for (int i = 0; i <=n ; i++) {

            for (int j =n+1; j >i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                if (i==j || j==0){
                    a[i][j]=1;
                    System.out.print(1 +" ");
                }
                else {
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern20(int n){
        int a[][]=new int[n+1][n+1];
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=i ; j++) {
                if (i==j || j==0){
                    a[i][j]=1;
                    System.out.print(1 +" ");
                }
                else {
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }


}