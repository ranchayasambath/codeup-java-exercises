import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        1.
//        System.out.println("addition: " + addition(1, 4));
//        System.out.println("subtraction: " + subtraction(10, 2));
//        System.out.println("division: " + division(4, 2));
//        System.out.println("multiplication: " + multiplication(100, 20));
//        System.out.println("modulus: " + modulus(10, 4) + " remainders.");
//-------------------------------------------------------------------------
//        2.
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1,10);
//        System.out.print("You've Entered: " + userInput + ".");
//--------------------------------------------------------------------------
//        3.
//        factorial();
//--------------------------------------------------------------------------
//        4.
        diceRoll();
    }
//--------------------------------------------------------------------------

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

//    public static int multiplication(int num1, int num2) {
//        return(num1*num2)};

//BONUS:
//    public static int multiplication(int num1, int num2) {
//        int result = 0;
//        for (int i = 0; i < num2; i++) {
//            result = result + num1;
//        }
//        return result;
//    }
    public static int multiplication(int num1, int num2) {
        if (num2 == 1) {
            return num1;
        }
        return num1 + multiplication(num1, num2 - 1);
    }


    public static int modulus(int num1, int num2) {
        return (num1 % num2);
    }

//--------------------------------------------------------------------------
//    2.
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (min <= input & input <= max) {
            return input;
        } else {
            System.out.print("Re-enter a number between 1 and 10: ");
            return getInteger(min, max);
        }
    }
//--------------------------------------------------------------------------
//    3.
    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        String findFactorial = "y";
        boolean confirm = true;
        while (confirm) {
            if (findFactorial.equalsIgnoreCase("n")) {
                System.out.println("See ya!");
                return;
            }
            System.out.print("Please enter a number between 1 and 10: ");
            int input = getInteger(1,10);
            long storedFactorial = recursive(input);
            System.out.printf("%s! = %s%n", input, storedFactorial);
            System.out.print("Continue? (y/n): ");
            findFactorial = sc.next();
        }
    }
    public static int recursive(int num) {
        if (num == 1) {
            return 1;
        }
        return num * recursive(num - 1);
    }
//--------------------------------------------------------------------------
    //        4.
    public static void diceRoll() {
        System.out.print("How many sides are your dice?: ");
        Scanner sc = new Scanner(System.in);
        int diceSide = sc.nextInt();
        String reRoll;
        do {
            System.out.print("Press r to roll: ");
            String respond = sc.next();
            if (respond.equalsIgnoreCase("r")) {
                int diceOne = (int) (Math.random() * diceSide + 1);
                int diceTwo = (int) (Math.random() * diceSide + 1);
                System.out.printf("Rolled:\t%s and %s.%n", diceOne, diceTwo);
            }
            System.out.print("Play again? (y/n): ");
            reRoll = sc.next();
        } while (reRoll.equalsIgnoreCase("y"));
        System.out.println("See ya!");
    }
}
//


