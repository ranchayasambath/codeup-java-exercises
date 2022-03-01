import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
//        1.
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        Person [] person = new Person[3];
//        person[0] = new Person("George");
//        person[1] = new Person("Mike");
//        person[2] = new Person("Adam");
        Person[] person = {new Person("George"), new Person("Mike"), new Person("Adam")};
//        for (Person name : person) {
////            System.out.println(name.getName());
//        }
        Person john = new Person("John");
        addPerson(person, john);

        // in-class exercise:
//        System.out.println(sumAll());
    }

    //accept Person Array object and Person object.
    public static void addPerson(Person[] person, Person nextPerson) {
        // Returning copy of original array +1;
        Person[] newArray = Arrays.copyOf(person, person.length + 1);
        // At the end of the array add nextPerson object.
        newArray[newArray.length - 1] = nextPerson;
        //loop through the new list and print out names.
        for (Person addedPerson : newArray) {
            System.out.println(addedPerson.getName());
        }



    // in-class exercise:
//    public static int sumAll(){
//        int sum=0;
//        int[] nums = {1,2,3,4,5};
//        for(int n: nums){
//            sum = sum + n;
//        }
//        return sum;
//    }
}
}