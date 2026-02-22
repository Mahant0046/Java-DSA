package Arrays.Easy;

public class MissingNumber {

    public static void BruteForce(int []a){

        int OriginalSum=0;
        int max=0;
        int arraySum=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max)
                max=a[i];
        }
        for (int i = 1; i <=max ; i++) {
            OriginalSum+=i;
        }
        for (int i = 0; i <a.length ; i++) {
            arraySum+=a[i];
        }
        System.out.println("Missing Number is "+(OriginalSum-arraySum));
    }


    public static void Better(int []a){
        int n=a.length;
        int OriginalSum=n*(n+1)/2;
        int arraySum=0;
        for (int i = 0; i <a.length ; i++) {
            arraySum+=a[i];
        }
        System.out.println("Missing Number is "+(OriginalSum-arraySum));

    }

     public static void Optimal(int []a){
        int xor1=0;
        int xor2=0;
        for (int i = 0; i <a.length-1 ; i++) {
            xor1^=a[i];
            xor2^=(i+1);
        }
        xor2^=a.length ;
        System.out.println("Missing Number is "+(xor1^xor2));
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,5,6};
//        BruteForce(arr);
//        Better(arr);
          Optimal(arr);
    }
}
