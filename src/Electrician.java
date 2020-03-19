public class Electrician extends Worker {
    private double wiringCosts;

    //Constructor
    public Electrician(String firstName, String lastName, Address homeAddress) {
        super(firstName, lastName, homeAddress);
    }

    public void setWiringCosts(double wiringCosts) {
        this.wiringCosts = wiringCosts;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + wiringCosts;
    }

    @Override
    public String toString() {
        return super.toString() + doWork() + ", Wireing cost: " + wiringCosts + "Total: " + calculatePay();
    }

    @Override
    public String doWork() {
        return "Do electrician work";
    }
}
