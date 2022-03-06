package groceryList;
import grades.Student;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApplication {
    public static void main(String[] args) {
        //collections of category
        HashMap<String, String> grocery = new HashMap<>();
        ArrayList<String> meat = new ArrayList<>();
        ArrayList<String> dairy = new ArrayList<>();
        ArrayList<String> vegetables = new ArrayList<>();
        ArrayList<String> poultry = new ArrayList<>();
        Input input = new Input();
        Boolean userConfirm = input.yesNo("Would you like to create a new list?\n");
        if (userConfirm) {
                boolean enterNewItem = input.yesNo("Enter new item?\n");
                while(enterNewItem){
                    // request category from user.
                    int userCategory = input.getInt("1. Meat" +
                            "2.Dairy" +
                            "3.Vegetables" +
                            "4.Poultry",1,4);
                    //request item's name
                    String itemName = input.getString("Enter item name: ");

                    //request quantity
                    int itemAmount = input.getInt("Enter quantity of item: ");

                    //create or add new item
//                    if(grocery.containsKey(itemName)){
//                        String currentItem = grocery.get(itemName);
//                        currentItem.setQuaniti
//                    }



                }
        }
    }
}


