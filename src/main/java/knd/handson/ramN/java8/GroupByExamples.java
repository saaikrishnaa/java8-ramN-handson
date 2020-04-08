package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.MCAStudent;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExamples {
  public static void main(String[] args) {
    //Group by teacher name
    List<MCAStudent> mcaStudents = PopulateData.mcaStudents();

    Map<String, List<MCAStudent>> studentsGroupedByTeacherMap = mcaStudents
                                                                    .stream()
                                                                    .collect(Collectors.groupingBy(/*mca -> mca.getTeacherName()*/MCAStudent::getTeacherName));
    for(Map.Entry<String, List<MCAStudent>> entry : studentsGroupedByTeacherMap.entrySet())
      System.out.println("For teacher -> "+entry.getKey()+", the students are \n"+entry.getValue());
    System.out.println("-----------------------------------");

    //Group the classes by level
   Map<Integer,List<MCAStudent>> classLevelGroupByMap = mcaStudents
                                                            .stream()
                                                            .collect(Collectors.groupingBy(MCAStudent::getLevel));

   for(Map.Entry<Integer,List<MCAStudent>> entry: classLevelGroupByMap.entrySet())
     System.out.println("For Level -> "+entry.getKey()+", the grouped results are \n"+entry.getValue());
    System.out.println("-----------------------------------");

   //Count the number of classes per level
   Map<Integer,Long> classesPerLevelMap = mcaStudents
                                              .stream()
                                              .collect(Collectors.groupingBy(MCAStudent::getLevel,Collectors.counting()));
   for(Map.Entry<Integer, Long> entry: classesPerLevelMap.entrySet())
     System.out.println("For the level - "+entry.getKey()+", the number of class details are "+entry.getValue());

  }
}
