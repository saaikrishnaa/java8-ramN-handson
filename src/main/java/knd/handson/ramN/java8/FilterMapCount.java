package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Person;
import knd.handson.ramN.util.PopulateData;

import java.util.List;

public class FilterMapCount {

  public static void main(String[] args) {

    List<Person> personDetails = PopulateData.persons();

    long result = personDetails.stream()
                        .filter(p -> p.getSex().charValue()=='M')
                        .map(filteredResults -> filteredResults.getDesignation())
                        .count();
    System.out.println("Number of Males in the Person list are - "+result);
  }
}
