package knd.handson.ramN.java7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertLowerCaseToUpperCase {

  public static void main(String[] args) {
    List<String> given = Arrays.asList("hi","hello","how are you","good moring");
    List<String> result = toUpperCase(given);
    System.out.println(result);
  }
  public static List<String> toUpperCase(List<String> given){

    List<String> convertedList = new ArrayList<>();
    for(String str : given){
      String convertedString = str.toUpperCase();
      convertedList.add(convertedString);
    }
    return convertedList;
  }
}
