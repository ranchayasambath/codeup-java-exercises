import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
//        1.
//        String string = "We don't need no education";
////        string = string.replace("education","thought control" );
////        string = string.replace("We don't need no education","Check \"this\" out!, \"s inside of \"s!");
////        string = string.replace("We don't need no education","In windows, the main drive is usually C:\\\"");
//        string = string.replace("We don't need no education","I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!");
//        System.out.println(string);


    }
}
//        2.
class bob{
    public static void main(String[] args) {
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ask bob: ");
            String input = sc.nextLine();
            if (input.endsWith("?")) {
                System.out.println("Sure.");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
            System.out.print("Continue to ask?: ");
            choice = sc.next();
        }

    }
}