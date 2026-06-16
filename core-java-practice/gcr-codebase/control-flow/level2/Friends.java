import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        int akbarAge = sc.nextInt();
        int anthonyAge = sc.nextInt();

        double amarHeight = sc.nextDouble();
        double akbarHeight = sc.nextDouble();
        double anthonyHeight = sc.nextDouble();

        // Youngest
        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Amar is Youngest");
        else if (akbarAge < anthonyAge)
            System.out.println("Akbar is Youngest");
        else
            System.out.println("Anthony is Youngest");

        // Tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Amar is Tallest");
        else if (akbarHeight > anthonyHeight)
            System.out.println("Akbar is Tallest");
        else
            System.out.println("Anthony is Tallest");
    }
}