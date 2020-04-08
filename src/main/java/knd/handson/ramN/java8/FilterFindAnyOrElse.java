package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Person;
import knd.handson.ramN.util.PopulateData;

import java.util.List;

public class FilterFindAnyOrElse {

  public static void main(String[] args) {
    List<Person> personList = PopulateData.persons();

    Person personDetails = fetchResultsBasedOnFilterCondition(personList, "T");
    System.out.println("Retrieved Person details are "+personDetails);
  }


  private static Person fetchResultsBasedOnFilterCondition(List<Person> personList, String m) {

    //way-1
//    personList.stream()
//        .filter(person -> person.getName().startsWith(m))
//        .collect(Collectors.toList())
//        .forEach(System.out::println);
//
    //way-2
    return personList.stream()
        .filter(person -> person.getName().startsWith(m))
        .findAny()
        .orElse(new Person("no-name-is-retrieved",00,'N',"no-designation-for-noname"));
//  }

  }
}
