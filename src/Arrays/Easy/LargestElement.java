package Arrays.Easy;

public class LargestElement {
    public static void main(String[] args) {
        int []a={7,3,4,8,6,2,5,10};
        int max=a[0];
        for (int i = 1; i < a.length ; i++) {
            if (a[i]>max)
                max=a[i];
        }
        System.out.println(max);
    }
}
