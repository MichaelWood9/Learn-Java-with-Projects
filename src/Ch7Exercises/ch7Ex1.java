package Ch7Exercises;

public class ch7Ex1  {
    public static void main(String[] args) {
        System.out.println(dinoStage(1));
    }

    public static String dinoStage(int dinoAge){
        String result;
        if(dinoAge<2){
            result = "The dinosaur is a hatchling";
        }
        else if (dinoAge<7) {
            result = "The dinosaur is a juvenile";
        }
        else {
            result = " The dinosaur is an adult";
        }

        return result;
    }
}
