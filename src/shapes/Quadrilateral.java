package shapes;


//4.Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable. This class should have:
//
//protected properties for length and width.
//a constructor that accepts two numbers for the length and width and sets those properties.
//methods for getting the length and width.
//abstract methods for setting the length and width.

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    //CONSTRUCTOR
    public Quadrilateral(double l, double w){
        this.length = l;
        this.width = w;
    }
    //GETTERS
    public double getLength(){
         return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    //abstract SETTERS for length and width
    public abstract void setLength();

    public abstract void setWidth();
}