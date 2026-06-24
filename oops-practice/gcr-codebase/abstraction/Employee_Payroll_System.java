abstract class Employee
{
   private int employeeId;
   private String employeeName;

   public int getemployeeId()
   {
    return employeeId;
   }

   public void setemployeeId(int employeeId)
   {
    this.employeeId=employeeId;
   }

   public String getemployeeName()
   {
    return employeeName;
   }

   public void setemployeeName(String employeeName)
   {
    this.employeeName=employeeName;
   }
   
   abstract double calculateSalary();

   public void displayDetails()
   {
       System.out.println("the id of the employee is: "+employeeId);
       System.out.println("the name of the employee is :"+employeeName);
   }
}



class FullTimeEmployee extends Employee{

    private double monthly_salary;
     
    public double getmonthly_salary()
    {
        return monthly_salary;
    }

    public void setmonthly_salary(double monthly_salary)
    {
        this.monthly_salary=monthly_salary;
    }

    @Override
    double calculateSalary()
    {
        return monthly_salary;
    }

}


class PartTimeEmployee extends Employee{

    private int hoursworked;
    private double hourlyrate;
     
    public int gethoursworked()
    {
        return hoursworked;
    }

    public void sethoursworked(int hoursworked)
    {
        this.hoursworked=hoursworked;
    }

    public double gethourlyrate()
    {
        return hourlyrate;
    }

    public void sethourlyrate(double hourlyrate)
    {
        this.hourlyrate=hourlyrate;
    }

    @Override
    double calculateSalary()
    {
        return hoursworked*hourlyrate;
    }

}




public class Employee_Payroll_System
{

}