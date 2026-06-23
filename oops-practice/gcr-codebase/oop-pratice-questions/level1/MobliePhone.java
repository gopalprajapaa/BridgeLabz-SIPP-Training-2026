public class MobliePhone {
    String brand;
    String model;
    double price;

    MobliePhone(String brand,String model,double price)
    {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void displaydetails()
    {
        System.out.println("the brand of the phone is: "+brand);
        System.out.println("the model of the phone is: "+model);
        System.out.println("the price of the phone is: "+price);
    }

    public static void main(String args[])
    {
        MobliePhone m1=new MobliePhone("sumsung", "galaxy-200", 24500.50);
        m1.displaydetails();
    }
}
