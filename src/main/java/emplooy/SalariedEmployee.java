package emplooy;

public class SalariedEmployee extends Employee{

    private double annualSalary;

    public SalariedEmployee(String name, boolean isCurrentlyEmployed, double annualSalary){
        this.name = name;
        this.isCurrentlyEmployed = isCurrentlyEmployed;
        this.annualSalary = annualSalary;
    }

    public void calculateMonthlyRate(){
        System.out.println("Employee " + name + "'s monthly rate is: " + (annualSalary / 12) + "." );
    }
}
