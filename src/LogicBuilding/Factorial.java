package StriverDSA.src.LogicBuilding;

public class Factorial {
    public static void main(String[] args) {
        int fact=1,num=4;

        for (int i = 1; i <=num ; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
