public class Worker {

    //Variable
    private String firstName, lastName;
    private Address homeAddress;
    private double hoursWorked, hourlyRate;

    //Constructor
    public Worker(String firstName, String lastName, Address homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }


    //Setters
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    //Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }


    public double calculatePay(){
        return hoursWorked * hourlyRate;
    }

    public String doWork(){
        return "Worker";
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName +
                ", Home Address: " + homeAddress +
                ", Hours Worked: " + hoursWorked +
                ", Hourly Rate: " + hourlyRate + " ";
    }
}
