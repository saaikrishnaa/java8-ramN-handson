package knd.handson.ramN.java8;

import java.util.Arrays;
import java.util.List;

public class CalculateSumOfGivenNumbersOnCondition {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(20,10,40,30,22);
    int result = calculateConditionalSum(numbers);
    System.out.println("Result is - "+result);

  }

  private static int calculateConditionalSum(List<Integer> numbers) {

    return numbers
              .stream()
              .filter(i -> i>20)
              .mapToInt(i -> i)
              .sum();

  }
}
