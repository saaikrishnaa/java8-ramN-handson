package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMapSet {

  public static void main(String[] args) {
    List<Product> products = PopulateData.products();
    Set<Integer> uniqueResults = products.stream()
                  .filter(p -> p.getPrice() < 90L)
                  .map(Product::getPrice)//.map(p -> p.getPrice())
                  .collect(Collectors.toSet());

    System.out.println("Unique results -> "+uniqueResults);
  }
}
