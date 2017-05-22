package Java2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cstoker on 5/22/17.
 */
public class Student {

//  class properties
    private String name;
    private List<Integer> grades;

//  constructor
    public Student(String name) {

        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

//  method returns value of name
    public String getName() {

        return name;

    }

    public void addGrade(Integer grade) {

        this.grades.add(grade);
    }

//  grab all grades and divide
    public double getGradeAverage() {

        double gradeTotal = 0; // accumulator;

        for (double grade : this.grades) {
            gradeTotal += grade;
        }
        return gradeTotal/this.grades.size();

    }

}
