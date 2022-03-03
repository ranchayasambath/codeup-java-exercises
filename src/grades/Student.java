package grades;
import java.util.ArrayList;

public class Student{
    private String names;
    ArrayList<Integer> grades = new ArrayList<>();
//constructor:
    public Student(String studentNames){
        this.names = studentNames;
        this.grades = new ArrayList<>();
    }
//methods:
// returns the student's name
    public String getName(){
            return this.names;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public int getGradeAverage(){
        int sum=0;
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
    public static void main(String[] args) {
        Student student1= new Student("Jack");
        Student student2= new Student("James");
        student1.addGrade(100);
        student1.addGrade(20);
        student1.addGrade(60);

        student2.addGrade(0);
        student2.addGrade(20);
        student2.addGrade(30);

        System.out.println(student1.totalGrades());
        System.out.println(student1.gradesList());
        System.out.printf("%s's grade is: %d.%n",student1.getName(),student1.getGradeAverage());

        System.out.println(student2.totalGrades());
        System.out.println(student2.gradesList());
        System.out.printf("%s's grade is: %d.%n",student2.getName(),student2.getGradeAverage());
    }
}