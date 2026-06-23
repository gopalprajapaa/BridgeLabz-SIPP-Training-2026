public class Student
{
    String name;
    int rollNumber;
    double marks;

    Student(String name,int rollNumber,double marks)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }

    String cal() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "F";
    }

    void displaydetails()
    {
        System.out.println("the name of the student is: "+name);
        System.out.println("the rollNumber of the student is: "+rollNumber);
        System.out.println("the marks of the student is: "+marks);
        System.out.println("the name of the student is: "+cal());
    }

    public static void main(String args[])
    {
        Student s1=new Student("Arpit", 6, 65.50);
        s1.cal();
        s1.displaydetails();
    }
}