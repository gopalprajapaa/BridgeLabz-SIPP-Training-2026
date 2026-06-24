class Book{
    public int ISBN;
    protected String title;
    private String author;

    Book(int ISBN,String title,String author)
    {
        this.ISBN=ISBN;
        this.title=title;
        this.author=author;
    }

    public String getauthor()
    {
        return author;
    }

    public void setauthor(String author)
    {
        this.author=author;
    }
}

class Ebook extends Book{
   
    Ebook(int ISBN,String title,String author)
    {
     super(ISBN,title,author);
    }
     void displayDetails()
     {
        System.out.println("the ISBN no. of the book is: "+ISBN);
        System.out.println("the title of the book is: "+title);
        System.out.println("the author of the book is: "+getauthor());
     }
}

public class LibraryManagementSystem {
    public static void main(String args[])
    {
    Ebook book1=new Ebook(12345,"the legend of hanuman","gopal");
    book1.displayDetails();
    }
}
