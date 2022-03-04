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
    public String getString(String prompt) {
        System.out.print(prompt + "\nEnter your choice: ");
        return scanner.nextLine();
    }
//-----------------------------------------------------------------------------------------------------
    public boolean yesNo(String prompt) {
        System.out.print(prompt + "\nEnter yes or y: ");
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }
//-----------------------------------------------------------------------------------------------------
    public int getInt(String prompt) {
        System.out.print(prompt+ "\nEnter an integer: ");
        return scanner.nextInt();
    }
//-----------------------------------------------------------------------------------------------------
    public int getInt(String prompt,int min ,int max){
        System.out.printf(prompt + "\nEnter a number between %s and %s : ",min,max);
        int input = scanner.nextInt();

        while(input < min || input > max){
            System.out.printf("Re-enter a number between %s and %s : " ,min,max);
             input = scanner.nextInt();
        }
        return input;
    }
//-----------------------------------------------------------------------------------------------------
    public double getDouble(String prompt) {
        System.out.print(prompt + "\nEnter a number: ");
        return scanner.nextDouble();
    }
//-----------------------------------------------------------------------------------------------------
    public double getDouble(String prompt,double min ,double max){
        System.out.printf(prompt + "\nEnter a number between %s and %s : ",min,max);
        double input = scanner.nextDouble();

        while(input < min || input > max){
            System.out.printf("Re-enter a number between %s and %s : ",min,max);
            input = scanner.nextDouble();
        }
        return input;
    }
}