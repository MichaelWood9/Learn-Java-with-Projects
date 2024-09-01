package ch4Exercises;

public class ch4Ex3 {
    public static void main(String[] args) {
        int yearsExperience = 10;
        String dinosaurType = "T-Rex";

        if( dinosaurType.equals("T-Rex") && yearsExperience >= 10){
            System.out.println("you are qualified to handle t-rex");
        }
        else{
            System.out.println("you do not have enough experience to handle t-rex");
        }
    }
}
