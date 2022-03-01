import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------
        // In-class warm-up exercise:

//        Write a program that creates an array, and then prints the sum of the even and odd integers in a new array [sumOdd, sumEven]
//        example: [2,4,8,5,1,2];
//        output; [6,16]
//        reason: 2+4+8+2 = 16
//        5+1 = 6

        int[] warmup = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] oddEven = new int[2];
//        int odd = 0;
//        int even = 0;
//        for (int num : warmup) {
//            if (num % 2 == 0) {
//                even += num;
//            } else {
//                odd += num;
//            }
//        }
//        oddEven[0]= odd;
//        oddEven[1]= even;
//        System.out.println(Arrays.toString(oddEven));

//--------------------- Calling method --------------------------------------------------------------------------------
        System.out.println(Arrays.toString(warmupMethod(warmup)));
//---------------------------------------------------------------------------------------------------------------------
//        1. Array Basics:
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
    }
//------------------------------IN-class warm-up Method Calling--------------------------------------------------------
    public static int[] warmupMethod(int[] ogArr) {
        int[] oddEven = new int[2];
        int odd = 0;
        int even = 0;
        for (int num : ogArr) {
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        oddEven[0] = odd;
        oddEven[1] = even;
//        System.out.println(Arrays.toString(oddEven));
        return oddEven;
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
//---------------------------------------------------------------------------------------------------------------------

}