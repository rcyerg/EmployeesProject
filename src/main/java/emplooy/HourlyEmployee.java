package emplooy;

public class HourlyEmployee extends Employee {

    private int hoursWeekly;
    private double hourlyRate;

    public HourlyEmployee (String name, boolean isCurrentlyEmployed, int hoursWeekly, double hourlyRate){
        this.name = name;
        this.isCurrentlyEmployed = isCurrentlyEmployed;
        this.hoursWeekly = hoursWeekly;
        this.hourlyRate = hourlyRate;
    }

    public void calculateWeeklyRate(){
        System.out.println("Employee " + name + "'s hourly rate is: " + (hoursWeekly * hourlyRate) + "." );
    }
}
