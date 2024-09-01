package MesozoicEdenParkManagerCh8;

import java.util.ArrayList;

public class Enclosure {
    private String name;
    private ArrayList<Dinosaur> dinosaurs;

        public Enclosure(String name) {
        this.name = name;
        this.dinosaurs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Dinosaur> getDinosaurs() {
        ArrayList<Dinosaur> Copydinosaurs = (ArrayList) dinosaurs.clone();
        return Copydinosaurs;
    }
    public void removeDinosaur(Dinosaur dino){
            dinosaurs.remove(dino);
    }

    public void setDinosaurs(ArrayList<Dinosaur> dinosaurs) {
        this.dinosaurs = dinosaurs;
    }
    public void addDinosaur(Dinosaur dinosaur){
            if(dinosaurs.size()<10){
                dinosaurs.add(dinosaur);
            }
            else {
                System.out.println("Unable to add dinosaur to enclosure as enclosure is at maximum capacity");
            }
    }
}
