public class Item
{
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode,String itemName,double price)
    {
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }

    void itemdetails()
    {
        System.out.println("the itemCode is: "+itemCode);
        System.out.println("the itemName is: "+itemName);
        System.out.println("the price is: "+price);
    }

    void calcost(int q)
    {
        double cost=price*q;
        System.out.println("the cost of the item is: "+cost);
    }

    public static void main(String args[])
    {
        Item i1=new Item(123,"book",500.25);

        i1.itemdetails();
        i1.calcost(2);
    }

}