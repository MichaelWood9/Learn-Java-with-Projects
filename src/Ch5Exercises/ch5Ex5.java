package Ch5Exercises;

public class ch5Ex5 {
    public static void main(String[] args) {
        int numTickets = 100;

        while(numTickets>0){
            //buying tickets
            numTickets -= 5;
            System.out.println("Number of tickets left: " + numTickets);

        }
        System.out.println("Tickets are sold out.");
    }
}
