import java.util.*;
public class DoubleOp{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double r1=a + b *c;
        double r2=a * b + c;
        double r3=c + a / b;
        double r4=a % b + c;

        System.out.println("the results are "+r1+" "+r2+" "+r3+" "+r4);

    }
}
