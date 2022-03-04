package groceryList;
import grades.Student;
import util.Input;

import java.util.HashMap;

public class GroceryListApplication {
    //PSEUDO:
public static void grocery() {
    Input input = new Input();
    Boolean userConfirm = input.yesNo("Would you like to create a new list?\n");
    while(true){
        Input input2 = new Input();
        String choices = input2.getString("Enter your selection: Meat || Dairy || Vegetables || Poultry");
        switch(choices){
            case "Meat":
                System.out.println("meat department");
                break;
            case "Dairy":
                System.out.println("dairy department");
                break;
            case "Vegetables":
                System.out.println("vegetables department");
                break;
            case "Poultry":
                System.out.println("poultry department");
                break;
            default:
                System.out.println("invalid");
            }
        }
    }



    public static void category() {
        HashMap<String, String> items = new HashMap<>();
        Input input = new Input();
        String choice = input.getString("Select the category: ");
    }

    public static void main(String[] args) {
    grocery();

    }
}