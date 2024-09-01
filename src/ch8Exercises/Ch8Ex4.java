package ch8Exercises;

import java.util.ArrayList;

public class Ch8Ex4 {
    public static void main(String[] args) {
        Park park = new Park("Java");
        park.addEmployee("Andrew","Accountant",1);
        park.addEmployee("Mike","Software Developer",9);
        ArrayList<Employee>employees = park.getEmployees();
        System.out.println(employees.get(1).getName());

    }
}
class Park{
    private String name;
    private ArrayList<Dinosaur> dinosaurs;//Dinosaur[] dinosaurs;
    private ArrayList<Employee> employees;//Employee[] employees;

    public Park(String name) {
        name = name;
        this.dinosaurs = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }

    public void addDinosaurs(Dinosaur[] dinosaurs) {
        //this.dinosaurs = dinosaurs;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(String name,String jobTitle,int yearsExp) {
        this.employees.add(new Employee(name,jobTitle,yearsExp));
    }
}
