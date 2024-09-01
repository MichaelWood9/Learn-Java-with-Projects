package Ch5Exercises;

public class ch5Ex6 {
    public static void main(String[] args) {
        boolean securityAllChecksPassed = false;
         do{
             System.out.println("Checking security");
             securityAllChecksPassed = true;
         }while(!securityAllChecksPassed);
        System.out.println("Security checks complete");
    }
}

