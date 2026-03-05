package StriverDSA.src.LogicBuilding;

public class SecondLargestElement {
    public static void main(String[] args) {
        int []a={12, 35, 1, 10, 34, 1};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for (int i:a){
            if (i>largest){
                secondLargest=largest;
                largest=i;
            } else if (i>secondLargest && i!=largest) {
                secondLargest=i;
            }
        }
//        Arrays.sort(a);
//        System.out.println(a[a.length-2]);
        System.out.println(secondLargest);
    }
}
