import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
//        1.
        //STORE VALUE= NOT REASSIGNING THE REFERENCE:
//        String string = "We don't need no education";
////        string = string.replace("education","thought control" );
////        string = string.replace("We don't need no education","Check \"this\" out!, \"s inside of \"s!");
////        string = string.replace("We don't need no education","In windows, the main drive is usually C:\\\"");
////        string = string.replace("We don't need no education","I can do backslashes \\, double backslashes \\\\,\n" +
////                "and the amazing triple backslash \\\\\\!");
//        System.out.println(string);

        String first = "We don't need no education\nWe don't need no thought control"; // \n = new line
        System.out.println(first);

        String second = "Check \"this\" out!, \"s inside of \"s!"; // use \ in front of " in string to show them
        System.out.println(second);

        String third = "In windows, the main drive is usually C:\\"; // \ also works for \
        System.out.println(third);

        String fourth = "I can do backslashes \\, double backslashes \\\\,\n" + // one \ for each character
                "and the amazing triple backslash \\\\\\!";
        System.out.println(fourth);
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