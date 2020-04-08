package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.stream.Stream;

public class StreamIterateMethod {

  public static void main(String[] args) {

    List<Product> products = PopulateData.products();

    Stream.iterate(1,element -> element+1)
          .filter(element -> element%10 == 0)
          .limit(3)
          .forEach(System.out::println);
  }
}
