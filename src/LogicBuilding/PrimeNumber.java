package StriverDSA.src.LogicBuilding;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=71,flag=0;
//        for (int i = 2; i < num; i++) {
//            if(num%i==0)
//                flag=1;
//
//        }
        // OR

        if (num<=1) flag=1;
        if (num== 2) flag=0;
        if (num%2==0) flag=1;
        int limit= (int) Math.sqrt(num);
        for (int i = 3; i <limit ; i++) {
            if (num%i==0) flag=1;
        }

        if (flag==1)
            System.out.println("Number is Not Prime");
        else
            System.out.println("Number is Prime");

        printPrimeNumbers(300);
    }

    public static boolean checkPrime(int num){
        int flag=0;
        if (num<=1) flag=1;
        else if (num== 2) flag=0;
        else if (num%2==0) flag=1;
        int limit= (int) Math.sqrt(num);
        for (int i = 3; i <=limit ; i++) {
            if (num%i==0) flag=1;
        }

        if (flag==1)
            return false;
        else
            return true;
    }


    public static void printPrimeNumbers(int num){
        for (int i = 1; i <num ; i++) {
            if (checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

}

 // OR

//public class PrimeNumbers {
//    public static void main(String[] args) {
//        int num = 20;  // Define the upper limit
//        int count;  // Initialize counter for divisibility checks
//
//        // Iterate from 1 up to 'num' to identify prime numbers
//        for (int i = 1; i <= num; i++) {
//            count = 0;  // Reset counter for each 'i'
//
//            // Check for divisibility from 2 up to i/2
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    count++;  // Increment if 'i' is divisible by 'j'
//                    break;  // Exit loop if a divisor is found
//                }
//            }
//
//            // If the count is 0, 'i' is prime
//            if (count == 0) {
//                System.out.println(i);  // Output the prime number
//            }
//        }
//    }
//}
