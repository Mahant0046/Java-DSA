package StriverDSA.src.LogicBuilding;

class checkPalindrome {
    public static void main(String[] args) {
        String str="Mahantesh";
        String rev = "";
        int n = str.length();
        int i = 0;
        while (i < n) {
            rev += str.charAt(n - 1 - i);
            i++;
        }
        if (rev.equals(str))
            System.out.println("Is Palindrome ");
        else
            System.out.println("Not Palindrome");
    }
}