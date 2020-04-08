package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Person;
import knd.handson.ramN.util.PopulateData;

import java.util.List;

public class SortedMethod {

  public static void main(String[] args) {

    List<Person> persons = PopulateData.persons();

    persons
        .stream()
        .filter(p -> p.getSex()=='M')
        .map(p2s -> p2s.getName())
        .sorted()// For Desceding order -.sorted((n1,n2) -> n2.compareTo(n1))
        .forEach(System.out::println);
  }
}
