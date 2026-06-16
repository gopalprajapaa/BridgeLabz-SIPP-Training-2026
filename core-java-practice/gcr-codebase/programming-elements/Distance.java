import java.util.*;
public class Distance{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int feet=in.nextInt();
        double yard=feet/3.0;
        double mile=yard/1760.0;
        System.out.println("The distance in yards is "+yard+" while the distance in miles is "+mile);

    }
}