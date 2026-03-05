package StriverDSA.src.LinearSearch;

import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print("Enter what you are searching for:");
        char k=sc.next().charAt(0);
        if(stringSearch(s,k))
            System.out.println("charcter found in a string");
        else
            System.out.println("Charcter not found in a string");
    }
    static boolean stringSearch(String s,char k)
    {
        for (char c:s.toCharArray())
        {
            if(c==k)
              return true;
        }
        return false;

    }
}
