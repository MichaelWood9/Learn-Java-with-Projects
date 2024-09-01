package ch8Exercises;

public class Ch8Ex6 {
}
class Enclosure{
    String name;
    Dinosaur[] dinosaurs;

    public Enclosure(String name){
        this.name = name;
        this.dinosaurs = new Dinosaur[20];
    }
}
