package groceryList;
import util.Input;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryListApplication {
    public static void main(String[] args) {
        Input input = new Input();
        boolean groceryList = input.yesNo("Would you like to create a list?");
        HashMap<String, Integer> Meat = new HashMap<>();
        HashMap<String, Integer> Dairy = new HashMap<>();
        HashMap<String, Integer> Seafood = new HashMap<>();
        HashMap<String, Integer> Vegetables = new HashMap<>();
        HashMap<String, Integer> Fruit = new HashMap<>();
        HashMap<String, Integer> Other = new HashMap<>();

        if (groceryList) {
            boolean confirm;
            boolean newInput = input.yesNo("Would you like to create new item?");
            if (newInput) {
//
                //Selection loops:
                do{
                boolean additional = false;
                do {
                    System.out.println("Select a Category:\n1.Meat\n2.Dairy\n3.Seafood\n4.Vegetables\n5.Fruit\n6.Other\n");
                    System.out.print("Enter selection:");
                    int category = input.getInt(1,6);

                    input.getString();

                    if (category == 1){
                        printUserGrocery(Meat, "Meat", input);}
                    if (category == 2){
                        printUserGrocery(Dairy, "Dairy", input);}
                    if (category == 3){
                        printUserGrocery(Seafood, "Seafood", input);}
                    if (category == 4){
                        printUserGrocery(Vegetables, "Vegetables", input);}
                    if (category == 5){
                        printUserGrocery(Fruit, "Fruit", input);}
                    if (category == 6){
                        printUserGrocery(Other, "Other", input);}

                    System.out.println("\nFinalize item? [Yes] / [No]");
                    boolean additionalItem = input.yesNo();
                    if (additionalItem){
                        additional = false;}
                     if (!additionalItem){
                        additional = true;}
                    } while (additional);

                    System.out.println("Your Final List: ");
                    sort(Meat);
                    sort(Dairy);
                    sort(Vegetables);
                    sort(Seafood);
                    sort(Fruit);
                    sort(Other);

                    System.out.print("\nMake a new List? \n");
                     confirm = input.yesNo();

                    if (!confirm) {
                        System.out.println("Exiting...");
                    }

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
        add(Category,item,quantity);
        System.out.printf("%nYour %s list:%n", categoryName);
        sort(Category);
    }
    public static void add(HashMap<String, Integer> category, String item, int quantity) {
        category.put(item, quantity);
    }
    public static void sort(HashMap<String, Integer> Category){
        TreeMap<String, Integer> sorted = new TreeMap<>(Category);
        for(Map.Entry<String,Integer>entry: sorted.entrySet())
            System.out.printf("%s\t=\t%s\n",entry.getKey(),entry.getValue());
    }
}
//
//            while (!quit) {
//                Input userInput = new Input();
//                int choice = userInput.getInt();
//                switch (choice) {
//                    case 0:
////                        printInstructions();
//                        break;
//                    case 1:
////                        groceryList.printGroceryList();
//                        break;
//                    case 2:
////                        addItem();
//                        break;
//                    case 3:
////                    modifying();
//                        break;
//                    case 4:
////                    removeItem();
//                        break;
//                    case 5:
//                        searchForItem();
//                        break;
//                    case 6:
//                        quit = true;
//                        break;
//                }
//            }


//    public static void printInstructions() {
//        System.out.println("Select a Category:\n1.Meat\n2.Dairy\n3.Seafood\n4.Vegetables\n5.Fruit");
//        }
////        System.out.println("\nPress");
////        System.out.println("\t0 - to print choice options");
////        System.out.println("\t1 - to print the list of grocery items");
////        System.out.println("\t2 - to add an item to the list");
////        System.out.println("\t3 - to modify an item in the list");
////        System.out.println("\t4 - to remove an item from the list");
////        System.out.println("\t5 - to search for an item");
////        System.out.println("\t6 - to quit the application");
//        public static void addItem(){
//            Input addItem = new Input();
//            System.out.println("Enter item ");
//            list.addGroceryItem(addItem.getString());
//        }
//        public static void modifying(){
//            Input input = new Input();
//            int itemNo = input.getInt("Enter Item number ");
//            String newItem = input.getString("Enter Replacement ");
//            list.modifyingGroceryList(itemNo,newItem);
//        }
////        public static void removeItem(){
////            Input input = new Input();
////            int itemNo = input.getInt("Enter item number");
////            groceryList.removeGroceryItem(itemNo-1);
////        }
//        public static void searchForItem(){
//        Input input = new Input();
//        String searchItem= input.getString("Item search for: ");
//
//        if(list.findItem(searchItem) !=null){
//            System.out.println("Found "+ searchItem + "in grocery list");
//        }
//        else{
//            System.out.println(searchItem + "is not in the grocery list");
//            }
//        }




