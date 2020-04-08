package knd.handson.ramN.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
* toArray hsa two modes
*   1. Object[]  toArray()
*   2. <A> A[]   toArray(<A[]>)
* */
public class StreamToArrayUsingToArray {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5);
    Stream<Integer> listToStream = list.stream();

    Integer[] convertedArray = listToStream.toArray(Integer[]::new);
    for(int i : convertedArray)
      System.out.println(i);

  }
}
