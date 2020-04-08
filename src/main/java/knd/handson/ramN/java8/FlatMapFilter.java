package knd.handson.ramN.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapFilter {
  public static void main(String[] args) {
     Integer[][] twoDimensionalArray = {{1,2},{3,4},{5,6}};
    Stream<Integer[]> twoDimensionalArrayStream = Arrays.stream(twoDimensionalArray);
    twoDimensionalArrayStream
        .flatMap(individualSubIntegerArray -> Arrays.stream(individualSubIntegerArray)) // row -> Arrays.stream(row)
        .map(i2l -> i2l.toString())
        .filter(odd -> Integer.parseInt(odd)%2==1)
        .forEach(System.out::print);
  }
}
