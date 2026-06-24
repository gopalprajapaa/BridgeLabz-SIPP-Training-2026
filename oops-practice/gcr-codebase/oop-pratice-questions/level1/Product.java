public class Product {

    String productName;
    double price;

    static int totalproducts=0;

    Product(String productName,double price)
    {
        this.productName=productName;
        this.price=price;
        totalproducts++;
    }
    void productdetails()
    {
    System.out.println("the name of the product is: "+productName);
    System.out.println("the price of the product is: "+price);
    }

    static void displaytotalproducts()
    {
        System.out.println("the total no. of products are: "+totalproducts);
    }

    public static void main(String args[])
    {
        Product p1=new Product("soap", 50.50);
        Product p2=new Product("oil", 500.50);
        p2.productdetails();;
        displaytotalproducts();
    }

}
