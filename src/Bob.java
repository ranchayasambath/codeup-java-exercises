import java.util.Scanner;

public class Bob{
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