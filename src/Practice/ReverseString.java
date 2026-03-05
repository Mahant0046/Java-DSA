package StriverDSA.src.Practice;

public class ReverseString {
    public static void main(String[] args) {
        String s="Hello";
//        String Original=s;
//        int len=s.length();
//        String reverse="";
//        while (len>0){
//            reverse+=s.charAt(len-1);
//            len--;
//        }
//        System.out.println(reverse);
//

        char chars[]=s.toCharArray();
        int left=0,right=s.length()-1;
        while (left<right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        String reverse=new String(chars);
        System.out.println(reverse);
    }
}


