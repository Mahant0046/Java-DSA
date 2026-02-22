package Arrays.Easy;

public class isArraySorted {
    public static void main(String[] args) {
        int []a={7,3,4,8,6,2,5,10};
//        int []a={1,2,2,3,4,5,7,8,8};
        System.out.println(isSorted(a));
    }
    public  static boolean isSorted(int []a){
        for (int i = 1; i <a.length ; i++) {
            if (a[i-1]>a[i])
                return false;
        }
        return true;
    }
}
