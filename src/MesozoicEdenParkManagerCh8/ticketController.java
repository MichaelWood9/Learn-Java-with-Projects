package MesozoicEdenParkManagerCh8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ticketController {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Guest> guestsTemp;

    public void run(ArrayList<Guest> guests){
        guestsTemp = guests;
        //scanner.nextLine();
        displayMenu();
        int choice = scanner.nextInt();
        handleMenuChoice(choice);
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addGuest();
                break;

            case 2:
                editGuest();
                break;

            case 3:
                removeGuest();
                break;

            case 4:
                displayGuest();
                break;

            case 5:
                System.out.println("Exiting...");
                break;
        }
    }

    public void editGuest() {
        scanner.nextLine();
        displayGuest();
        System.out.println();
        System.out.println("Select the number of the Guest you want to edit: ");

        int choice = scanner.nextInt();
        Guest guest = guestsTemp.get(choice-1);

        editGuestMenu();
        choice = scanner.nextInt();
        handleGuestEditMenuChoice(choice, guest);
    }

    public void handleGuestEditMenuChoice(int choice, Guest guest) {
        switch (choice) {
            case 1:
                editGuestName(guest);
                break;

            case 2:
                editGuestAge(guest);
                break;

            case 3:
                editGuestTicket(guest);
                break;

            case 4:
                System.out.println("Exiting Menu...");
                break;
        }
    }

    public void editGuestTicket(Guest guest) {
        displayEditGuestTicketMenu();
        int choice = scanner.nextInt();
        handleGuestEditTicketMenuChoice(choice,guest);
    }

    public void handleGuestEditTicketMenuChoice(int choice, Guest guest) {
        switch (choice) {
            case 1:
                editVisitDate(guest);
                break;

            case 2:
                editTicketVistorName(guest);
                break;

            case 3:
                editGuestTicketPrice(guest);
                break;

            case 4:
                System.out.println("Exiting Menu...");
                break;
        }
    }

    public void editGuestTicketPrice(Guest guest) {
        System.out.println("Current Ticket is : " + guest.getTicket().getPrice()+"\n");
        scanner.nextLine();
        System.out.println("Enter the new ticket price:  ");
        double newPrice = scanner.nextDouble();
        guest.getTicket().setPrice(newPrice);
        System.out.println("Ticket price has been updated...");
    }

    public void editTicketVistorName(Guest guest) {
        System.out.println("Current Vistor name is : " + guest.getTicket().getVistorName()+"\n");
        scanner.nextLine();
        System.out.println("Enter the new name of the Vistor:  ");
        String newName = scanner.nextLine();
        guest.getTicket().setVistorName(newName);
        System.out.println("Vistor name on ticket has been updated...");
    }

    public void editVisitDate(Guest guest) {
        System.out.println("Current visit date is : " + guest.getTicket().getVisitDate());
        scanner.nextLine();
        System.out.println("Enter the new day of the month for visit : ");
        int day = scanner.nextInt();
        System.out.println("Enter the new month of visit as number ie: 08 for august :");
        int month = scanner.nextInt();
        System.out.println("Enter the new year of visit : \n");
        int year = scanner.nextInt();
        LocalDate visitDate = LocalDate.of(year,month,day);

        guest.getTicket().setVisitDate(visitDate);
        System.out.println("Visit Date has been updated....");
    }

    public void displayEditGuestTicketMenu() {
        System.out.println("Edit Guest ticket page:");
        System.out.println("1. Edit Visit Date:");
        System.out.println("2. Edit Ticket Holder Name:");
        System.out.println("3. Edit Ticket Type and Price:");
        System.out.println("4. Exit:\n");
        System.out.println("Select an option:");
    }

    public void editGuestAge(Guest guest) {
        System.out.println("Current Guest age is : " + guest.getAge()+"\n");
        scanner.nextLine();
        System.out.println("Enter the new age for the guest:  ");
        int newAge = scanner.nextInt();
        guest.setAge(newAge);
        guest.getTicket().setPrice(getPrice(newAge));//recalculates and sets price of ticket for new age
        System.out.println("Guest age has been updated...");
    }

    public void editGuestName(Guest guest) {
        System.out.println("Current Guest name is : " + guest.getName()+"\n");
        scanner.nextLine();
        System.out.println("Enter the new name of the Guest:  ");
        String newName = scanner.nextLine();
        guest.setName(newName);
        System.out.println("Guest name has been updated...");
    }

    public void editGuestMenu() {
        System.out.println("Edit guest page: ");
        System.out.println("1. Edit Guest Name");
        System.out.println("2. Edit Guest Age");
        System.out.println("3. Edit Guest Ticket");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
    }

    public void removeGuest() {
        scanner.nextLine();
        System.out.println("Remove Guest Menu\n");
        displayGuest();
        System.out.println("\nSelect the number of the Guest you want to remove:");
        int choice = scanner.nextInt();

        guestsTemp.remove(choice-1);//removing guest from guest list
        System.out.println("guest has been removed...");
    }

    public void displayGuest() {
        for(int index =0; index<guestsTemp.size(); index++){
            Guest guest = guestsTemp.get(index);
            Ticket ticket = guest.getTicket();
            System.out.println(index+1 + ". " + "Guest name: " + guest.getName() + " \t" + "Guest Age: " + guest.getAge() +" \t"+ "Ticket type : "
                    + ticket.getTicketType()+" \t"+ "Ticket price : "+ ticket.getPrice() + " \t" + "Visit Date : "+ ticket.getVisitDate());
        }
    }

    public void addGuest() {
        scanner.nextLine();
        System.out.println("Enter Guest Fullname: ");
        String name = scanner.nextLine();
        System.out.println("Enter Guest Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter the day of the month for visit : ");
        int day = scanner.nextInt();
        System.out.println("Enter the month of visit as number ie: 08 for august :");
        int month = scanner.nextInt();
        System.out.println("Enter the year of visit : ");
        int year = scanner.nextInt();
        LocalDate visitDate = LocalDate.of(year,month,day);


        Ticket ticket = new Ticket(getPrice(age),getTicketType(age),name,visitDate);

        Guest guest = new Guest(name,age,ticket);
        guestsTemp.add(guest);

        System.out.println("Guest has been added has been added...");
    }

    public String getTicketType(int age) {
        String ticketType;
        if(age<16){
            ticketType = "Child ticket";
        } else if (age>64) {
            ticketType = "OAP ticket";
        }
        else {
            ticketType = "Adult ticket";
        }
        return ticketType;
    }

    public double getPrice(int age) {
        double price;
        if(age<16){
            price = 7.99;
        } else if (age>64) {
            price = 8.99;
        }
        else {
            price = 12.99;
        }
        return price;
    }

    public void displayMenu() {
        System.out.println("Manage Employee page.");
        System.out.println("1. Add Guest");
        System.out.println("2. Edit Guest");
        System.out.println("3. Remove Guest");
        System.out.println("4. Display Guests");
        System.out.println("5. Exit Menu\n");
        System.out.println("Enter your choice:");
    }
}
