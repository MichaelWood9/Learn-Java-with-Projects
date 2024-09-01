package Ch7Exercises;

import java.time.LocalDateTime;

public class ch7Ex4 {
    public static void main(String[] args) {
        isOpen();
    }
    public static void isOpen(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        if( hour >=8 && hour <= 18){
            System.out.println("The park is open");
        }
        else {
            System.out.println("The park is closed");
        }
    }

}
