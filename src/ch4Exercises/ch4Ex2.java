package ch4Exercises;

public class ch4Ex2 {
    public static void main(String[] args) {
        String species = "Tri-tops";
        switch (species){
            case "T-rex":
                System.out.println("t-rex is an apex predator");
                break;

            case "Raptor":
                System.out.println("raptor is fast");
                break;

            case "Tri-tops":
                System.out.println("herbivore that has horns");
                break;

            default:
                System.out.println("unknown dino");
                break;
        }

    }
}
