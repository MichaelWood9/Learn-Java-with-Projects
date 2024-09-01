package MesozoicEdenParkManagerCh8;

import java.util.ArrayList;
import java.util.Scanner;

public class MesozoicEdenParkManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Dinosaur> dinosaurs = new ArrayList<>();
    ArrayList<Enclosure> enclosures = new ArrayList<>();
    ArrayList<Guest> guests = new ArrayList<>();
    ArrayList<Guest> vips = new ArrayList<>();

    String[] openingHours = {"Mon: 9:00 - 17:00","Tues: 9:00 - 17:00","Wed: 9:00 - 17:00","Thurs: 9:00 - 17:00","Fri: 9:00 - 17:00","Sat: 9:00 - 17:00","Sun: 9:00 - 17:00"};

    public static void main(String[] args) {
        MesozoicEdenParkManager main = new MesozoicEdenParkManager();
        main.start();
    }
    public void start(){
        Enclosure enclosure1 = new Enclosure("En1");
        Enclosure enclosure2 = new Enclosure("En2");
        enclosures.add(enclosure1);
        enclosures.add(enclosure2);

        while (true){
            displayMenu();
            int choice = scanner.nextInt();
            handleMenuChoice(choice);
        }
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                manageDinosaurs();
                break;

            case 2:
                manageEmployees();
                break;

            case 3:
                manageTickets();
                break;

            case 4:
                checkParkStatus();
                break;

            case 5:
                handleSpecialEvents();
                break;
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }

    public void handleSpecialEvents() {
        HandleSpecialEventsController handleSpecial = new HandleSpecialEventsController();
        handleSpecial.run(guests,vips,openingHours);
    }

    public void checkParkStatus() {
        checkParkStatusController checkParkStatus = new checkParkStatusController();
        checkParkStatus.run(guests,enclosures,employees,openingHours);
    }

    public void manageTickets() {
        ticketController ticketcontroller = new ticketController();
        ticketcontroller.run(guests);
        System.out.println(guests.get(0).getName());
    }

    public void manageEmployees() {
        scanner.nextLine();
        displayEmployeeManageMenu();
        int choice = scanner.nextInt();
        handleEmployeeMenuChoice(choice);

    }

    public void handleEmployeeMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addEmployee();
                break;

            case 2:
                editEmployee();
                break;

            case 3:
                removeEmployee();
                break;

            case 4:
                displayEmployees();
                System.out.println("\t");

                break;

            case 5:
                System.out.println("Exiting Menu...");
                break;
        }
    }

    public void removeEmployee() {
        scanner.nextLine();
        System.out.println("Remove Employee Menu\n");
        displayEmployees();
        System.out.println("\nSelect the number of the Employee you want to remove:");
        int choice = scanner.nextInt();

        employees.remove(choice-1);//removing employee from employee list
        System.out.println("Employee has been removed...");
    }

    public void editEmployee() { 
        scanner.nextLine();
        displayEmployees();
        System.out.println();
        System.out.println("Select the number of the Employee you want to edit: ");

        int choice = scanner.nextInt();
        Employee emp = employees.get(choice-1);

        editEmployeeMenu();
        choice = scanner.nextInt();
        handleEmployeeEditMenuChoice(choice, emp);
    }

    public void handleEmployeeEditMenuChoice(int choice, Employee emp) {
        switch (choice) {
            case 1:
                editEmployeeName(emp);
                break;

            case 2:
                editEmployeeRole(emp);
                break;

            case 3:
                editEmployeeYearsOfExperience(emp);
                break;

            case 4:
                emp.setSchedule(makeSchedule());
                break;

            case 5:
                System.out.println("Exiting Menu...");
                break;
        }
    }

    public void editEmployeeYearsOfExperience(Employee emp) {
        System.out.println("Current Employee years of experience is : " + emp.getYearsExperience()+"\n");
        scanner.nextLine();
        System.out.println("Enter the year of experience for the Employee:  ");
        int newYearsOfExperience = scanner.nextInt();
        emp.setYearsExperience(newYearsOfExperience);
        System.out.println("Employee years of experience has been updated...");
    }

    public void editEmployeeRole(Employee emp) {
        System.out.println("Current Employee role is : " + emp.getJobTitle()+"\n");
        scanner.nextLine();
        System.out.println("Enter the new role of the Employee:  ");
        String newJobTitle = scanner.nextLine();
        emp.setJobTitle(newJobTitle);
        System.out.println("Employee Role has been updated...");
    }

    public void editEmployeeName(Employee emp) {
        System.out.println("Current Employee name is : " + emp.getName()+"\n");
        scanner.nextLine();
        System.out.println("Enter the new name of the Employee:  ");
        String newName = scanner.nextLine();
        emp.setName(newName);
        System.out.println("Employee name has been updated...");

    }

    public void editEmployeeMenu() {
        System.out.println("Edit employee page: ");
        System.out.println("1. Edit Employee name");
        System.out.println("2. Edit Employee Role");
        System.out.println("3. Edit Employee Years of Experience");
        System.out.println("4. Edit Employee Schedule");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
    }

    public void addEmployee() {
        scanner.nextLine();
        System.out.println("Enter Employee name: ");
        String empName = scanner.nextLine();
        System.out.println("Enter Job Title: ");
        String jobTitle = scanner.nextLine();
        System.out.println("Enter years of Experience: ");
        int yearsExperience = scanner.nextInt();

        String[] schedule = makeSchedule();

        Employee emp = new Employee(jobTitle,yearsExperience,empName,schedule);
        employees.add(emp);

        System.out.println("Employee has been added has been added...");

    }

    public String[] makeSchedule() {
        String[] schedule = new String[7];
        scanner.nextLine();
        for(DaysOfTheWeek day : DaysOfTheWeek.values()){
            System.out.println("Enter the schedule hours for " + day.name() +":");
            String workHours = scanner.nextLine();
            schedule[day.ordinal()] = workHours;
        }
        return schedule;
    }

    public void displayEmployeeManageMenu() {
        System.out.println("Manage Employee page.");
        System.out.println("1. Add Employee");
        System.out.println("2. Edit Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. Display Employees");
        System.out.println("5. Exit Menu\n");
        System.out.println("Enter your choice:");
    }

    public void displayEmployees() {
        for(int index = 0; index<employees.size(); index++){
            Employee emp = employees.get(index);
            System.out.println(index+1 + ". "+" Employee name: " + emp.getName() + "\t" + "Job Title: " + emp.getJobTitle() + "\t" + "Years Of Experience: " + emp.getYearsExperience() + "\t Schedule: " + emp.getScheduleToString());
        }
    }

    public void manageDinosaurs() {
        //Dinosaur dino = new Dinosaur("dave","t-rex",16);
        //dinosaurs.add(dino);
        scanner.nextLine();
        displayDinoManageMenu();
        int choice = scanner.nextInt();
        handleDinoMenuChoice(choice);

    }

    public void displayDinos() {
        for(int index = 0; index<dinosaurs.size(); index++){
            Dinosaur dino = dinosaurs.get(index);
            System.out.println(index+1 + ". "+" Dinosaur name: " + dino.getName() + "\t" + "Species: " + dino.getSpecies() + "\t" + "Age: " + dino.getAge() + "\t Enclosure: " + dino.getEnclosure().getName());
        }
    }


    public void displayDinoManageMenu(){
        System.out.println("Manage dinosaurs page.");
        System.out.println("1. Add Dinosaur");
        System.out.println("2. Edit Dinosaur");
        System.out.println("3. Remove Dinosaur");
        System.out.println("4. Display Dinosaurs");
        System.out.println("5. Exit Menu");
        System.out.println("Enter your choice:");
    }

    public void displayMenu() {
        System.out.println("Welcome to Mesozoic Eden Park Manager!");
        System.out.println("1. Manage Dinosaurs");
        System.out.println("2. Manage Park Employees");
        System.out.println("3. Manage Tickets");
        System.out.println("4. Check Park Status");
        System.out.println("5. Handle Special Events");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
    }

    public void handleDinoMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addDinosaur();
                break;

            case 2:
                editDinosaur();
                break;

            case 3:
                removeDinosaur();
                break;

            case 4:
                displayDinos();
                System.out.println("\t");
                displayEnclosures();
                break;

            case 5:
                System.out.println("Exiting Menu...");
                break;
        }
    }

    public void removeDinosaur() {
        scanner.nextLine();
        System.out.println("Remove Dinosaur Menu\n");
        displayDinos();
        System.out.println("\nSelect the number of the dinosaur you want to remove:");
        int choice = scanner.nextInt();

        Dinosaur dino = dinosaurs.get(choice-1); //getting dinosaur object

        dino.getEnclosure().removeDinosaur(dino); // removing dinosaur from the correct enclosure

        dinosaurs.remove(choice-1);//removing dinosaur from dinosaur list
        System.out.println("Dinosaur has been removed...");


    }

    public void editDinosaur() {
        scanner.nextLine();
        displayDinos();
        System.out.println();
        System.out.println("Select the number of the dinosaur you want to edit: ");

        int choice = scanner.nextInt();
        Dinosaur dino = dinosaurs.get(choice-1);

        editDinosaurMenu();
        choice = scanner.nextInt();
        handleDinosaurEditMenuChoice(choice, dino);
    }
    public void handleDinosaurEditMenuChoice(int choice, Dinosaur dino){
        switch (choice) {
            case 1:
                editDinoName(dino);
                break;

            case 2:
                editDinoSpecies(dino);
                break;

            case 3:
                editDinoAge(dino);
                break;

            case 4:
                editDinoEnclosure(dino);
                break;

            case 5:
                System.out.println("Exiting Menu...");
                break;
        }

    }

    public void editDinoEnclosure(Dinosaur dino) {
        scanner.nextLine();
        System.out.println("The dinosaurs current enclosure is :" + dino.getEnclosure().getName() );
        displayEnclosures();
        System.out.println("Select an new Enclosure for the dinosaur");
        dino.getEnclosure().removeDinosaur(dino);
        int choice = scanner.nextInt();
        Enclosure newEnclosure = enclosures.get(choice-1);
        dino.setEnclosure(newEnclosure);
        newEnclosure.addDinosaur(dino);
        System.out.println("Dinosaur enclosure updated...");
    }

    public void editDinoAge(Dinosaur dino) {
        System.out.println("Current Dinosaur age is : " + dino.getAge()+"\n");
        scanner.nextLine();
        System.out.println("Enter the new age of the Dinosaur:  ");
        int newAge = scanner.nextInt();
        dino.setAge(newAge);
        System.out.println("Dinosaur age has been updated...");
    }

    public void editDinoSpecies(Dinosaur dino) {
        System.out.println("Current Dinosaur species is : " + dino.getSpecies()+"\n");
        scanner.nextLine();
        System.out.println("Enter the new species of the Dinosaur:  ");
        String newSpecies = scanner.nextLine();
        dino.setSpecies(newSpecies);
        System.out.println("Dinosaur species has been updated...");
    }

    public void editDinoName(Dinosaur dino) {
        System.out.println("Current Dinosaur name is : " + dino.getName()+"\n");
        scanner.nextLine();
        System.out.println("Enter the new name of the Dinosaur:  ");
        String newName = scanner.nextLine();
        dino.setName(newName);
        System.out.println("Dinosaur name has been updated...");
    }

    public void editDinosaurMenu(){
        System.out.println("Edit dinosaur page: ");
        System.out.println("1. Edit Dinosaur name");
        System.out.println("2. Edit Dinosaur species");
        System.out.println("3. Edit Dinosaur age");
        System.out.println("4. Edit Dinosaur Enclosure");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
    }

    public void addDinosaur() {
        scanner.nextLine();
        System.out.println("Enter Dinosaurs name: ");
        String dinoName = scanner.nextLine();
        System.out.println("Enter Dinosaur species: ");
        String dinoSpecies = scanner.nextLine();
        System.out.println("Enter Dinosaur age: ");
        int dinoAge = scanner.nextInt();
        Enclosure selectedEnclosure = selectEnclosure();

        Dinosaur dino = new Dinosaur(dinoName,dinoSpecies,dinoAge,selectedEnclosure);
        selectedEnclosure.addDinosaur(dino);
        dinosaurs.add(dino);

        System.out.println("Dinosaur has been added...");

    }
    public Enclosure selectEnclosure(){
        scanner.nextLine();
        displayEnclosures();
        System.out.println("Enter the number for the enclosure you want to add the Dinosaur too: ");
        int choice = scanner.nextInt();

        return enclosures.get(choice-1);
    }

    public void displayEnclosures() {
        for(int index = 0; index<enclosures.size(); index++){
            Enclosure enclosure = enclosures.get(index);
            System.out.println(index+1 + ". "+" Enclosure name: " + enclosure.getName() + "\t" + "Number of Dinosaurs in Enclosure: " + enclosure.getDinosaurs().size());
            System.out.println();
        }
    }
}
