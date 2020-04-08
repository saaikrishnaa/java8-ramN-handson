package knd.handson.ramN.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterArrayNames {
  public static void main(String[] args) {
    List<String> namesList = Arrays.asList("hi","sri","joe","daicy","dave","george","phalguni","david","mcmillan","thomas");
    String[] namesArray = {"hi","sri","joe","daicy","dave","george","phalguni","david","mcmillan","thomas"};

    //Filter namesList whose length is greater than 6
    List<String> filteredListNames = namesList.stream() //Stream<String>
                                     .filter(n -> n.length() > 6)//Stream<String>
                                     .collect(Collectors.toList());
    System.out.println("Result of List -> "+filteredListNames);




    Stream<String> arrayToStream = Arrays.stream(namesArray);
    List<String> filteredArrayNames = arrayToStream
                                            .filter(name -> name.length() > 6)
                                            .collect(Collectors.toList());
    System.out.println("Result of Array ->"+filteredArrayNames);
  }
}
