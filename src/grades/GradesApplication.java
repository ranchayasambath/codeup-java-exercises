package grades;
import java.util.HashMap;
import util.Input;
//2.Create a map for students and GitHub usernames
public class GradesApplication {
    public static void main(String[] args) {
        // We'll start by defining a hash map
        HashMap<String, Student> students = new HashMap<>();
        //Four student objects and add at least 3 grades to each...
        Student mark = new Student("Mark");
        mark.addGrade(90.53);
        mark.addGrade(23.45);
        mark.addGrade(59.43);
        Student chris = new Student("Christian");
        chris.addGrade(17.25);
        chris.addGrade(32.33);
        chris.addGrade(63.34);
        Student andrew = new Student("Andrew");
        andrew.addGrade(20.56);
        andrew.addGrade(42.43);
        andrew.addGrade(39.22);
        Student henry = new Student("Henry");
        henry.addGrade(12.48);
        henry.addGrade(35.25);
        henry.addGrade(89.59);

        // ...and putting some data into HashMap's keys
        students.put("HamilTheJester", mark);
        students.put("BaleTheDarkKnight", chris);
        students.put("GarfieldTheFriendlyNeighborhood", andrew);
        students.put("CavilTheAlien", henry);

        //Testing methods with key:
//        System.out.println(students.get("HamilTheJester").getName());
//        System.out.printf(("%.1f"),students.get("HamilTheJester").getGradeAverage());
//----------------------------------------------------------------------------------------------------------------------
        //3.Create the command line interface
        boolean choice=true;
        while(choice){
            Input userInput = new Input();
            String selection = userInput.getString("\nWelcome!\n" +
                    "\n" +
                    "Here are the GitHub usernames of our students:\n" +
                    "\n" +
                    "|HamilTheJester| |BaleTheDarkKnight| |GarfieldTheFriendlyNeighborhood| |CavilTheAlien|\n" +
                    "\n" +
                    "What student would you like to see more information on?\n");
            if (!students.containsKey(selection)){
                System.out.printf("%nSorry, no student found with the GitHub username of \"%s\".%n", selection);
            }else{
                System.out.printf("Name: %s - GitHub Username: %s  %nCurrent Average: %.1f%n" ,students.get(selection).getName(),selection,students.get(selection).getGradeAverage());
            }
            choice= userInput.yesNo("\nWould you like to see another student?\n");
            System.out.println("\nGoodbye, and have a wonderful day!");
        }
    }
}
