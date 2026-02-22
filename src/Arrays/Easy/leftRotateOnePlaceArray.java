package Arrays.Easy;

public class leftRotateOnePlaceArray {
    public static void main(String[] args) {
        int []a={7,3,4,8,6,2,5,10};
        int first=a[0];
        int last=a[a.length-1];

        // Left Rotation
//        for (int i = 1; i <a.length; i++) {
//            a[i-1]=a[i];
//            if (i==a.length-1)
//                a[i]=first;
//        }

        // Right Rotation
        for (int i = a.length-1; i >0; i--) {
            a[i]=a[i-1];
        }
        a[0]=last;

        for (int i:a)
            System.out.print(i+" ");
    }
}
