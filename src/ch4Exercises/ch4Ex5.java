package ch4Exercises;

public class ch4Ex5 {
    public static void main(String[] args) {
        String size = "M";
        switch(size){
            case "XS":
                System.out.println("Assign dino to extra small enclosure");
                break;

            case "S":
                System.out.println("Assign dino to small enclosure");
                break;

            case "M":
                System.out.println("Assign dino to medium enclosure");
                break;

            case "L":
                System.out.println("Assign dino to large enclosure");
                break;

            case "XL":
                System.out.println("Assign dino to extra large enclosure");
                break;

            default:
                System.out.println("unknown dino size");
                break;
        }
    }
}
