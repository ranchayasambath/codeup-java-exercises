package shapes;

//5.Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double l, double w) {
        super(l, w);
        this.length = l;
        this.width = w;
    }
    public void setLength() {
    }
    public void setWidth() {
    }
    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }
    public double getArea() {
        return this.length * this.width;
    }
}

//1.Remove the code from the body of your Rectangle and Square classes.
//public class Rectangle{
//    protected int length;
//    protected int width;
//
//    //constructor:
//    public Rectangle(int l, int w) {
//         this.length = l;
//         this.width = w;
//    }
//    public int getPerimeter(){
//    return (2* this.length) + (2 * this.width);
//    }
//    public int getArea(){
//        return this.length * this.width;
//    }
//}