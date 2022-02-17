import jdk.internal.org.objectweb.asm.tree.InsnList;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        1.a
//        int i = 5;

//        1.b
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }
//        int  count = 0;
//        do{
//        System.out.println(count);
//        count = count +2;
//        }while(count < 100);

//        int count = 100;
//        do{
//        System.out.println(count);
//        count = count -5;
//        }while(count >= -10);

//        long count = 2;
//        do{
//            System.out.println(count);
//            count *= count;
//        }while(count < 1000000);

//        1.c
//        for(long i = 2; i < 1000000; i*=i){
//            System.out.println(i);
//        }

//        2.FizzBuzz
//        for(int i=1; i <= 100; i++){
//            if(((i % 3) == 0) && ((i % 5) == 0)){
//                System.out.println("FizzBuzz");
//                continue;
//            }else if((i%3)==0) {
//                System.out.println("Fizz");
//                continue;
//            }else if ((i%5)==0){
//                System.out.println("Buzz");
//                continue;
//            }System.out.println(i);
//        }
//        3.
        Scanner scanner = new Scanner(System.in);
        String choice = "y";
//        do {
//            System.out.print("What number would you like to go up to?: ");
//            int userInput = scanner.nextInt();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInput; i++) {
//                System.out.println(i + "      | " + (i * i) + "       |" + "  " + (i * i * i));
//            }
//            System.out.print("Continue? (y/n): ");
//            choice = new Scanner(System.in).next();
//            System.out.println();
//        }
//        while (!choice.equalsIgnoreCase("n"));

//        4./bonus
        int x = 0;
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Entre a numeric grade between 0 and 100: ");
            x = scanner.nextInt();
            if (x >= 0 && x <= 100)
                if (x <= 100 && x >= 96) {
                    System.out.println("A+");
                } else if (x <= 95 && x >= 92) {
                    System.out.println("A");
                } else if (x <= 91 && x >= 90) {
                    System.out.println("A-");
                } else if (x <= 89 && x >= 86) {
                    System.out.println("B+");
                } else if (x <= 85 && x >= 80) {
                    System.out.println("B");
                } else if (x <= 79 && x >= 76) {
                    System.out.println("C+");
                } else if (x <= 75 && x >= 70) {
                    System.out.println("C");
                } else if (x <= 69 && x >= 66) {
                    System.out.println("D+");
                } else if (x <= 65 && x >= 60) {
                    System.out.println("D");
                } else if (x <= 59 && x >= 0) {
                    System.out.println("F");
                }
            System.out.print("\nContinue? (y/n): ");
            choice = scanner.next();
            System.out.println();
        }
    }

}