package Arrays.Medium;

import java.util.HashMap;
import java.util.Optional;

public class MajorityElement {
    public static int BruteForce(int []a){
        int count=0;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if (a[i]==a[j]){
                    count++;
                }
                if (count>(a.length)/2)
                    return a[j];
            }
            count=0;
        }
        return -1;
    }


    public static int Better(int arr[]){

        int n= arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < n ; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1 );
        }
        for (int key : hm.keySet())
        {
            System.out.println("Key "+key+":"+hm.get(key));
        }
        for (int key: hm.keySet()){
            if (hm.get(key)> n/2){
                return key;
            }
        }

        return -1;
    }

    public static int Optimal(int []nums){
        // Size of the given array
        int n = nums.length;

        // Count variable
        int cnt = 0;

        // Candidate element
        int el = 0;

        // Step 1: Find the potential majority element
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // Step 2: Verify the candidate
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }

        // Return the element if it's a majority
        if (cnt1 > (n / 2)) {
            return el;
        }

        // No majority found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 0, 0, 0, 7,8,0};
//        int result=BruteForce(arr);
//        int result=Better(arr);
        int result= Optimal(arr);
        System.out.println(result);
    }
}
