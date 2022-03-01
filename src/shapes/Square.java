package shapes;

//public class Square extends Quadrilateral{
////constructor;
//    public Square(double side){
//        super(side,side);
//        this.length = side;
//        this.width = side;
//    }
//

public class Square extends Rectangle{
//constructor;
    public Square(int side) {
        super(side,side);
        this.length= side;
        this.width=side;
    }
    public int getPerimeter(){
        return 4* width;
    }
    public int getArea(){
        return (int) Math.pow(width, 2);
    }
}
