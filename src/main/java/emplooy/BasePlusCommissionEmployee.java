package emplooy;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double annualSalary;
    public BasePlusCommissionEmployee(String name, boolean isCurrentlyEmployed, double annualSalary, double annualSales, float commissionRate){
        this.name = name;
        this.isCurrentlyEmployed = isCurrentlyEmployed;
        this.annualSalary = annualSalary;
        this.annualSales = annualSales;
        this.commissionRate = commissionRate;
    }

    public void finalAnnualSalaryPlusCommissions(){
        System.out.println("Employee " + name + "'s final annual salary with added commission returns is: " + ((annualSales * commissionRate) + (annualSalary)) + "." );
    }
}
