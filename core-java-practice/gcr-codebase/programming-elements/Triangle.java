import java.util.*;
public class Triangle{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        int h=in.nextInt();
        double area=(1/2.0)*b*h;
        double ar_inch=area/2.54;
        System.out.println("The Area of the triangle in sq in is "+ar_inch+" and sq cm is "+ area);
    }
}