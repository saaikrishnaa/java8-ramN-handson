package knd.handson.ramN.java7;

import knd.handson.ramN.pojo.Student;
import knd.handson.ramN.util.PopulateData;

import java.util.ArrayList;
import java.util.List;

public class StudentConditional {

  public static void main(String[] args) {

    //Calculate student score that's greater than 50
    List<Student> students = PopulateData.students();

    List<Student> scoreGT50 = new ArrayList<>();
    for(Student student : students){
      if(student.getScore() > 50)
        scoreGT50.add(student);
    }
    System.out.println("Students whose score is > 50 are ->");
    for(Student gt50Student : scoreGT50)
      System.out.println(gt50Student.getName()+" - "+gt50Student.getScore());

    //Calculate the average score of all Students
    int totalScore =0;
    int averageScore = 0;
    for(Student student: students){
      totalScore = totalScore+student.getScore();

    }
    averageScore = totalScore/students.size();

    System.out.println("Total score -> "+totalScore);
    System.out.println("Average score -> "+averageScore);
  }


}
