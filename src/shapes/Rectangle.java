package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double l, double w){
        super(l, w);
        this.length = l;
        this.width = w;
    }
    public double getPerimeter(){
    return (2* this.length) + (2 * this.width);
    }
    public double getArea(){
        return this.length * this.width;
    }





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
}