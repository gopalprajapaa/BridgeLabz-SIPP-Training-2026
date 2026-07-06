import java.util.*;

abstract class JobRole{

    String role;

    JobRole(String role){

        this.role=role;

    }

    public String toString(){

        return role;

    }

}

class SoftwareEngineer extends JobRole{

    SoftwareEngineer(){

        super("Software Engineer");

    }

}

class DataScientist extends JobRole{

    DataScientist(){

        super("Data Scientist");

    }

}

class ProductManager extends JobRole{

    ProductManager(){

        super("Product Manager");

    }

}

class Resume<T extends JobRole>{

    T role;

    Resume(T role){

        this.role=role;

    }

}

class ResumeUtil{

    public static void screen(List<? extends JobRole> list){

        for(JobRole role:list)

            System.out.println(role);

    }

}

public class Resume{

    public static void main(String[] args){

        List<JobRole> roles=new ArrayList<>();

        roles.add(new SoftwareEngineer());

        roles.add(new DataScientist());

        ResumeUtil.screen(roles);

    }

}