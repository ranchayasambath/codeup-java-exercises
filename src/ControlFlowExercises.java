public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }
        long count = 2;
        do{
            System.out.println(count);
            count *= count;
        }while(count < 1000000);
    }
}