package ch4Exercises;

public class ch4Ex6 {
    public static void main(String[] args) {
        int dinoWeight = 4000;
         if(dinoWeight < 1000){
             System.out.println("Dino needs feeding once per day");
         }
         else if ( dinoWeight <3000){
             System.out.println("Dino needs feeding twice per day");
         }
         else{
             System.out.println("Dino needs feeding 3 times per day");
         }
    }
}
