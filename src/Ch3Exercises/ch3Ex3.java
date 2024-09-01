package Ch3Exercises;

public class ch3Ex3 {
    public static void main(String[] args) {
        int year = 2001;
        boolean isLeapYear = year%4 == 0 && (year % 100 != 0 || year % 400 == 0);;
        System.out.println("Is it a Leap Year? " + (isLeapYear ? "Yes" : "No"));
    }
}
