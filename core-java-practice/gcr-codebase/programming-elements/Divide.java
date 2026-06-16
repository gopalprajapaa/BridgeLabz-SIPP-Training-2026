import java.util.*;
public class Divide{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int q=a/b;
        int r=a%b;
        System.out.println("The Quotient is "+q+" and Reminder is "+r+"of two number "+a+" and "+b);

    }
}