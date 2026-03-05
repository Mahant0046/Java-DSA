package StriverDSA.src.LinearSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size");
                int size=sc.nextInt();
                ArrayList<Integer> a= new ArrayList<>();
                System.out.println("Enter the Array Elements");
                for (int i = 0; i < size ; i++) {
                    a.add(sc.nextInt());
                }
                findmin(a);

            }
            static public void findmin(ArrayList<Integer> a)
            {
                int min=a.get(0);
                for (int b : a) {
                    if (min>b)
                       min=b;
                }
                System.out.println("Minimum value is"+min);

    }
}
