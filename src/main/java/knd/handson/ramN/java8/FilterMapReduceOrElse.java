package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Person;
import knd.handson.ramN.util.PopulateData;

import java.util.List;

public class FilterMapReduceOrElse {

  public static void main(String[] args) {
    List<Person> personList = PopulateData.persons();

    Integer result = personList.stream()
                            .filter(person -> person.getSex().charValue()=='F')
                            .map(convertPersonToInt -> convertPersonToInt.getAge())
                            .reduce(Integer::sum) //.reduce(0,Integer::sum); using reduce i can do arithmetic and string concatenation operations
                            .orElse(0);

    System.out.println(result);

  }
}
