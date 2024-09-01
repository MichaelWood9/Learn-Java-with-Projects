package ch8Exercises;

public class Ch8Ex3 {
    public static void main(String[] args) {
        Dinosaur dino = new Dinosaur("David",37,"T-rex");
        Employee emp = new Employee("Tim","Cleaner",20);
        System.out.println(dino.name);
        dino.name = "Tom";
        System.out.println(dino.getName());
        //emp.name = "Steve"; //Employee attributes are private
        System.out.println(emp.getName());
        emp.setName("Stevie");
        System.out.println(emp.getName());
    }
}
