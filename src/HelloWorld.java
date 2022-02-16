public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        int myFavoriteNumber;

        myFavoriteNumber = 23;
        System.out.println(myFavoriteNumber);

        String myString;
        myString = "Jack";
        System.out.println(myString);

//        myString = 3.14159;

//        long myNumber;
//        System.out.println(myNumber);

//        myNumber = 3.14;
//    forcing number to a long:
//       long myNumber = 123L;
//    forcing number to be a float:
//      float myNumber = 123F;

//        float myNumber;
        double  myNumber;
        myNumber = 3.14;
//        System.out.println(myNumber);

//        casting from double to float:

        float myNewNumber;
        myNewNumber = (float) myNumber;
        System.out.println(myNewNumber);



//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        int class;

//        String theNumberThree = "three";
//        Object o = theNumberThree;

//        int three = (int) o;
//        int three = (int) "three";
//        int x = 4;
//        x = x + 5;
//        x+=5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y*=x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
//        x = x / y;
        x/=y;
//        y = y - x;
        y-=x;
        System.out.println(x);
        System.out.println(y);

//        byte smallNumber = 127;
//        System.out.println(++smallNumber);
//
//        long largeNumber = 127;
//        System.out.println(++largeNumber);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE -1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE +1);
    }
}