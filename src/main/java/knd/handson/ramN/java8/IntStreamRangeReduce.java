package knd.handson.ramN.java8;

import java.util.stream.IntStream;

public class IntStreamRangeReduce {

  public static void main(String[] args) {

    int result1 = IntStream
                    .range(2,5)
                    //.sum();
                    .reduce((n1,n2) -> n1+n2)
                    .getAsInt();

    System.out.println("Sum of 2+3+4 -> "+result1);

    int result2 = IntStream
                      .range(4,7)
                      .reduce(5,(n1,n2) -> (n1+n2));
    System.out.println("Sum of 5+  4+5+6 -> "+result2);



  }
}
