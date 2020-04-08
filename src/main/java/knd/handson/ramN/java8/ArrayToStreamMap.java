package knd.handson.ramN.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToStreamMap {
  public static void main(String[] args) {
    String[] names = new String[]{"Steve","Smith","Arnold","Roger","Max","Nadal"};

    List<String> uppercaseNames = Arrays.stream(names)
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
    System.out.println(uppercaseNames);
  }
}
