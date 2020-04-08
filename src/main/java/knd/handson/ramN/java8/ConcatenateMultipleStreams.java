package knd.handson.ramN.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateMultipleStreams {
  public static void main(String[] args) {

    List<String> names = Arrays.asList("A","B","C");
    List<Integer> numbers = Arrays.asList(1,2,3);

    Stream
        .concat(names.stream(),numbers.parallelStream())
        .forEach(System.out::println);
  }
}
