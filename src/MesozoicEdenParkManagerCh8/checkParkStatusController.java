package MesozoicEdenParkManagerCh8;

import java.util.ArrayList;
import java.util.Scanner;

public class checkParkStatusController {
    ArrayList<Guest> guestsTemp;
    ArrayList<Enclosure> enclosuresTemp;
    ArrayList<Employee> employeesTemp;
    String[] openingHoursTemp;
    Scanner scanner = new Scanner(System.in);

    public void run( ArrayList<Guest> guests,ArrayList<Enclosure> enclosures,ArrayList<Employee> employees,String[] openingHours){
        guestsTemp = guests;
        employeesTemp = employees;
        enclosuresTemp = enclosures;
        openingHoursTemp = openingHours;
        displayMenu();
        int choice = scanner.nextInt();
        handleMenuChoice(choice);

    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                showCurrentParkCapacity();
                break;

            case 2:
                showDinosaurStatus();
                break;

            case 3:
                displayCurrentOpeningHours();
                break;

            case 4:
                showEmployeeStatus();
                break;
            case 5:

                System.out.println("Exiting Menu...");
                break;
        }
    }

    public void showEmployeeStatus() {
        for( int index =0; index < employeesTemp.size(); index++){
            Employee employee = employeesTemp.get(index);

            System.out.println("Employee name: " + employee.getName()+ "\t" +"Job title: "+ employee.getJobTitle()+ "\t" +"Years experience: "+ employee.getYearsExperience());
        }
        scanner.nextLine();
    }

    public void displayCurrentOpeningHours() {
        System.out.println("Current opening hours are:");
        for(String openingTimes: openingHoursTemp){
            System.out.println(openingTimes);
        }
        scanner.nextLine();
    }

    public void showDinosaurStatus() {
        for( int index =0; index < enclosuresTemp.size(); index++){
            Enclosure enclosure = enclosuresTemp.get(index);
            System.out.println("Dinosaur statuses for "+ enclosure.getName() + ": ");
            ArrayList<Dinosaur> dinosaurs = enclosure.getDinosaurs();
            for( int indexDino = 0; indexDino < dinosaurs.size(); indexDino++){
                Dinosaur dino = dinosaurs.get(indexDino);
                System.out.println("Dinosaur: " + dino.getName()+ "\t" +"Species: "+ dino.getSpecies()+ "\t" +"Age: "+ dino.getAge());
            }
        }
    }

    public void showCurrentParkCapacity() {
        System.out.println("Current Park park Capacity"+guestsTemp.size()+"/ 100");
        System.out.println("You can allow " + (100 - guestsTemp.size())+ " more guests in\n");

    }

    public void displayMenu() {
        System.out.println("Park Status page.");
        System.out.println("1. Show current Park Capacity");
        System.out.println("2. Show Dinosaurs Status");
        System.out.println("3. Show Current Opening Hours");
        System.out.println("4. Show employee Status");
        System.out.println("5. Exit Menu\n");
        System.out.println("Enter your choice:");
    }
}
