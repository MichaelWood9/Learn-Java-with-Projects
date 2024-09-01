package Ch7Exercises;

public class ch7Ex5 {
    public static void main(String[] args) {
        System.out.println(greetingMessage("Terry-rex","Mike"));
    }

    public static String greetingMessage(String dinoName, String visitorName){
        return "Welcome " + visitorName + "! Your favorite dinosaur " + dinoName + " is excited to see you!";
    }
}
