package StriverDSA.src.LogicBuilding;

public class removeAllOccurance {
    public static void main(String[] args) {
        int[] arr={1, 2, 1, 3, 5, 1};
        int key=1;
        int index=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=key){
                arr[index++]=arr[i];
            }
        }
        for (int i = 0; i <index ; i++) {
            System.out.println(arr[i]);
        }
    }
}
