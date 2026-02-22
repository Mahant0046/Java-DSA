package Arrays.Easy;

import java.util.HashMap;

public class NumberAppearsTwiceExpectOnce {

    public static void BruteForce(int []arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;

            // Count how many times num occurs
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    count++;
            }

            // If only once, return it
            if (count == 1)
                System.out.println(num);
        }
    }

    public static void Better(int arr[]){

//        HashMap<Integer,Integer> hm=new HashMap<>();
//        for (int i = 0; i <a.length ; i++) {
//            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
//        }
//
//        for (int key: hm.keySet()){
//            if (hm.get(key)==1){
//                System.out.println(key);
//                break;
//            }
//        }
        // OR
        int n = arr.length;

        // Step 1: Find maximum element
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Step 2: Create frequency array of size maxi+1
        int[] hash = new int[maxi + 1];

        // Step 3: Count frequencies
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Step 4: Find element with frequency = 1
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                System.out.println(arr[i]);
        }

    }

    public static void Optimal(int []a){
        int xorr = 0;

        // XOR all elements — duplicates cancel each other out
        for (int num : a) {
            xorr ^= num;
        }

        System.out.println(xorr);
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
//        BruteForce(arr);
//        Better(arr);
        Optimal(arr);
    }
}
