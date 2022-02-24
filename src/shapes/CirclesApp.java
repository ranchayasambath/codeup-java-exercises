package shapes;
import util.Input;

public class CirclesApp {
    private static int counter=0;

    public static int setCounter(){
         return counter++;
    }
    public static void main(String[] args) {
        boolean confirm;
        do{
            Input input = new Input();
            Circle newCircle = new Circle(input.getDouble("For the value radius of a circle."));
            double area = newCircle.getArea();
            double circumference = newCircle.getCircumference();
            setCounter();
            System.out.printf("Area is: %.2f.%n", area);
            System.out.printf("Circumference is: %.2f.%n", circumference);
            confirm = input.yesNo("Continue?");
        }while (confirm);
        System.out.printf("Created %s circle(s).",setCounter());
    }
}