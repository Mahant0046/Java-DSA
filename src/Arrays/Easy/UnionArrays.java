package Arrays.Easy;

import java.util.*;

public class UnionArrays {
    public static void main(String[] args) {
        // Define size of first array
        int n = 10;
        // Define size of second array
        int m = 7;
        // Initialize first array
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Initialize second array
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        int [][]a= new int[2][3];
        a[0]=new int[1];
        a[1]=new int[3];
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);

        // Brute Force Approach
        // Call FindUnion method
//        List<Integer> Union =FindUnion(arr1, arr2, n, m);


//        // Optimal Approach
//        List<Integer> Union =Optimal(arr1, arr2, n, m);
//        System.out.println("Union of arr1 and arr2 is ");
//        // Print all elements of union
//        for (int val : Union)
//            System.out.print(val + " ");
//

    }

    public static List<Integer> FindUnion(int []arr1,int []arr2,int n,int m){

//        // Create TreeMap to store elements in sorted order
//        TreeMap<Integer, Integer> freq = new TreeMap<>();
//        // Loop through first array and store frequency
//        for (int i = 0; i < n; i++)
//            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
//        // Loop through second array and store frequency
//        for (int i = 0; i < m; i++)
//            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
//        // Create a list to store union result
//        List<Integer> Union = new ArrayList<>();
//        // Traverse map keys and add to union list
//        for (int key : freq.keySet())
//            Union.add(key);
//        // Return the union list
//        return Union;

        // Create a TreeSet to store unique sorted elements
        Set<Integer> st = new TreeSet<>();

        // Insert elements from first array
        for (int num : arr1) {
            st.add(num);
        }

        // Insert elements from second array
        for (int num : arr2) {
            st.add(num);
        }

        // Convert set to list
        return new ArrayList<>(st);

    }

    public static List<Integer> Optimal(int []arr1,int []arr2,int n,int m){

        // List to store union elements
        List<Integer> Union = new ArrayList<>();


        // Initialize pointers
        int i = 0, j = 0;

        // Iterate while both arrays have elements
        while (i < n && j < m) {
            // If element in arr1 is smaller
            if (arr1[i] < arr2[j]) {

                // Add if empty or not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;  // Move pointer in arr1
            }
            // If element in arr2 is smaller
            else if (arr2[j] < arr1[i]) {
                // Add if empty or not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;  // Move pointer in arr2
            }
            else {
                // Elements are equal, add once if not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++; j++;  // Move both pointers
            }

        }

        // Append remaining elements from arr1
        while (i < n) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }

        // Append remaining elements from arr2
        while (j < m) {
            if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }

        // Return the union list
        return Union;
    }
}
