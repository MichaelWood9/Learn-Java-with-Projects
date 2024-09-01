package MesozoicEdenParkManagerCh8;

import java.util.ArrayList;
import java.util.Scanner;

public class HandleSpecialEventsController {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Guest> guestsTemp;
    ArrayList<Guest> vipsTemp;
    String[] openingHoursTemp;
    String[] openHours = {"Mon: 9:00 - 17:00","Tues: 9:00 - 17:00","Wed: 9:00 - 17:00","Thurs: 9:00 - 17:00","Fri: 9:00 - 17:00","Sat: 9:00 - 17:00","Sun: 9:00 - 17:00"};
    String[] closedHours = {"Mon: Closed","Tues: Closed","Wed: Closed","Thurs: Closed","Fri: Closed","Sat: Closed","Sun: Closed"};


    public void run(ArrayList<Guest> guests,ArrayList<Guest> vips,String[] openingHours){
        openingHoursTemp = openingHours;
        guestsTemp = guests;
        vipsTemp = vips;
        displayMenu();
        int choice = scanner.nextInt();
        handleMenuchoice(choice);

    }

    public void handleMenuchoice(int choice) {
        switch (choice) {
            case 1:
                handleVIP();
                break;

            case 2:
                handleEmergency();
                break;

            case 3:
                System.out.println("Exiting Menu...");
                break;
        }
    }

    public void handleEmergency() {
        displayEmergencyMenu();
        int choice = scanner.nextInt();
        handleEmergencyMenuChoice(choice);

    }

    public void displayEmergencyMenu() {
        System.out.println("Emergency menu page.");
        System.out.println("1. Shut park down");
        System.out.println("2. Open park");
        System.out.println("3. Exit Menu\n");
        System.out.println("Enter your choice:");
    }
    public void handleEmergencyMenuChoice(int choice) {
        switch (choice) {
            case 1:
                shutParkDown();
                break;

            case 2:
                openPark();
                break;

            case 3:
                System.out.println("Exiting Menu...");
                break;
        }
    }
    public void setParkHours(String[] hours){
        for(int index =0; index< 7; index++){
            openingHoursTemp[index] = hours[index];
        }
    }

    public void shutParkDown() {
        setParkHours(closedHours);
        System.out.println("Park has been closed");
    }

    public void openPark() {
        setParkHours(openHours);
        System.out.println("Park has been reopened");
    }

    public void handleVIP() {
        displayVipMenu();
        int choice = scanner.nextInt();
        handleVipMenuChoice(choice);
    }

    public void handleVipMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addVip();
                break;

            case 2:
                removeVip();
                break;

            case 3:
                displayVips();
                break;

            case 4:
                System.out.println("Exiting Menu...");
                break;
        }
    }

    public void removeVip() {
        ticketController ticketCon = new ticketController();
        displayVips();
        System.out.println("\nSelect a VIP you want to remove");
        int index = scanner.nextInt()-1;
        Guest vip = vipsTemp.get(index);
        vipsTemp.remove(index);
        vip.setVip(false);
        Ticket vipTicket  = vip.getTicket();
        vipTicket.setPrice(ticketCon.getPrice(vip.getAge()));
        vipTicket.setTicketType(ticketCon.getTicketType(vip.getAge()));
        System.out.println("\n Vip has been removed\n");


    }

    public void displayVips() {
        for(int index = 0; index<vipsTemp.size(); index++){
            Guest vip = vipsTemp.get(index);
            Ticket vipTicket = vip.getTicket();
            System.out.println(index+1 + ". "+" VIP name: " + vip.getName() + "\t" + "VIP age: " + vip.getAge() + "\t" + "VIP Visit Date: " + vipTicket.getVisitDate());
        }
    }

    public void addVip() {
        displayGuests();
        int index = scanner.nextInt()-1;
        Guest vip = guestsTemp.get(index);
        vip.setVip(true);
        Ticket vipTicket = vip.getTicket();
        vipTicket.setTicketType("VIP Ticket");
        vipTicket.setPrice(0.00);
        vipsTemp.add(vip);
        System.out.println("VIP has been added\n");
    }

    public void displayGuests() {
        for(int index =0; index<guestsTemp.size(); index++){
            Guest guest = guestsTemp.get(index);
            Ticket ticket = guest.getTicket();
            System.out.println(index+1 + ". " + "Guest name: " + guest.getName() + " \t" + "Guest Age: " + guest.getAge() +" \t"+ "Ticket type : "
                    + ticket.getTicketType()+" \t"+ "Ticket price : "+ ticket.getPrice() + " \t" + "Visit Date : "+ ticket.getVisitDate()+"\n");
            System.out.println("Enter the number of the Guest you want to make VIP:");
        }
    }

    public void displayVipMenu() {
        System.out.println("VIP menu page.");
        System.out.println("1. Add VIP");
        System.out.println("2. Remove VIP");
        System.out.println("3. Display VIPS");
        System.out.println("4. Exit Menu\n");
        System.out.println("Enter your choice:");
    }

    public void displayMenu() {
        System.out.println("Handle Special Events page.");
        System.out.println("1. Handle VIP");
        System.out.println("2. Handle Emergency");
        System.out.println("3. Exit Menu\n");
        System.out.println("Enter your choice:");
    }
}
