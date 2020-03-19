import java.time.LocalDate;
import java.util.ArrayList;

public class Project {

    //Variables
    private String projectName, customer;
    private double overheadPercent;
    private LocalDate startDate, endDate;
    private Address projectAddress;


    //Constructors with and without dates
    public Project(String projectName, String customer, double overheadPercent, Address projectAddress) {
        this.projectName = projectName;
        this.customer = customer;
        this.overheadPercent = overheadPercent;
        this.projectAddress = projectAddress;
    }
    public Project(String projectName, String customer, double overheadPercent, LocalDate startDate, LocalDate endDate, Address projectAddress) {
        this.projectName = projectName;
        this.customer = customer;
        this.overheadPercent = overheadPercent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectAddress = projectAddress;
    }

    //Getters
    public String getName() {
        return projectName;
    }
    public String getCustomer() {
        return customer;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public Address getProjectAddress() {
        return projectAddress;
    }
    public double getOverhead(){
        return calculateWorkerCost() * (overheadPercent/100);
    }
    public double getWorkerCost() {
        return calculateWorkerCost();
    }
    public double getTotalCost(){
        return getOverhead() + calculateWorkerCost();
    }

    //Declare an array and function to add workers to array
    ArrayList<Worker> workers = new ArrayList<Worker>();
    public void addWorker(Worker a, double hoursWorked, double hourlyRate){
        a.setHoursWorked(hoursWorked);
        a.setHourlyRate(hourlyRate);
        workers.add(a);
    }


    //Function to calculate workers total cost
    private  double calculateWorkerCost(){
        double workerCost = 0.0d;
        for(int i = 0; i < workers.size(); i++){
            workerCost += workers.get(i).calculatePay();
        }
        return workerCost;
    }

    //Static print out info function
    static public void projectInfo(Project a){
        System.out.println("Project name: " + a.getName());
        System.out.println();
        System.out.println("Costumer: " + a.getCustomer());
        System.out.println("Address: " + a.getProjectAddress());
        if(a.getStartDate() != null) {
            System.out.println("Start date: " + a.getStartDate());
            System.out.println("End date: " + a.getEndDate());
        }
        System.out.println();
        System.out.println("Total cost: " + a.getTotalCost());
        System.out.println("Worker cost: " + a.getWorkerCost());
        System.out.println("Overhead cost: " + a.getOverhead());
        System.out.println();
        System.out.println("Workers: ");
        for(int i = 0; i < a.workers.size(); i++){
            System.out.println(a.workers.get(i).toString());
        }
        System.out.println();
        System.out.println();
    }

    //Function to know which project starts first
    static public void firstProject(Project a, Project b){
        if(a.getStartDate().compareTo(b.startDate) > 0){
            System.out.println("Project " + b.getName() + " starts before project " + a.getName());
        }else if(b.getStartDate().compareTo(a.startDate) > 0){
            System.out.println("Project " + a.getName() + " starts before project " + b.getName());
        }else{
            System.out.println("Project " + b.getName() + " starts at the same time as project " + a.getName());
        }
    }

}
