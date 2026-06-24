class Student {
    
    public int rollNumber;
    protected String name;
    private  double CGPA;

    Student(int rollNumber,String name, double CGPA)
    {
        this.rollNumber=rollNumber;
        this.name=name;
        this.CGPA=CGPA;
    }

    public double getCGPA()
    {
        return CGPA;
    }
    
    public void setCGPA(double newCGPA)
    {
       CGPA=newCGPA;
    }
}

class PostgraduateStudent extends Student{

     String specialization;
     
     PostgraduateStudent(int rollNumber,String name,double CGPA,String specialization)
     {
        super(rollNumber,name,CGPA);
        this.specialization=specialization;
     }
     void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public
        System.out.println("Name: " + name);             // protected
        System.out.println("Specialization: " + specialization);

        // Accessing private member through getter
        System.out.println("CGPA: " + getCGPA());
}
}

public class UniversityManagement {
    public static void main(String[] args) {

        PostgraduateStudent p1 =
                new PostgraduateStudent(101, "Gopal", 8.7, "Computer Science");

        p1.displayDetails();

        // Modifying private CGPA using setter
        p1.setCGPA(9.1);

        System.out.println("\nUpdated CGPA: " + p1.getCGPA());
    }
}
