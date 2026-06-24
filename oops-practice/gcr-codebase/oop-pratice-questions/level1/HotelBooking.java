public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking()
    {
        this("Gopal","4bH",3);
        System.out.println("default called :");
    }

    HotelBooking(String guestName,String roomType,int nights)
    {
        System.out.println("parametrized called : ");
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    HotelBooking(HotelBooking room1)
    {
        System.out.println("copy constructer called :");
        this.guestName=room1.guestName;
        this.roomType=room1.roomType;
        this.nights=room1.nights;
    }

    void displaydetails()
    {
        System.out.println("the guest name is : "+guestName);
        System.out.println("the room type is : "+roomType);
        System.out.println("the no. of nights is : "+nights);
    }

    public static void main(String args[])
    {
        HotelBooking room1=new HotelBooking();
        HotelBooking room2=new HotelBooking("rishav","5fd",4);
        HotelBooking room3=new HotelBooking(room2);
        room1.displaydetails();
        room2.displaydetails();
        room3.displaydetails();
    }
}
