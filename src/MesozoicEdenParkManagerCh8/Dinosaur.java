package MesozoicEdenParkManagerCh8;

public class Dinosaur {
    private String name;
    private String species;
    private int age;
    private Enclosure enclosure;

    public Dinosaur(String name, String species, int age, Enclosure enclosure) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.enclosure = enclosure;
    }

    public String getName() {
        return name;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
