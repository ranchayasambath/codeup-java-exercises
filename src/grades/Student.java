package grades;
import java.util.ArrayList;

public class Student{
    private String names;
    ArrayList<Integer> grades = new ArrayList<>();
//constructor:
    public Student(String name){
        this.names = name;
        this.grades = new ArrayList<>();
    }

    //methods:
// returns the student's name
    public String getName(){
            return this.names;
    }
    // adds the given grade to the grades property
    public void addGrade(double grade){
        grades.add((int) grade);
    }
    // returns the average of the students grades
    public float getGradeAverage(){
        float sum=0;
        for(int grade:grades){
            sum = sum + grade;
        }
        return (sum/grades.size());
    }
    // returns grades accumulation
    public int totalGrades(){
        int sum=0;
        for(int grade:grades){
            sum = sum + grade;
        }
        return (sum);
    }
    //returns the list of grades
    public ArrayList<Integer> gradesList( ) {
        return this.grades;
    }
    public static void main(String[] args){
        Student jack= new Student("Jack");
        Student james= new Student("James");
        jack.addGrade(100);
        jack.addGrade(20);
        jack.addGrade(60);

        james.addGrade(0);
        james.addGrade(20);
        james.addGrade(30);

        System.out.printf("%s's total grade is: %d.%n",jack.getName(),jack.totalGrades());
        System.out.printf("%s's grades are: %s.%n",jack.getName(),jack.gradesList());
        System.out.printf("%s's average grade is: %.1f.%n",jack.getName(),jack.getGradeAverage());
        System.out.println("");
        System.out.printf("%s's total grade is: %d.%n",james.getName(),james.totalGrades());
        System.out.printf("%s's grades are: %s.%n",james.getName(),james.gradesList());
        System.out.printf("%s's average grade is: %.1f.%n",james.getName(),james.getGradeAverage());
    }
}