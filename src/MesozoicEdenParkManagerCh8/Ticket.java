package MesozoicEdenParkManagerCh8;

import java.time.LocalDate;

public class Ticket {
    private double price;
    private String vistorName;
    private LocalDate visitDate;
    private String ticketType;

    public Ticket(double price, String ticketType,String vistorName, LocalDate visitDate) {

        this.ticketType = ticketType;
        this.price = price;
        this.vistorName = vistorName;
        this.visitDate = visitDate;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getVistorName() {
        return vistorName;
    }

    public void setVistorName(String vistorName) {
        this.vistorName = vistorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }
}
