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
    public String getString(){
        return scanner.nextLine();

    }
//-----------------------------------------------------------------------------------------------------
    public String getString(String prompt) {
        System.out.print(prompt + "\nEnter your choice: ");
        return scanner.nextLine();
    }
//-----------------------------------------------------------------------------------------------------
public boolean yesNo( ) {
    System.out.print("\nEnter yes or no: ");
    String input = scanner.next();
    return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
}
//-----------------------------------------------------------------------------------------------------
    public boolean yesNo(String prompt) {
        System.out.print(prompt + "\nEnter yes or no: ");
        String input = scanner.next();
        return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y");
    }
//-----------------------------------------------------------------------------------------------------
public int getInt() {
    System.out.print("\nEnter a number: ");
    String input= scanner.nextLine();
    try{
        return Integer.parseInt(input);
    }catch(NumberFormatException e){
        System.out.println("Not a number!");
    }
    return getInt();
}
//-----------------------------------------------------------------------------------------------------
//    public int getInt(String prompt) {
//        System.out.print(prompt+ "\nEnter a number: ");
//        return scanner.nextInt();
//    }
//-----------------------------------------------------------------------------------------------------
public int getInt(int min ,int max) {
    System.out.printf("\nEnter a number between %s and %s : ", min, max);
    String userInput = scanner.nextLine();
    try {
        int input = Integer.parseInt(userInput);
        if (input >= min && input <= max)
        return input;
    } catch (NumberFormatException e) {
        System.out.println("Not number.");
    }
    return getInt( min, max);
}
//-----------------------------------------------------------------------------------------------------
//public int getInt(int min ,int max){
//    int input = scanner.nextInt();
//
//    while(input < min || input > max){
//        System.out.printf("Re-enter a number between %s and %s : " ,min,max);
//        input = scanner.nextInt();
//    }
//    return input;
//}
//-----------------------------------------------------------------------------------------------------
public int getInt(String prompt,int min ,int max) {
    System.out.printf(prompt + "\nEnter a number between %s and %s : ",min,max);
    String userInput = scanner.nextLine();
    try {
        int input = Integer.parseInt(userInput);
        if (input >= min && input <= max)
            return input;
    } catch (NumberFormatException e) {
        System.out.println("Not number.");
    }
    return getInt( min, max);
}
//-----------------------------------------------------------------------------------------------------
//    public int getInt(String prompt,int min ,int max){
//        System.out.printf(prompt + "\nEnter a number between %s and %s : ",min,max);
//        int input = scanner.nextInt();
//
//        while(input < min || input > max){
//            System.out.printf("Re-enter a number between %s and %s : " ,min,max);
//             input = scanner.nextInt();
//        }
//        return input;
//    }
//-----------------------------------------------------------------------------------------------------
    public double getDouble() {
        System.out.print("\nEnter a number: ");
        String input= scanner.nextLine();
        try{
            return Double.parseDouble(input);
        }catch(NumberFormatException e){
            System.out.println("Not a number!");
        }
        return getInt();
    }
//-----------------------------------------------------------------------------------------------------
//public double getDouble() {
//    System.out.print("\nEnter a number: ");
//    return scanner.nextDouble();
//}
//-----------------------------------------------------------------------------------------------------
public double getDouble(String prompt) {
    System.out.print(prompt + "\nEnter a number between %s and %s : ");
    String input= scanner.nextLine();
    try{
        return Double.parseDouble(input);
    }catch(NumberFormatException e){
        System.out.println("Not a number!");
    }
    return getInt();
}
//-----------------------------------------------------------------------------------------------------
//    public double getDouble(String prompt) {
//        System.out.print(prompt + "\nEnter a number: ");
//        return scanner.nextDouble();
//    }
//-----------------------------------------------------------------------------------------------------
public double getDouble(double min ,double max) {
    System.out.printf("\nEnter a number between %s and %s : ",min,max);
    String userInput = scanner.nextLine();
    try {
        double input = Double.parseDouble(userInput);
        if (input >= min && input <= max)
            return input;
    } catch (NumberFormatException e) {
        System.out.println("Not number.");
    }
    return getDouble(min,max);
}
//-----------------------------------------------------------------------------------------------------
public double getDouble(String prompt,double min ,double max) {
    System.out.printf(prompt + "\nEnter a number between %s and %s : ",min,max);
    String userInput = scanner.nextLine();
    try {
        double input = Double.parseDouble(userInput);
        if (input >= min && input <= max)
            return input;
    } catch (NumberFormatException e) {
        System.out.println("Not number.");
    }
    return getDouble(min,max);
}
//-----------------------------------------------------------------------------------------------------
public int getBinary() {
    System.out.print("\nEnter a Binary number: ");
    String input= scanner.next();
    try{
//        System.out.printf("Your Binary number is: %s.",Integer.parseInt(input,2));
        return Integer.parseInt(input,2);
    }catch(NumberFormatException e){
        System.out.println("Not a Binary!");
    }
    return getBinary();
}
//-----------------------------------------------------------------------------------------------------
public int getHexadecimal() {
    System.out.print("\nEnter a Hexadecimal number: ");
    String input= scanner.next();
    try{
//        System.out.printf("Your Hexadecimal number is: %s.",Integer.parseInt(input,16));
        return Integer.parseInt(input,16);
    }catch(NumberFormatException e){
        System.out.println("Not a Hexadecimal!");
    }
    return getBinary();
}
//-----------------------------------------------------------------------------------------------------
//    public double getDouble(String prompt,double min ,double max){
//        System.out.printf(prompt + "\nEnter a number between %s and %s : ",min,max);
//        double input = scanner.nextDouble();
//
//        while(input < min || input > max){
//            System.out.printf("Re-enter a number between %s and %s : ",min,max);
//            input = scanner.nextDouble();
//        }
//        return input;
//    }
}