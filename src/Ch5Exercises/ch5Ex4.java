package Ch5Exercises;

public class ch5Ex4 {
    public static void main(String[] args) {
        int[] dinoWeights = {100,200,125,250};
        int totalWeight = 0;
        for(int i =0; i<dinoWeights.length; i++){
            totalWeight += dinoWeights[i];
        }
        System.out.println("The total weight of all the dinos in the enclosure is : "+ totalWeight + " kg");
    }
}
