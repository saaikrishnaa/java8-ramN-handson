package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Person;
import knd.handson.ramN.util.PopulateData;

import java.util.List;

public class FilterMapFindAnyOrElse {

  public static void main(String[] args) {
    List<Person> personList = PopulateData.persons();

    //To convert a Stream of Person to Stream of String using map() method of Stream
    String result = personList.stream()
                      .filter(person -> person.getName().equals("Thunderbolt"))
                      .map(Person::getName) // or .map(person -> person.getName())
                      .findAny()
                      .orElse("No name is returned");
    System.out.println("Result - "+result);
  }
}
