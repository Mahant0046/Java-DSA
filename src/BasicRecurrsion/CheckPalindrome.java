package BasicRecurrsion;

public class CheckPalindrome {
//          Iterative method
//        // Function to check if a string is a palindrome
//        public static boolean isPalindrome(String s) {
//            int left = 0, right = s.length() - 1;
//
//            // Loop to check if the string is a palindrome
//            while (left < right) {
//                // Skip non-alphanumeric characters on the left side
//                if (!Character.isLetterOrDigit(s.charAt(left)))
//                    left++;
//                    // Skip non-alphanumeric characters on the right side
//                else if (!Character.isLetterOrDigit(s.charAt(right)))
//                    right--;
//                    // If characters are different, it's not a palindrome
//                else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
//                    return false;
//                else {
//                    // Move towards the middle if characters are the same
//                    left++;
//                    right--;
//                }
//            }
//            return true;  // The string is a palindrome if the loop completes
//        }

        public static boolean isPalindrome(String str,int start){
            int end=str.length();
            if (start>=end/2)
                return true;
            if (str.charAt(start)!=str.charAt(end-start-1))
                return false;
            return isPalindrome(str,start+1);
        }

        public static void main(String[] args) {
              // Create an instance of the Solution class
            String str = "ABCDCBA";  // String to check for palindrome

            // Check if the string is a palindrome using the Solution class
            boolean ans = isPalindrome(str,0);

            // Output the result
            if (ans) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }
