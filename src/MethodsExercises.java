import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        1.
        System.out.println("addition: " + addition(1, 4));
        System.out.println("subtraction: " + subtraction(10, 2));
        System.out.println("division: " + division(4, 2));
        System.out.println("multiplication: " + multiplication(10, 2));
//        System.out.println("recursion: " + recursion(10,2));
        System.out.println("modulus: " + modulus(10, 4) + " remainders.");
        //----------------------------------------
//        2.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int userInput = sc.nextInt();
        int userInput2 = sc.nextInt();
//        System.out.println(getInteger(userInput, userInput2));

    }

    //    1.
    public static int addition(int num1, int num2) {
        return (num1 + num2);
    }

    public static int subtraction(int num1, int num2) {
        return (num1 - num2);
    }

    public static int division(int num1, int num2) {
        return (num1 / num2);
    }

    public static int multiplication(int num1, int num2) {
//        return(num1*num2);
        int sum = 0;
        for (int i = 0; i < num1; i++) {
            sum = sum + num2;
        }
        return sum;
    }
//    public static int recursion(int num1, int num2){

//    }

    public static int modulus(int num1, int num2) {
        return (num1 % num2);
    }
}
//---------------------------------------------------
//    2.
//public static int getInteger(int min, int max) {
//    if (max <= min) {
//        System.out.println("you reached limit");
//    }
