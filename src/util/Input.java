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
//-----------------------------------------------------------------------------------------------------
    public String getString() {
        System.out.print("Write a statement: ");
        return scanner.nextLine();
    }
//-----------------------------------------------------------------------------------------------------
    public boolean yesNo() {
        System.out.print("Enter yes or y: ");
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }
//-----------------------------------------------------------------------------------------------------
    public int getInt() {
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }
//-----------------------------------------------------------------------------------------------------
    public int getInt(int min ,int max){
        System.out.print("Enter an integer between "+ min + " and " + max + " : ");
        int input = scanner.nextInt();

        while(min < input && input > max){
            System.out.print("Enter an integer between"+ min + " and " + max + " : ");
            input = scanner.nextInt();
        }
        return input;
    }
//-----------------------------------------------------------------------------------------------------
    public double getDouble() {
        System.out.print("Enter a Double: ");
        return scanner.nextDouble();
    }
//-----------------------------------------------------------------------------------------------------
    public double getDouble(double min ,double max){
        System.out.print("Enter a double between "+ min + " and " + max + " : ");
        double input = scanner.nextDouble();

        while(min < input && input > max){
            System.out.print("Enter a double between "+ min + " and " + max + " : ");
            input = scanner.nextDouble();
        }
        return input;
    }
}