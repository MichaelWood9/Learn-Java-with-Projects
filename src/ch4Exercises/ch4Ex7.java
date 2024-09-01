package ch4Exercises;

public class ch4Ex7 {
    public static void main(String[] args) {
        String jobTitle = "Cleaning";

        switch (jobTitle){
            case "Feeding":
                System.out.println("Your task is to feed the dinos");
                break;

            case "Cleaning":
                System.out.println("Your task is to clean the enclosures the dinos");
                break;

            case "Security":
                System.out.println("Your task is to ensure the park is safe");
                break;

            case "Tour Guilding":
                System.out.println("Your task is to guide the parks vistors");
                break;


            default:
                System.out.println("Unknown role");
                break;

        }
    }
}
