package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.printf("Perimeter: %s.%nArea: %s. %n", box1.getPerimeter(), box1.getArea());

//        Rectangle box2 = new Square(5);
//        System.out.printf("Perimeter: %s.%nArea: %s. %n", box2.getPerimeter(), box2.getArea());

//7. Modify your ShapesTest class, use it to:
//declare a variable of the type Measurable named myShape.
//Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.

        Measurable myShape;
        myShape = new Square(5);
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
        System.out.println("myShape.getArea() = " + myShape.getArea());
    }
}
//  8.  Answer the following questions:
//   9.     Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//Because the interface method()"Measurable.java" created two dependency methods which must  inherit to the inheritance, otherwise will trigger compiling error ("getParameter and getArea") for both class Rectangle and class Square.
//    10.    What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//The square will run fine but rectangle will no cause this error:
//"java: incompatible types: shapes.Square cannot be converted to shapes.Rectangle."
// this is due to the implementation of interface method of "Measurable.java"