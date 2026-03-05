package StriverDSA.src.BinarySearch;

public class Rectangle {
    private double length;
    private double breadth;
    private double area;

    public Rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    public  void  CalArea()
    {
        area=length*breadth;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Rectangle obj=new Rectangle(20,30);
        obj.CalArea();
    }

}
