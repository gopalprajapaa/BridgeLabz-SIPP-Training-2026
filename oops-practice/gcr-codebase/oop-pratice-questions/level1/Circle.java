import java.util.*;
public class Circle {
    int radius;
    static final double pi=Math.PI;

    Circle(int radius)
    {
        this.radius=radius;
    }

    void area()
    {
        double ar=pi*radius*radius;
        System.out.println("the area of the circle is: "+ar);
    }

     void circumference()
    {
        double c=2*pi*radius;
        System.out.println("the circumference of the circle is: "+c);
    }
    
    public static void main(String args[])
    {
        Circle c1=new Circle(5);
        c1.area();
        c1.circumference();
    }
}
