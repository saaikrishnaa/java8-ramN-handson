package knd.handson.ramN.java7;

import knd.handson.ramN.pojo.Person;
import knd.handson.ramN.util.PopulateData;

import java.util.ArrayList;
import java.util.List;

public class FilterPojoResultsCondition {

  public static void main(String[] args) {
    List<Person> personList = PopulateData.persons();

    List<Person> resultsList = fetchResultsBasedOnFilterCondition(personList,"M");
    System.out.println("Retrieved Person details are");
    for(Person person : resultsList)
      System.out.println(person+", ");
  }

  private static List<Person> fetchResultsBasedOnFilterCondition(List<Person> givenList, String filter){
    List<Person> filteredList = new ArrayList<>();
    for(Person person: givenList){
      if(person.getName().startsWith(filter))
        filteredList.add(person);
    }
    return filteredList;
  }
}
