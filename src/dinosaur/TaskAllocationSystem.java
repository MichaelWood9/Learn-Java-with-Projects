package dinosaur;

public class TaskAllocationSystem {
    public static void main(String[] args) {
        String jobTitle = "Cleaning";
        int time24 = 20;
        int securityLevel =10;
        int securityLevelThreshold = 7;

        switch (jobTitle) {
            case "Feeding":
                if (securityLevel > securityLevelThreshold) {
                    System.out.println("Your task is to feed the dinos");
                }
                else {
                    System.out.println("Your task is to help the Security ");
                }


                break;

            case "Cleaning":
                if (securityLevel > securityLevelThreshold) {
                    System.out.println("Your task is to clean the enclosures the dinos");
                }
                else {
                    System.out.println("Your task is to help the Security ");
                }

                break;

            case "Security":
                if(securityLevel<10){
                    System.out.println("Your task is to ensure the park is safe and bring the safety level back to 10");
                }
                else {
                    System.out.println("help assist with other tasks");
                }
                break;

            case "Tour Guilding":
                if (time24>10 && time24<19) {
                    System.out.println("Your task is to guide the parks vistors");
                }
                else {
                    System.out.println("Your task is to help the feeding team ");
                }

                break;


            default:
                System.out.println("Unknown role");
                break;

        }
    }
}
