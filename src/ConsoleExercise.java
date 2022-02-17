import java.util.Scanner;

public class ConsoleExercise {

    public static void main(String[] args) {
//        1.
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.%n",pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        System.out.println("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You Entered \"" + userInput + "\"");

        //2.
//        System.out.print("Enter Three words: ");
//        String input1 = scanner.next();
//        String input2 = scanner.next();
//        String input3 = scanner.next();
////        System.out.println("You Entered:\n"+ input1 + "\n" + input2 + "\n" + input3);
////        OR
//        System.out.printf("%s%n%s%n%s%n",input1,input2,input3);

//        3.
//        System.out.print("Write a sentence: ");
////        String input = sentence.next();
////       4.
//        String input = sentence.nextLine();
//        System.out.println(input);

//Calculate parameter.
//        1.
//        System.out.print("Enter Length: ");
//        int input = Integer.parseInt(scanner.next());
//        System.out.print("Enter Width: ");
//        int input2 = Integer.parseInt(scanner.next());
//        2.
//        System.out.println("Your classroom parameter is " + (input+input2)*2 + " feet.");
        //BONUS:
        System.out.print("Enter Length: ");
        double input = Double.parseDouble(scanner.next());
        System.out.print("Enter Width: ");
        double input2 = Double.parseDouble(scanner.next());
        System.out.print("Enter Height: ");
        double input3 = Double.parseDouble(scanner.next());
//        PARAMETER:
//        System.out.println("Your classroom parameter is " + (input+input2)*2 + " feet.");
////        AREA:
//        System.out.println("Your classroom area is " + (input*input2) + " square feet.");
////        VOLUME:
//        System.out.println("Your classroom volume is " + (input*input2*input3) + " cubic feet.");
//        ALL CALCULATIONS:
        System.out.println("Your classroom parameter is " + (input+input2)*2 + " feet." + "\nYour classroom area is " + (input*input2) + "square feet." + "\nYour classroom volume is "  + (input*input2*input3) + " cubic feet.");





//


    }
}