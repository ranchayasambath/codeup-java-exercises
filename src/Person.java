public class Person {

//Create Person class inside of src that has a private name field that is a string,
    private String Name;
    //Create class that creates a new `Person` object to test
    public Person(String name){
        this.Name = name;
    }
//-----------------------------------------------------------------------------
    public String getName(){
//TODO: return the person's name
        return this.Name;
    }
//-----------------------------------------------------------------------------
    //The class should have a constructor that accepts a `String` value and sets the person's name to the passed string.
    public void setName(String newName){
//TODO: change the name field to the passed value
        this.Name = newName;
        this.sayHello();
    }
//-----------------------------------------------------------------------------
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello my name is %s\n",this.Name);
    }
//-----------------------------------------------------------------------------
    //Create a `main` method
    public static void main(String[] args) {

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//-----------------------------------------------------------------------------
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//-----------------------------------------------------------------------------
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }

}