package Ch6Exercises;

public class ch6Ex3 {
    public static void main(String[] args) {
        int[] dinoWeights = {300,200,600,500,450};
        int lightestDinoWeight = dinoWeights[0];

        for(int weight:dinoWeights){
            if(weight < lightestDinoWeight){
                lightestDinoWeight = weight;
            }
        }

        System.out.println("The lightest dinosaur weighs: " + lightestDinoWeight + " kg");
    }
}
