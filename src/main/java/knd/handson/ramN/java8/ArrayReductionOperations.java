package knd.handson.ramN.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayReductionOperations {

  //Reduction operations compute the result using ALL the elements present in the stream

  public static void main(String[] args) {
    int[] integerArray = {2,3,4,5,1,6,9,3,4,10};

    System.out.println("Converting Array to Stream and getting sum from converted stream using reduction -> "+Arrays.stream(integerArray).sum());

    System.out.println("Converting Array to Stream and getting average from converted stream using reduction -> "+Arrays.stream(integerArray).average());

    System.out.println("Converting Array to Stream and getting min from converted stream using reduction -> "+Arrays.stream(integerArray).min());

    System.out.println("Converting Array to Stream and getting max from converted stream using reduction -> "+Arrays.stream(integerArray).max());

    System.out.println("Converting Array to Stream and getting count from converted stream using reduction -> "+Arrays.stream(integerArray).count());
  }
}
