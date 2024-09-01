package Ch7Exercises;

public class ch7Ex6 {
    public static void main(String[] args) {
        System.out.println(numberOfVistorsAllowedIn(290,300,9));
    }

    public static boolean numberOfVistorsAllowedIn(int currentVistors, int maxVistors, int groupSize){
        return (currentVistors + groupSize) <= maxVistors;
    }
}
