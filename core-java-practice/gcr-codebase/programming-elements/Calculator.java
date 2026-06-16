import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        float a=in.nextFloat();
        float b=in.nextFloat();

        float add=a+b;
        float sub=a-b;
        float mul=a*b;
        float div=a/b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
}