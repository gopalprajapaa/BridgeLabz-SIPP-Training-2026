public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void BookTicket(String movieName,int seatNumber,double price)
    {
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;

        System.out.println("Ticket booked Successfully");
    }
    
    void ticketdetails()
    {
        System.out.println("the movie name is: "+movieName);
        System.out.println("the seatNumber is: "+seatNumber);
        System.out.println("the price of the movie is: "+price);
    }
    
    public static void main(String args[])
    {
        MovieTicket t1=new MovieTicket();
        t1.BookTicket("Radhe", 101, 100.50);
        t1.ticketdetails();
    }
}
