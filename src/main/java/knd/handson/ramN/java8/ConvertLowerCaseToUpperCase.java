package knd.handson.ramN.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertLowerCaseToUpperCase {

  public static void main(String[] args) {
    List<String> given = Arrays.asList("hi","hello","how are you","good moring");

   List<String> resultList = toUpperCase(given);
    System.out.println(resultList);
  }

  private static List<String> toUpperCase(List<String> given) {
    return given
            .stream()
            .map(s -> s.toUpperCase()+" ")
            //.forEach(System.out::print);
            .collect(Collectors.toList());
  }
}
