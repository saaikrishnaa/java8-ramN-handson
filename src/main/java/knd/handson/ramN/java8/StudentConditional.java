package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Student;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.stream.Collectors;

public class StudentConditional {
  public static void main(String[] args) {

    List<Student> students = PopulateData.students();

    //calculate students whose score is > 50
                              students
                                      .stream()
                                      .filter( s -> s.getScore() > 50)
                                      //.collect(Collectors.toList());
                                      .forEach(System.out::println);
  //calculate the average of all the students
    int total = students
                    .stream()
                    .mapToInt(s -> s.getScore())
                    .sum();
    System.out.println("Total ->"+total);

    double average = students
                      .stream()
                      .mapToInt(s -> s.getScore())
                      .average()
                      .getAsDouble();
    System.out.println("Average ->"+average);

    //find top three students
    students
        .stream()
        .filter(s -> s.getScore() > 70)
        .sorted((s1,s2) -> s2.getName().compareTo(s1.getName())) //I can use compareTo method for other fields too other that that is mentioned in basics - Student's compareTo() method
        .limit(3)
        .forEach(System.out::println);
  }
}
