package Ch6Exercises;

public class ch6Ex2 {
    public static void main(String[] args) {
        int[] dinoWeights = {100,200,600,500,450};
        int heavyDinoWeight = dinoWeights[0];

        for(int weight:dinoWeights){
            if(weight > heavyDinoWeight){
               heavyDinoWeight = weight;
            }
        }

        System.out.println("The heaviest dinosaur weighs: " + heavyDinoWeight + " kg");
    }
}
