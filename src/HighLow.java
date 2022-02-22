
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        // Create a random number generator
        numberGuess();
    }
        // Use Scanner for getting input from user
        public static void numberGuess(){
            Scanner scanner = new Scanner(System.in);
            int number = (int) (Math.random()*100);
            int guess = -1;
            while (guess != number) {
                System.out.print("Enter your number 1 to 100: ");
                guess = scanner.nextInt();
                if (guess <= 0 || guess > 100 ){
                    System.out.println("invalid selection!");
                }
                else if (guess < number) {
                    System.out.println("Too low, please try again");
                }
                else if (guess > number) {
                    System.out.println("Too high, please try again");
                }
                else {
                    System.out.println("Correct, the number was " + number);
                }
            }
        }
    }
