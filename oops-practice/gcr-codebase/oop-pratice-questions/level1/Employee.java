import java.util.*;
public class Employee
{
    String name;
    int id;
    double salary;
    
    Employee(String name,int id,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displaydetails()
    {
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);
    }
    public static void main(String args[])
    {
        Employee e1=new Employee("Madhav", 101, 50000.50);
        e1.displaydetails();
    }
}