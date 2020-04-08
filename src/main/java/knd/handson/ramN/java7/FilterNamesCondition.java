package knd.handson.ramN.java7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterNamesCondition {
  public static void main(String[] args) {

    List<String> givenNames = Arrays.asList("Amalapuram","Bhimavaram","Chintapadu","Chirala","Tagarapalasa","Kakinada","Vizag","Rajahmundry","Srikakulam","Rajolu");
    List<String> resultNames = filterNames(givenNames,"R");
    System.out.println("Filtered Names are ");
    for(String name: resultNames)
      System.out.print(name+", ");
  }

  private static List<String> filterNames(List<String> inputList,String filterCondition){

    List<String> filteredNamesList = new ArrayList<>();
    for(String name : inputList){
      if(name.startsWith(filterCondition)){
        filteredNamesList.add(name);
      }
    }
    return filteredNamesList;
  }
}
