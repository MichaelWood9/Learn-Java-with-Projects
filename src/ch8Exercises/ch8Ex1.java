package ch8Exercises;

public class ch8Ex1 {


    public static void main(String[] args) {
        Dinosaur dino = new Dinosaur("dave",39,"T-rex");

        System.out.println(dino.getName());
        System.out.println(dino.getAge());
        System.out.println(dino.getSpecies());
    }
}
class Dinosaur{
    String name;
    int age;
    String species;

    public Dinosaur(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}


