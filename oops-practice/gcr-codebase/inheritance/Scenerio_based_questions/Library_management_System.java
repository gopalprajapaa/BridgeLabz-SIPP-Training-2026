class Book{

    String title;
    int publicationYear;

    Book(String title,int publicationYear)
    {
        this.title=title;
        this.publicationYear=publicationYear;
    }
}


class Author extends Book{

       String name;
       String bio;

       Author(String title,int publicationYear,String name,String bio)
       {
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
       }

       void displayInfo()
       {
        System.out.println("the title of the book is: "+title);
        System.out.println("the publication year of the book is: "+publicationYear);
        System.out.println("the name of the author is: "+title);
        System.out.println("the bio of the author is: "+title);
       }
}




public class Library_management_System {
    public static void main(String args[])
    {
        Author a1=new Author("Merchant of venice", 2025, "Gopal", "Good Writer");
        a1.displayInfo();

    }
}
