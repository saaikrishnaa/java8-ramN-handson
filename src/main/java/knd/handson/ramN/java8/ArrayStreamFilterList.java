package knd.handson.ramN.java8;

import java.util.stream.Stream;

public class ArrayStreamFilterList {

  public static void main(String[] args) {
    Integer[] inputArray = {1,2,3,4,5,6,7,8,9,10};

    Stream<Integer> toStream = Stream.of(inputArray);
    toStream
        .filter(num -> num%2 == 0)
        .forEach(System.out::println);

  }
}
