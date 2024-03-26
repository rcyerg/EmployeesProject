package emplooy;

public class CommissionEmployee extends Employee{

    protected double annualSales;

    protected float commissionRate;

    public CommissionEmployee (){

    }

    public CommissionEmployee(String name, boolean isCurrentlyEmployed, double annualSales, float commissionRate){
        this.name = name;
        this.isCurrentlyEmployed = isCurrentlyEmployed;
        this.annualSales = annualSales;
        this.commissionRate = commissionRate;
    }

    public void totalCommissionValue(){
        System.out.println("Employee " + name + "'s annual commission return is: " + (annualSales * commissionRate) + "." );

    }
}
