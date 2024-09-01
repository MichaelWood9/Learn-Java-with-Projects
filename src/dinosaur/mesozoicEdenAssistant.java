package dinosaur;

import java.time.LocalDateTime;
import java.util.Scanner;

public class mesozoicEdenAssistant {
    Scanner scanner = new Scanner(System.in);

    String[] dinoNames = new String[10];
    int[] dinoAges = new int[10];
    int[] dinoWeight = new int[10];
    int dinoCount =0;

    int currentNumberOfGuests = 260;
    int maxVisitorCapacity = 300;

    String[] staffName = new String[10];
    String[] staffRole = new String[10];
    int staffcount = 0;

    public static void main(String[] args) {
        mesozoicEdenAssistant main = new mesozoicEdenAssistant();
        main.start();
    }

    public void start(){
        while(true){
            displayMenu();
            int choice = scanner.nextInt();
            handleMenuChoice(choice);
        }
    }



    public void displayMenu() {
        System.out.println("Welcome to Mesozoic Eden Assistant!");
        System.out.println("1. Add dinosaur");
        System.out.println("2. Check park hours");
        System.out.println("3. Greet Guest");
        System.out.println("4. Check Visitor count");
        System.out.println("5. Manage staff");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addDinosaur();
                break;

            case 2:
                checkParkHours();
                break;

            case 3:
                greetGuest();
                break;

            case 4:
                checkVistorCount();
                break;

            case 5:
                manageStaff();
                break;
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }

    public void manageStaff() {
        scanner.nextLine();
        manageStaffMenu();
        int choice = scanner.nextInt();
        handleManageStaffChoice(choice);
    }

    public void handleManageStaffChoice(int choice){
        switch (choice){
            case 1:
                addStaff();
                break;

            case  2:
                viewStaff();
                break;

            case 3:
                break;
        }
    }

    public void viewStaff(){
        for(int index =0; index<staffRole.length; index++){
            System.out.println("Staff name: " + staffName[index] +"\t" + "Staff role: " + staffRole[index]);
        }
    }

    public void addStaff(){
        if(staffcount<10){
            scanner.nextLine();

            System.out.println("Enter staff name:");
            staffName[staffcount] = scanner.nextLine();

            System.out.println("Enter staff role:");
            staffRole[staffcount] = scanner.nextLine();

            staffcount++;
            System.out.println("Staff has been added");

        }
        else{
            System.out.println("Maximum number of staff reached no more can be added");
        }
    }


    public void manageStaffMenu() {
        System.out.println("Managing staff options");
        System.out.println("1. Add staff");
        System.out.println("2. View current staff");
        System.out.println("3. Exit");
        System.out.println("Enter your choice:");
    }

    public void checkVistorCount() {
        if(currentNumberOfGuests< maxVisitorCapacity){
            System.out.println("The current visitor count is : " + currentNumberOfGuests);
            System.out.println("You can let in up to " + (maxVisitorCapacity-currentNumberOfGuests) + " more guests" );

            scanner.nextLine();
            System.out.println("Enter the number of guests you want to let in:");
            int groupSize = scanner.nextInt();

            if(groupSize <= (maxVisitorCapacity-currentNumberOfGuests)){
                currentNumberOfGuests+= groupSize;
                System.out.println("The guests have entered the current amount of vistors is : " + currentNumberOfGuests);
            }
            else {
                System.out.println("We can allow that many guests as it would exceed the parks capacity for guests");
                return;
            }
        }
        else{
            System.out.println("We cannot allow anymore guests in as the park is at capacity with " +currentNumberOfGuests + " guests");
        }
    }

    public void greetGuest() {
        System.out.println("Welcome to Mesozoic Eden");
        System.out.println("We currently have " + dinoCount + " different dinosaurs at the park");
        System.out.println("We hope you have a great time at mesozoic eden");
    }

    public void checkParkHours() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        if( hour >=8 && hour <= 18){
            System.out.println("The park is open");
            System.out.println("The parks is open between 8:00 - 18:00 ");
        }
        else {
            System.out.println("The park is closed");
            System.out.println("The parks is open between 8:00 - 18:00 ");
        }
    }

    public void addDinosaur() {
        if(dinoCount<10){
            scanner.nextLine();

            System.out.println("Enter dino name:");
            dinoNames[dinoCount] = scanner.nextLine();

            System.out.println("Enter dino age:");
            dinoAges[dinoCount] = scanner.nextInt();

            System.out.println("Enter dino weight:");
            dinoWeight[dinoCount] = scanner.nextInt();

            dinoCount++;
            System.out.println("Dino has been added");

        }
        else{
            System.out.println("Maximum number of dinos reached no more can be added");
        }
    }

}
