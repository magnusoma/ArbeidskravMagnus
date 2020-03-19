public class Carpenter extends Worker {
    private double lumberCosts;

    //Constructor
    public Carpenter(String firstName, String lastName, Address homeAddress) {
        super(firstName, lastName, homeAddress);
    }

    public void setLumberCosts(double lumberCosts) {
        this.lumberCosts = lumberCosts;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + lumberCosts;
    }

    @Override
    public String toString() {
        return super.toString() + doWork() + ", Lumber cost: " + lumberCosts + "Total: " + calculatePay();
    }

    @Override
    public String doWork() {
        return "Do carpenter work";
    }
}

