package Ch7Exercises;

public class ch7Ex3 {
    public static void main(String[] args) {
        int[] dinoAges ={10,20,30,40,50};
        System.out.println(averageDinoAge(dinoAges));
    }

    public static int averageDinoAge(int[]dinoAges){
        int total = 0;
        for(int age : dinoAges){
            total+= age;
        }

        return total/dinoAges.length;
    }
}
