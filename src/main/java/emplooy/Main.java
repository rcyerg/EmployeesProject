package emplooy;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob", true);

        employee.setEmploymentStatus(false);
        System.out.println(employee.isCurrentlyEmployed);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Tim", true, 40, 15.50d);
        hourlyEmployee.calculateWeeklyRate();
        hourlyEmployee.setEmploymentStatus(false);
        System.out.println(hourlyEmployee.isCurrentlyEmployed);

        CommissionEmployee commissionEmployee = new CommissionEmployee("John", true, 439_400.95d, 0.025f);
        commissionEmployee.totalCommissionValue();
        hourlyEmployee.setEmploymentStatus(false);
        System.out.println(commissionEmployee.isCurrentlyEmployed);

        SalariedEmployee salariedEmployee = new SalariedEmployee("Chris", true, 60_000d);
        salariedEmployee.calculateMonthlyRate();
        salariedEmployee.setEmploymentStatus(false);
        System.out.println(salariedEmployee.isCurrentlyEmployed);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Ralph", true, 29_500d, 150_500.85d, 0.025f);
        basePlusCommissionEmployee.totalCommissionValue();
        basePlusCommissionEmployee.finalAnnualSalaryPlusCommissions();
        basePlusCommissionEmployee.setEmploymentStatus(false);
        System.out.println(basePlusCommissionEmployee.isCurrentlyEmployed);


    }
}
