package Arrays.Medium;

import java.util.ArrayList;

public class RearrangeArrayElements {

    public static void BruteForce(int []nums){

        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else
                neg.add(num);
        }
        for (int i = 0; i < nums.length/2 ; i++) {
            nums[2*i]=pos.get(i);
            nums[2*i+1]=neg.get(i);
        }


//        for (int i = 0; i < nums.length ; i++) {
//            if(i%2==0){
//                nums[i] = neg.getFirst();
//                neg.removeFirst();
//            }
//            else {
//                nums[i]=pos.getFirst();
//                pos.removeFirst();
//            }
//        }

        int k=0,j= nums.length/2;

//        for (int i = 0; i < nums.length ; i++) {
//            if(i%2==0){
//                result[i]=nums[k];
//                k++;
//            }
//            else {
//                result[i]=nums[j];
//                j++;
//            }
//        }

        for (int n:nums) {
            System.out.print(n+" ");
        }

    }

    public static void Optimal(int []nums){
        int []result=new int[nums.length];
        int pos=0;
        int neg=1;
        for (int i = 0; i <nums.length ; i++) {
           if (nums[i]>0) {
               result[pos] = nums[i];
               pos+=2;
           }else {
               result[neg] = nums[i];
               neg+=2;
           }

        }

        for (int n:result) {
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,-4,-5,-6};
//        BruteForce(arr);
        Optimal(arr);
    }
}
