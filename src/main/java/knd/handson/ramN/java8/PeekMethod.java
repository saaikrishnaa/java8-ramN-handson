package knd.handson.ramN.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekMethod {

  public static void main(String[] args) {
    Stream
        .of("a","aa","aaaaa","aaaa")
        .filter(string -> string.length() > 3)
        .peek(s -> System.out.println(">>>>>>>>"+s))
        .map(str -> str.toUpperCase())
        .peek(s -> System.out.println(">>>>>>>"+s))
        .collect(Collectors.toList());
  }
}
