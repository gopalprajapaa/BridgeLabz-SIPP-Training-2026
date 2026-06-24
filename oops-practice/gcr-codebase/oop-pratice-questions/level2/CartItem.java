public class CartItem
{
    String itemName;
    double price;
    int quantity;

    void addItem(String itemName,double price,int quantity)
    {
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;

        System.out.println("the item added successfully");
    }
    void removeItem()
    {
        itemName="";
        price=0.0;
        quantity=0;

        System.out.println("the item removed successfully");
    }

    void totalcost()
    {
        double totalc=price*quantity;
        System.out.println("the totalcost is "+totalc);
    }

    public static void main(String args[])
    {
        CartItem i1=new CartItem();
        i1.addItem("laptop", 15500.00, 3);
        i1.totalcost();
    }
}