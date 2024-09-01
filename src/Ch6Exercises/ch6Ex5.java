package Ch6Exercises;

public class ch6Ex5 {
    public static void main(String[] args) {
         int[]dinoAges = {10,11,36,22,60,80,21};
         int totalAges = 0;

         for(int age : dinoAges) {
            totalAges += age;
         }
        double averageAge = (double) totalAges/dinoAges.length;
        System.out.println("The average age of the Dinos is: " + (averageAge) + " years");
    }
}
