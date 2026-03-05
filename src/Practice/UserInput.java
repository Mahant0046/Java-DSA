package StriverDSA.src.Practice;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.Console;
// import java.util.Scanner;
// import java.io.DataInputStream;

class UserInput{
    public static void main(String args[]){

        //Using Scanner
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Your Name");
        // String Name=sc.nextLine();
        // System.out.println("Enter Your age");
        // int age=sc.nextInt();
        // System.out.println("Enter Your Salary");
        // float Salary=sc.nextFloat();
        // System.out.println("Enter Your Marrital Status");
        // boolean Married =sc.nextBoolean();

        // System.out.println("Name:  "+Name);
        // System.out.println("Age:  "+age);
        // System.out.println("Salary:  "+Salary);
        // System.out.println("Married:  "+Married);
        // sc.close();

        // Using BufferReader
        //    BufferedReader bf=new BufferedReader(
        //         new InputStreamReader(System.in)
        //     );
        //     try {
        //     System.out.println("Enter Your Name");
        //     String Name=bf.readLine();
        //     System.out.println("Eneter Your age");
        //     int age=Integer.parseInt(bf.readLine());
        //     System.out.println("Enter Your Salary");
        //     float Salary=Float.parseFloat(bf.readLine());
        //     System.out.println("Are you Married");
        //     boolean status=Boolean.parseBoolean(bf.readLine());

        //     System.out.println("Name:"+Name+"age:"+age+"Salary:"+Salary+"Married:"+status);

        //         bf.close();
        //    }
        //    catch(Exception e){
        //       System.out.println(e);
        //    }


        // Using Console class
        // Console console = System.console();

        // if (console == null) {
        //     System.out.println("Console is not supported");
        //     System.exit(1);
        // }

        // System.out.print("Enter your name: ");
        // String name = console.readLine();

        // System.out.print("Enter your age: ");
        // int age = Integer.parseInt(console.readLine());

        // System.out.print("Enter your salary: ");
        // double salary = Double.parseDouble(console.readLine());

        // System.out.println(name);
        // System.out.println(age); 
        // System.out.println(salary);

        // System.out.print("Enter password: ");
        // char[] password = console.readPassword();
        // String pwd = new String(password);
        // System.out.println(pwd);

        //command line arguments


    }
}




// | Method          | Best For                        | Advantages                                    | Disadvantages                          |
// | --------------- | ------------------------------- | --------------------------------------------- | -------------------------------------- |
// | Scanner         | General console input           | Easy to use, supports multiple types          | Slightly slower than BufferedReader    |
// | BufferedReader  | Efficient bulk input            | Fast, buffered reading                        | Complex wrapping code, manual parsing  |
// | Console         | Interactive console apps        | Password support, synchronized, printf syntax | Does not work in IDEs, returns null    |
// | DataInputStream | Binary file input (not console) | Direct binary reading                         | Produces junk values for console input |
// | JOptionPane     | GUI applications                | User-friendly dialogs                         | Requires Swing, not for console apps   |