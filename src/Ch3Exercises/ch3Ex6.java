package Ch3Exercises;

public class ch3Ex6 {
    public static void main(String[] args) {
        int currentSafetyRating = 7;
        int safetyRatingThreshold = 8;
        boolean belowSafetyRatingThreshold = currentSafetyRating<safetyRatingThreshold;

        System.out.println("Is the safety rating above the threshold? " + (belowSafetyRatingThreshold ? "No" : "Yes"));
    }
}
