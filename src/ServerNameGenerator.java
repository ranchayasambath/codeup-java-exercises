import java.util.Random;

public class ServerNameGenerator {
    public static String[] adj = {"brave", "calm", "cautious", "comfortable", "distinct", "combative", "clear", "concerned", "busy", "adventurous"};
    public static String[] noun = {"ghost", "zebra", "whale", "vulture", "elephant", "horse", "lion", "lizard", "train", "tomato"};

    public static String randomize(String[] arr){
        int random = new Random().nextInt(arr.length);
        return arr[random];
        }

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n"+ randomize(adj)+"-"+randomize(noun));
    }
}