package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.List;

public class FilterWithMultipleConditions {

  public static void main(String[] args) {
    List<Product> names = PopulateData.products();

    Product productMatchingFilterCriteria = names
                                              .stream()
                                              .filter(p -> p.getName().startsWith("A") && p.getPrice()>60)
                                              //.forEach(System.out::println);
                                              .findFirst()
                                              .orElse(new Product(0,"null",0));

    System.out.println(productMatchingFilterCriteria);
  }
}
