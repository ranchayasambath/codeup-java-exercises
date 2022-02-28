import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person [] person = new Person[3];
        person[0] = new Person("George");
        person[1] = new Person("Mike");
        person[2] = new Person("Adam");
        for(Person name : person){
            System.out.println(name.getName());
        }
    }
//    public static addPerson(){

//    }
}