package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamToUnmodifiableSet {
  public static void main(String[] args) {
    List<Product> products = PopulateData.products();
    Set<Product> unmodifiableProductSet = products
                                              .stream()
                                              .collect(Collectors.collectingAndThen(
                                                  Collectors.toSet(),
                                                  Collections::unmodifiableSet
                                              ));

    System.out.println(unmodifiableProductSet);
  }
}
