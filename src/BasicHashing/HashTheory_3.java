/*
In the previous codes we seen the hashing of integer values in this
section we learn about hashing of charcters

in order to get the count of each charcter in the string we have to use hash table of the 256(total number of charcters in ASCII)


 */


package BasicHashing;


public class HashTheory_3 {
    public static void main(String[] args) {
        String str="ABCBEA";

        //prepare table upto the maximum of the array
        int[] hash=new int[256];
        for (int i = 0; i <str.length(); i++) {
            int c=str.charAt(i);
            hash[c]++;
        }

        // Reading the queries
        char[] chars={'A','c','E','B'};

        // Fecthing the count of each query charcter
        for (int i = 0; i < chars.length ; i++) {
            System.out.println("Count of "+chars[i] +" is "+hash[chars[i]]);

        }


    }
}
