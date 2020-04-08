package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
//To apply method reference, the interface MUST be a functional interface, I CANNOT use method reference to a filter, as the filter expects a boolean as argument
  public static void main(String[] args) {
    List<Product>  products = PopulateData.products();
    List<Integer> filteredProducts = products.stream()
                                          .filter(p -> p.getPrice() <50)
                                          .map(Product::getPrice)//.map(p -> p.getPrice())
                                          .collect(Collectors.toList());

    System.out.println(filteredProducts);

  }
}

