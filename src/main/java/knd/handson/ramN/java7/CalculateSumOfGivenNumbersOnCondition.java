package knd.handson.ramN.java7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CalculateSumOfGivenNumbersOnCondition {

  public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(20,10,40,30,22);
    int result = calculateConditionalSum(numbers);
    System.out.println("Result is - "+result);
  }

  public static int calculateConditionalSum(List<Integer> givenNumbers){

    Iterator<Integer> it = givenNumbers.iterator();

    int sum = 0;

    while(it.hasNext()){

      int number = it.next();
      if(number > 20)
        sum = sum + number;
    }
    return sum;
  }
}
