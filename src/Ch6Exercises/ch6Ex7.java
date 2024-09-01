package Ch6Exercises;

public class ch6Ex7 {
    public static void main(String[] args) {
        String[][] busSeats = {{"Seat 1 ","Seat  ","Seat 3 ","Seat 4 "},{"Seat 5 ","Seat 6 ","Seat 7 ","Seat 8 "},{"Seat 9 ","Seat 10 ","Seat 11 ","Seat 12 "}};
        for(String[] row : busSeats){
            for(String seat : row){
                System.out.print(seat+"");
            }
            System.out.println();
        }
    }
}
