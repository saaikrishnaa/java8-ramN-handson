package knd.handson.ramN.java8;

import java.util.stream.Stream;

public class ReuseStream {
  public static void main(String[] args) {
    Stream<String> stringStream = Stream.of("A","B","C");
    String value = stringStream
                    .findFirst()
                    .get();

    System.out.println(value);

    String canIReuseAStream = stringStream
                                  .findAny()
                                  .get();
    System.out.println(canIReuseAStream);


  }
}
