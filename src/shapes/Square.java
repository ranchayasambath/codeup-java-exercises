package shapes;
//6.Change your existing Square class to extend Quadrilateral.
public class Square extends Quadrilateral{

    //constructor;
    public Square(double side) {
        super(side, side);
        this.length = side;
        this.width = side;
    }
    //GETTERS
    public double getPerimeter() {
        return 4*width;
    }
    public double getArea() {
        return Math.pow(width,2);
    }
    //SETTERS
    public void setLength() {
    }
    public void setWidth() {

    }
}



//public class Square extends Rectangle {
//
//    //CONSTRUCTOR
//    public Square(int side) {
//        super(side, side);
//        this.length = side;
//        this.width = side;
//    }
//}

//1.Remove the code from the body of your Rectangle and Square classes.

//    public int getPerimeter(){
//        return 4* width;
//    }
//    public int getArea(){
//        return (int) Math.pow(width, 2);
//    }
//}
