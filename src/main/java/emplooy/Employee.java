package emplooy;

public class Employee {


    protected String name;
    protected boolean isCurrentlyEmployed;




    public Employee(){

    }

    public Employee (String name, boolean isCurrentlyEmployed){
        this.isCurrentlyEmployed = isCurrentlyEmployed;
    }


    public void setEmploymentStatus(boolean isCurrentlyEmployed){
        this.isCurrentlyEmployed = isCurrentlyEmployed;
    }

}
