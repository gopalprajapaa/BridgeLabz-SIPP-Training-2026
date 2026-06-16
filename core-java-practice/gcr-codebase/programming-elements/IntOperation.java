import java.util.*;
public class IntOperation{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int r1=a + b *c;
        int r2=a * b + c;
        int r3=c + a / b;
        int r4=a % b + c;

        System.out.println("the results are "+r1+" "+r2+" "+r3+" "+r4);

    }
}
