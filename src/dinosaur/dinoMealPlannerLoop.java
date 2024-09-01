package dinosaur;

public class dinoMealPlannerLoop {
    public static void main(String[] args) {
        int time = 0;
        int tRexMeal = 100;
        int brachioMeal = 250;
        while(time<24){
            if(time == 8 || time == 14 || time ==20){
                System.out.println("Time: " + time +":00 Its time to feed the T-rex "+ tRexMeal + "kg of food");
            }
            else if(time == 7 || time == 11 || time ==15 || time == 19){
                System.out.println("Time: " + time +":00 Its time to feed the Brachiosaurus " + brachioMeal + "kg of food");
            }
            time++;
        }
    }
}
