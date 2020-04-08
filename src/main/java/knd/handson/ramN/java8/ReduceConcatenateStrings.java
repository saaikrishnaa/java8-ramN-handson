package knd.handson.ramN.java8;

import java.util.Arrays;

public class ReduceConcatenateStrings {

  public static void main(String[] args) {

    String[] names = {"Hi!","This is Sai Krishna","!!"};

    String result = Arrays
                        .stream(names)//Stream<String>
                        //.reduce("",(one,two) -> one+two);
                        .reduce((string1,string2) -> string1+string2)
                        .get();

    System.out.println(result);

  }
}
