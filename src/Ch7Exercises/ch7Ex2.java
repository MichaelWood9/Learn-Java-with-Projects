package Ch7Exercises;

public class ch7Ex2 {
    public static void main(String[] args) {
        System.out.println(howMuchFood(1000));
    }
    public static int howMuchFood (int weight){
        double foodPerKg = 0.25;
        return (int) (weight* foodPerKg);
    }
}
