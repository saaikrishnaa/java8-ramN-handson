package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Person;
import knd.handson.ramN.util.PopulateData;

import java.util.List;

public class ShortCircuitTerminalOperations {

  public static void main(String[] args) {

    List<Person> persons = PopulateData.persons();

    boolean result = persons
                        .stream() //Stream<Person>
                        .anyMatch(p -> p.getSex()=='M'); //boolean

    System.out.println("Once the condition satisfies, anyMatch will not process any other elements -> "+result);


    Person findFirstResult = persons
                                  .stream()//Stream<Person>
                                  .filter(p -> p.getSex() =='Z') //Stream<Person>
                                  .findFirst() //Optional<Person>
                                  .get();
                                 //.orElse(new Person("default-name",100,'A',"default-designation")); //Person

    System.out.println("Find first returns the first element from the stream, and not process any elements further"+findFirstResult);

    Person findAnyResult = persons
                                .stream()//Stream<Person>
                                .filter(p -> p.getSex() =='F') //Stream<Person>
                                .findAny() //Optional<Person>
                                .get(); //Person
    System.out.println(findAnyResult);


  }
}
