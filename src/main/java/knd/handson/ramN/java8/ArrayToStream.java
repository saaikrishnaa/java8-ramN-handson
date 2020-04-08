package knd.handson.ramN.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {
//To do - Understand on how to work on a Stream that is already used earlier(the stream is closed)
  public static void main(String[] args) {
    Integer[] intArray = {1,3,4,5,7};

    Stream<Integer> intarrayToStreamOfInt = Arrays.stream(intArray);
    long result = intarrayToStreamOfInt.count();
    System.out.println("Count of numbers in Array that is converted to Stream are -> "+result);

//    Integer maximumElement = intarrayToStreamOfInt
//                                    .filter(n -> n >4)
//                                    .reduce(Integer::max)
//                                    .orElse(0);
//    System.out.println(maximumElement);
  }
}
