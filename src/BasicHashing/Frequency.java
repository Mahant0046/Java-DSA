package BasicHashing;

public class Frequency {
      // Function to count frequency of each element in the array
        public static void countFreq(int[] arr, int n) {
            // Create a visited array to mark elements that are already processed
            boolean[] visited = new boolean[n];

            // Traverse through all elements of the array
            for (int i = 0; i < n; i++) {
                // Skip this element if it's already processed
                if (visited[i])
                    continue;

                // Count the frequency of arr[i]
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true; // Mark arr[j] as processed
                        count++;
                    }
                }

                // Output the element and its count
                System.out.println(arr[i] + "->" + count);
            }
        }

        public static void main(String[] args) {
            // Input array
            int[] arr = {10, 5, 10, 15, 10, 5};
            int n = arr.length;


            // Call the function to count frequencies
            countFreq(arr, n);
        }
    }


