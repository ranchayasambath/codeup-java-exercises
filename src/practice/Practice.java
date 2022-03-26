package practice;
public class Practice {
//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
    public static void main(String[] args) {
        System.out.println(notString("cake"));
        System.out.println(notString("not bad"));
    }
    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not"))
            return str;
        return "not "+str;
    }
}
