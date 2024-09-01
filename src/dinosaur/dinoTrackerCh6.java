package dinosaur;

public class dinoTrackerCh6 {
    public static void main(String[] args) {
        String[] dinoNames = {"dino1","dino2","dino3","dino4","dino5","dino6","dino7","dino8","dino9","dino10"};
        int[] dinoAges ={12,11,34,56,44,34,29,22,31,38};
        String[] dinoSpecies = {"Raptor","Raptor","Broncho","T-rex","Allosaurs","Tri-tops","JRT","stego","T-rex","Raptor"};
        String[] dinoEnclosures ={"enclosure 1","enclosure 2","enclosure 3","enclosure 4","enclosure 5","enclosure 6","enclosure 7","enclosure 8","enclosure 9","enclosure 10" };
        int totalAges =0;

        for(int i = 0; i < dinoNames.length; i++){
            System.out.println("Dino name: " + dinoNames[i] + "\t Dino age: " + dinoAges[i] + " years \t Species: " + dinoSpecies[i] +" \t Enclosure: " + dinoEnclosures[i]);
            totalAges += dinoAges[i];
        }
        double averageAges = (double) totalAges/dinoAges.length;

        System.out.println("The average age of the dinosaurs is: " + averageAges + " years");


    }
}
