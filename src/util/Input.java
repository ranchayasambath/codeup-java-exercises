package util;
import java.util.Scanner;
//    create a class named Input.
public class Input {
    //    has a private field named scanner
    private Scanner scanner;

    public Input() {
//When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.
         this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Write a statement: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter yes or y: ");
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");

    }
    public int getInt(int min ,int max){
//        System.out.println("Enter a number between"+ min + " and" + max);
        int input = scanner.nextInt();
        while(min < input || input > max){
            System.out.println("Enter a number between"+ min + " and" + max);
            input = scanner.nextInt();
        }return input;
    }

    public double getInt(double min ,double max){
        double input = scanner.nextInt();
        while(min < input || input > max){
            System.out.println("Enter a number between"+ min + " and" + max);
            input = scanner.nextInt();
        }return input;
    }
}