package BasicRecurrsion;

public class printName {
    public static void main(String[] args) {
        print("Mahantesh",0,5);
    }

    public static void print(String name,int count,int n){
        if (count==n)
            return;
        else {
            print(name, count++,n-1);
            System.out.println(name+n);
        }
    }

}
