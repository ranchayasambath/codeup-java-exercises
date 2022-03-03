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
    public double getGradeAverage(){
        float sum=0;
        for(float grade:grades){
            sum = sum + grade;
        }
        return (sum/grades.size());
    }

    public static void main(String[] args) {

    }

}