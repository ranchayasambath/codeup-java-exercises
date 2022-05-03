package practice;
public class Practice {
//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
    public static void main(String[] args) {
//        System.out.println(notString("cake"));
//        System.out.println(notString("not bad"));
//        System.out.println(diff21(10));
//        System.out.println(loneTeen(15,15));
//        System.out.println(loneTeen(15,12));
        System.out.println(fizzString("fib"));
        System.out.println(lessBy10(1,7,11));
        System.out.println(specialEleven(22));
        System.out.println(delDel("adelbc"));
        System.out.println(fizzString2(3));
        System.out.println(lastDigit(23,19,13));
    }
    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not"))
            return str;
        return "not "+str;
    }
//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    public static int diff21(int n) {
        if(n>21)
            return 2*(n-21);
        return 21-n;
    }
//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
public static boolean loneTeen(int a, int b) {
    boolean aTeen = (a >= 13 && a <= 19);
    boolean bTeen = (b >= 13 && b <= 19);
    return (aTeen && !bTeen) || (bTeen && !aTeen);
}
    public static String fizzString(String str) {
        if (str.substring(0, 1).equalsIgnoreCase("f") && (str.substring(str.length() - 1).equalsIgnoreCase("b"))) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equalsIgnoreCase("f")) {
            return "Fizz";
        } else if (str.substring(str.length() - 1).equalsIgnoreCase("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }
    public static boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(c - b) >= 10;
    }
    public static boolean specialEleven(int n) {
        return n >= 0 && (n % 11 == 0 || n % 11 == 1);
    }

    public static String delDel(String str) {
        if (str.length()>=4 && str.substring(1,4).equals("del")){
            return str.substring(0,1)+str.substring(4);
        }
        return str;
    }
    public static String fizzString2(int n) {
        if( n % 3 == 0 && n % 5 ==0){
            return "FizzBuzz"+"!";
        }
        else if(n % 3 == 0){
            return "Fizz"+"!";
        }
        else if( n % 5 == 0){
            return "Buzz"+"!";
        }
        else{
            return n + "!";
        }
    }
    public static boolean lastDigit(int a, int b, int c) {
        int A = a % 10;
        int B =b % 10;
        int C = c % 10;
        if(A== B || B == A || B ==C || C == A){
            return true;
        }
        else {
            return false;
        }
    }


}
