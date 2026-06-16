import java.util.*;
public class Price{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int up=in.nextInt();
        int q=in.nextInt();
        int p=up*q;
        System.out.println("The total purchase price is INR "+p+" if the quantity "+ q+" and unit price is "+up);

    }
}
