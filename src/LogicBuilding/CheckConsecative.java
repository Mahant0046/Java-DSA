package StriverDSA.src.LogicBuilding;

public class CheckConsecative {
    public static void main(String[] args) {
       SteppingNumber(123);
    }

    public static boolean SteppingNumber(int num){
        String s=String.valueOf(num);
        for (int i = 1; i <s.length() ; i++) {
            int prev=s.charAt(i-1)-'0';
            int curr=s.charAt(i)-'0';
            if (Math.abs(prev-curr)!=1)
                return false;
        }
        return true;
    }
}
