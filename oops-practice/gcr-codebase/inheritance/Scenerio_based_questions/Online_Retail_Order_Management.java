import java.time.LocalDate;
import java.util.*;

class Order{
   
    int orderID;
    LocalDate orderDate;

    Order(int orderID,LocalDate orderDate)
    {
        this.orderID=orderID;
        this.orderDate=orderDate;
    }

      String getOrderStatus() {
        return "Order Placed";
    }

}


class ShippedOrder extends Order{

    int trackingNumber;

    ShippedOrder(int orderID,LocalDate orderDate,int trackingNumber)
    {
        super(orderID, orderDate);
        this.trackingNumber=trackingNumber;
    }


    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}


class DeliveredOrder extends ShippedOrder{
    
    LocalDate deliveryDate;

    DeliveredOrder(int orderID,LocalDate orderDate,int trackingNumber,LocalDate deliveryDate)
    {
        super(orderID, orderDate, trackingNumber);
        this.deliveryDate=deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }

    void displayInfo()
    {
        System.out.println("the order id is: "+orderID);
        System.out.println("the order date is: "+orderDate);
        System.out.println("the order tracking Number  is: "+trackingNumber);
        System.out.println("the delivery date  is: "+deliveryDate);
        System.out.println("Status          : " + getOrderStatus());
    }

}





public class Online_Retail_Order_Management {
    public static void main(String args[])
    {
        DeliveredOrder order=new DeliveredOrder(101,LocalDate.of(2005,04,8), 132, LocalDate.of(2005,04,11));
        order.displayInfo();
    }
}
