package knd.handson.ramN.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterCollectForEach {

  public static void main(String[] args) {
    List<String> givenNames = Arrays.asList("Amalapuram","Bhimavaram","Chintapadu","Chirala","Tagarapalasa","Kakinada","Vizag","Rajahmundry","Srikakulam","Rajolu");
    System.out.println("Filtered Names are ");
   filterNames(givenNames,"R");
  }


  private static void filterNames(List<String> inputList,String filterCondition){
      inputList.stream()
        .filter(name -> name.startsWith(filterCondition))
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }
}
