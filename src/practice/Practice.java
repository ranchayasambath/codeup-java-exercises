package practice;
public class Practice {
//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
    public static void main(String[] args) {
        System.out.println(notString("cake"));
        System.out.println(notString("not bad"));
        System.out.println(diff21(10));
        System.out.println(loneTeen(15,15));
        System.out.println(loneTeen(15,12));
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



}