package MesozoicEdenParkManagerCh8;

public class Guest {
    String name;
    int age;
    boolean vip;
    Ticket ticket;

    public Guest(String name, int age, Ticket ticket) {
        this.vip = false;
        this.name = name;
        this.age = age;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
