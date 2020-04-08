package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Author;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentWaysToCreateStream {

  public static void main(String[] args) {

    //1 - Stream.of(individual values)
    Stream<Integer> integerStream = Stream.of(1,2,3,4,5);
    integerStream.forEach(System.out::print);
    System.out.println("--------");

    //2 - Stream.of(array of elements)
    Integer[] integersArray = {1,2,3,4,5,6,7,8,9,10};
    //Stream<Integer> integerArrayStream = Stream.of(integersArray); or
    Stream<Integer> integerArrayStream = Arrays.stream(integersArray);
    integerArrayStream.forEach(integervalue -> System.out.print(integervalue));
    System.out.println("--------");

    //3 - Create Stream using a List
    List<Integer> integerList = new ArrayList<>();
    for(int i=0;i<5;i++)
      integerList.add(i);

    Stream<Integer> integerListStream = integerList.stream();
    integerListStream.forEach(System.out::print);
    System.out.println("--------");

    //4 - using Steam.generate()
    List<String> stringList = new ArrayList<>();
    Stream<Author> authorStream = Stream.generate(() -> new Author("SaiKrishna",35,"Telugu",'M'));
    authorStream
        .limit(2)
        .forEach(System.out::println);
    System.out.println("--------");

    //5 - using Stream.iterate()
    Stream<Integer> intIterateStream = Stream.iterate(10,argument -> argument/1);
    Integer result = intIterateStream
                          .limit(2)
                          .reduce((a,b) -> (a*b))
                          .orElse(0);
                        //.forEach(p -> System.out.println(p));

    System.out.println(result);
    System.out.println("--------");

    //6 - using String chars()
    IntStream intStreamUsingStringChars = "AaBb".chars();
    intStreamUsingStringChars
        //.limit(10)
        .forEach(i -> System.out.println(i));
    System.out.println("--------");

    //7 - using String tokens
    Stream<String> tokenStringStream = Stream.of("A#B#C".split("\\#"));
    tokenStringStream.forEach(System.out::println);

    //8 - Create a stream using static factory methods
    //Stream.of(), IntStream.range(), Stream.iterate(), Stream.empty(), Stream.generate()
    //now remaining is IntStream.range()
    System.out.println("-----------");
    IntStream intStream = IntStream.range(1,6);
    System.out.println(
        intStream
              .max()
              .getAsInt()
    );
  //9 - using Stream.empty()
    System.out.println("-----------");
    Stream<String> emptyStringStream = Stream.empty();
    long emptyStreamResult = emptyStringStream.count();
    System.out.println(emptyStreamResult);


  //10 - using methods in java.nio.file.Files

  //11 - using Pattern.compile("\\W").splitAsStream("");
    String input = "Hi,How,are,you";
    Pattern.compile(",").splitAsStream(input).forEach(System.out::print);

  }


}
