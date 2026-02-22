package BasicRecurrsion;

public class PrintArray {
    public static void print(int []arr,int start,int len){
        if (len==0){
            return;
        }
        System.out.print(arr[start]);
        print(arr,start+1,len-1);

    }
    public static void main(String[] args) {
        int []nums={1,2,3};
//        print(nums,0, nums.length);
        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                for (int k = 0; k < nums.length ; k++) {
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
