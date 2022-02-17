public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.println("the value of i is: " + i);
//            i++;
//        }
        int count = 100;
        do{
            System.out.println("the value of i is: " + count);
            count = count - 5;
        }while(count >= -10);
    }
}