package StriverDSA.src.LogicBuilding;

public class CheckDigtEvenOrOdd {
    public static void main(String[] args) {

        int num=12345;
        System.out.println("Total Number of the digits :"+((int)Math.log10(num)+1));
        int totalCount=0;
        int evenCount=0;
        int oddCount=0;
        while(num>0){
            totalCount++;
            if((num/10)%2==0)
                evenCount++;
            else
                oddCount++;
            num/=10;
        }
        System.out.println("Total Number Of the digits :"+totalCount);
        System.out.println("Number of Even Digits :"+evenCount);
        System.out.println("Number of Odd Digits :"+oddCount);
    }
}
