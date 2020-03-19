import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Makeing address objects for projects and workers
        Address projectAddress1 = new Address("Huldrestigen 6", "Bryne", "Rogaland", "4344");
        Address projectAddress2 = new Address("Storgata 9", "Oslo", "Oslo", "0182");

        Address workerAddress1 = new Address("Storgata 13", "Oslo", "Oslo", "0182");
        Address workerAddress2 = new Address("Torggata 13", "Oslo", "Oslo", "0182");
        Address workerAddress3 = new Address("Prinsensgate 13", "Leilighetnr. 302", "Oslo", "Oslo", "0182");

        //Making date objects
        LocalDate startDate1 = LocalDate.parse("2019-03-12");
        LocalDate endDate1 = LocalDate.parse("2020-03-12");

        LocalDate startDate2 = LocalDate.parse("2019-04-12");
        LocalDate endDate2 = LocalDate.parse("2019-04-14");

        //Project objects
        Project p1 = new Project("House", "Rolf Salte", 18.0d, startDate1, endDate1, projectAddress1);
        Project p2 = new Project("Lights", "Trine Pettersen", 40.0d, startDate2, endDate2, projectAddress2);

        //Worker objects
        Electrician Tore = new Electrician("Tore", "Fransen", workerAddress1);
        Carpenter Pål = new Carpenter("Pål", "Hansen", workerAddress2);
        Plumber Steinar = new Plumber("Steinar", "Kristiansen", workerAddress3);

        //Adding workers to project and setting hours, pay and materiel cost
        p1.addWorker(Tore, 40d, 220d);
            Tore.setWiringCosts(2000d);
        p1.addWorker(Pål, 30d, 234d);
            Pål.setLumberCosts(35000d);
        p1.addWorker(Steinar, 25d, 194d);
            Steinar.setPlumberingCost(15000d);

        //Call print function
        Project.projectInfo(p1);

        //Adding workers to project and setting hours, pay and materiel cost
        p2.addWorker(Tore, 5d, 220d);

        //Call print function
        Project.projectInfo(p2);

        //Call function to find out which project starts first
        Project.firstProject(p1, p2);
    }
}
