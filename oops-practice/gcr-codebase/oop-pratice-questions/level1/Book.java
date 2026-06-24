public class Book {
    String title;
    String author;
    double price;
    boolean availability;

    Book(String title,String author,double price,boolean availability)
    {
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    
    void borrow()
    {
        if(availability==false)
        {
            System.out.println("Not Available Currently");
        }
        else
        {
            System.out.println("Book borrowed Successfully");
            availability=false;
        }
    }

    public static void main(String args[])
    {
        Book book1=new Book("merchant of venice", "wiiliam shakespeare", 450.0, true);
        Book book2=new Book("tempest", "wiiliam shakespeare", 550.0, false);
        book1.borrow();
        book2.borrow();

    }
}
