package ch8Exercises;

import java.time.LocalDate;

public class Ch8Ex8 {
}
class Ticket{
    double price;
    String vistorName;
    LocalDate visitDate;


    public Ticket(double price, String vistorName, LocalDate visitDate) {
        this.price = price;
        this.vistorName = vistorName;
        this.visitDate = visitDate;
    }
}
