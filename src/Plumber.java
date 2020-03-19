public class Plumber extends Worker {
    private double plumberingCost;

    //Constructor
    public Plumber(String firstName, String lastName, Address homeAddress) {
        super(firstName, lastName, homeAddress);
    }

    public void setPlumberingCost(double plumberingCost) {
        this.plumberingCost = plumberingCost;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + plumberingCost;
    }

    @Override
    public String toString() {
        return super.toString() + doWork() + ", Plumbering cost: " + plumberingCost + "Total: " + calculatePay();
    }

    @Override
    public String doWork() {
        return "Do plumber work";
    }
}
