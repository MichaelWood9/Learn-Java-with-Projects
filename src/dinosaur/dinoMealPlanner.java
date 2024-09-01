package dinosaur;

public class dinoMealPlanner {
    public static void main(String[] args) {
        double dinoWeight = 3000;
        double amountOfFoodToWeight = 0.05;

        double amountOfFoodPerDay = dinoWeight * amountOfFoodToWeight;

        int numberOfFeedingsPerDay = 2;

        System.out.println("Our " + dinoWeight + " kg dinosaur needs to eat " + amountOfFoodPerDay + " kg daily, which means we need to serve " + amountOfFoodPerDay/numberOfFeedingsPerDay +  " kg per feeding.");
    }
}
