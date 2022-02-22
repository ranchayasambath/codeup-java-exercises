import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        numberGuess();
    }
        public static void numberGuess(){
            Scanner scanner = new Scanner(System.in);
            int number = (int) (Math.random()*100);
            int guess = 0;
            while (guess != number) {
                System.out.print("Enter your number 1 to 100: ");
                guess = scanner.nextInt();
                if (guess < 1 || guess > 100){
                    System.out.println("Invalid selection.\nTry again!");
                }
                else if (guess < number) {
                    System.out.println("HIGHER");
                }
                else if (guess > number) {
                    System.out.println("LOWER");
                }
                else {
                    System.out.println("GOOD GUESS! the number was: " + number + ".");
                }
            }
        }
    }
