import java.util.Scanner;

public class ConsoleExercise {

    public static void main(String[] args) {
//        1.
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.%n",pi);

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInput = scan.nextInt();
//        System.out.println("You Entered \"" + userInput + "\"");

        //2.
//        Scanner one = new Scanner(System.in);
//        System.out.print("Enter first word: ");
//        String input1 = one.next();
//
//        Scanner two = new Scanner(System.in);
//        System.out.print("Enter second word: ");
//        String input2 = two.next();
//
//        Scanner three = new Scanner(System.in);
//        System.out.print("Enter third word: ");
//        String input3 = three.next();
//        System.out.println("You Entered:\n"+ input1 + "\n" + input2 + "\n" + input3);

//        3.
//        Scanner sentence = new Scanner(System.in);
//        System.out.print("Write a sentence: ");
////        String input = sentence.next();
////        4.
//        String input = sentence.nextLine();
//        System.out.println(input);

//Calculate parameter.
//        1.
        Scanner length = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int input = Integer.parseInt(length.nextLine());

        Scanner width = new Scanner(System.in);
        System.out.print("Enter Width: ");
        int input2 = Integer.parseInt(width.nextLine());

//        2.
        System.out.println("Your classroom parameter is " + (input+input2)*2 + " feet.") ;

    }

}