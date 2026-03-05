package StriverDSA.src.LogicBuilding;

public class StringReverse {
    public static void main(String[] args) {

        String Original="ABCD";
        String rev="";

        // Using String Concatenation
//        for (int i = Original.length()-1; i >=0 ; i--) {
//            rev+=Original.charAt(i);
//        }
            int len=Original.length();
            while (len>0){
                rev+=Original.charAt(len-1);
                len--;
            }

        // Using Char Array
//        char chars[]=Original.toCharArray();
//        int left=0,right=Original.length()-1;
//        while (left<right){
//            char temp=chars[left];
//            chars[left]=chars[right];
//            chars[right]=temp;
//            left++;
//            right--;
//        }
//        rev=String.valueOf(chars);
//



        System.out.println("Original String :"+Original);
        System.out.println("Reversed String :"+rev);

    }
}
