package groceryList;
import util.Input;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryListApplication {
    public static void main(String[] args) {
        Input input = new Input();
        boolean groceryList = input.yesNo("Would you like to create a list?\n");
        HashMap<String, Integer> Meat = new HashMap<>();
        HashMap<String, Integer> Dairy = new HashMap<>();
        HashMap<String, Integer> Seafood = new HashMap<>();
        HashMap<String, Integer> Produce = new HashMap<>();
        HashMap<String, Integer> Bakery = new HashMap<>();
        HashMap<String, Integer> Other = new HashMap<>();

        if (groceryList) {
            boolean newInput = input.yesNo("\nWould you like to create a new item?\n");
            if (newInput) {
                boolean confirm;
                //Selection loops:
                do{
                boolean additional = false;
                do {
                    System.out.println("\nSelect a Category:\n\n1.Meat\n2.Dairy\n3.Seafood\n4.Produce\n5.Bakery\n6.Other\n");
                    System.out.print("Enter selection:");
                    int category = input.getInt(1,6);
                    input.getString();
                    if (category == 1)
                        printUserGrocery(Meat, "Meat", input);
                    if (category == 2)
                        printUserGrocery(Dairy, "Dairy", input);
                    if (category == 3)
                        printUserGrocery(Seafood, "Seafood", input);
                    if (category == 4)
                        printUserGrocery(Produce, "Produce", input);
                    if (category == 5)
                        printUserGrocery(Bakery, "Bakery", input);
                    if (category == 6)
                        printUserGrocery(Other, "Other", input);
                    System.out.println("\nFinalize item? [Yes] / [No]");
                    boolean additionalItem = input.yesNo();
                    if (additionalItem)
                        additional = false;
                     if (!additionalItem)
                        additional = true;

                    } while (additional);

                    System.out.println("\nYour Final List: ");
                    sort(Meat);
                    sort(Dairy);
                    sort(Bakery);
                    sort(Seafood);
                    sort(Produce);
                    sort(Other);

                    input.getString();
                    System.out.print("\nMake a new List? \n");
                     confirm = input.yesNo();

                    if (!confirm)
                        System.out.println("Exiting...");
                    }while(confirm);
            }
        }
    }
    public static void printUserGrocery(HashMap<String, Integer> Category, String categoryName, Input Input){
        System.out.printf("%s Department%n", categoryName);
        System.out.print("Enter type:");
        String item = Input.getString();
        System.out.printf("Enter the Quantity for %s:", item);
        int quantity = Input.getInt();
        addToList(Category,item,quantity);
        System.out.printf("%nYour %s list:%n", categoryName);
        sort(Category);
    }
    public static void addToList(HashMap<String, Integer> category, String item, int quantity) {
        category.put(item, quantity);
    }
    public static void sort(HashMap<String, Integer> Category){
        TreeMap<String, Integer> sorted = new TreeMap<>(Category);
        for(Map.Entry<String,Integer>entry: sorted.entrySet())
            System.out.printf("%s\t=\t%s\n",entry.getKey(),entry.getValue());
    }
}
