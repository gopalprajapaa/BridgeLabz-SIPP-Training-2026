public class Course {
    
    String courseName;
    int duration;
    double fee;

    static String instituteName;

    Course(String courseName,int duration,double fee)
    {
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    void displayCourseDetails()
    {
        System.out.println("the name of the course is: "+courseName);
        System.out.println("the duration of the course is: "+duration);
        System.out.println("the fee of the course is: "+fee);
    }

    static void updateInstituteName(String newinstituteName)
    {
        instituteName=newinstituteName;
        System.out.println("the updated institute name is: "+instituteName);
    }

    public static void main(String args[])
    {
        Course c1=new Course("B.tech", 4, 180000.0);
        c1.displayCourseDetails();
        Course.updateInstituteName("GL Bajaj Collage");
    }
}
