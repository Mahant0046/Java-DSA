package StriverDSA.src.LinearSearch;

import java.util.ArrayList;
import java.util.Scanner;

class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        ArrayList<Integer> a= new ArrayList<>();
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < size ; i++) {
            a.add(sc.nextInt());
        }
        linearSearch(a);

    }
    static public void linearSearch(ArrayList<Integer> a)
    {
        int key;
        System.out.println("Enter the key element");
        Scanner sc=new Scanner(System.in);
        key=sc.nextInt();
        sc.close();
        for (int b : a) {
            if (key == b) {
                System.out.println("Item found");
                return;
            }
        }
        System.out.println("Item not found");

    }
}
