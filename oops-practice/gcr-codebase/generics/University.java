import java.util.*;

abstract class CourseType{

    String course;

    CourseType(String course){

        this.course=course;

    }

    public String toString(){

        return course;

    }

}

class ExamCourse extends CourseType{

    ExamCourse(String c){

        super(c);

    }

}

class AssignmentCourse extends CourseType{

    AssignmentCourse(String c){

        super(c);

    }

}

class ResearchCourse extends CourseType{

    ResearchCourse(String c){

        super(c);

    }

}

class Course<T extends CourseType>{

    T course;

    Course(T course){

        this.course=course;

    }

}

class CourseUtil{

    public static void display(List<? extends CourseType> list){

        for(CourseType c:list)

            System.out.println(c);

    }

}