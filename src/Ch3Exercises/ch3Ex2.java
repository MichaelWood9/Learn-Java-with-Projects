package Ch3Exercises;

public class ch3Ex2 {
    public static void main(String[] args) {
        double amountOfFoodforWeight = 0.01;
        int dinoWeight = 3000;

        double amountOfFoodInKG = dinoWeight * amountOfFoodforWeight;
        System.out.println("Amount of food needed in kg " + amountOfFoodInKG);
    }
}
