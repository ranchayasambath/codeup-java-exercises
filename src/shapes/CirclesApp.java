package shapes;
import util.Input;
public class CirclesApp {

    public static void main(String[] args) {

        Input scanner = new Input();

        Circle cal = new Circle(scanner.getDouble("For radius"));

        System.out.printf("Area: %f\nCircumference: %f\n", cal.getArea(), cal.getCircumference());

        while (scanner.yesNo("Again? ")) {

            cal = new Circle(scanner.getDouble("For radius"));
            System.out.printf("Area: %f\nCircumference: %f\n", cal.getArea(), cal.getCircumference());
        }
        System.out.println("Exiting...");
    }
}