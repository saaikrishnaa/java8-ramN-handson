package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
//There should NOT be any duplicate key in a Map, there CAN BE duplicate values
  public static void main(String[] args) {
    List<Product> products = PopulateData.products();
    Map<Integer,Integer> productsMap = products.stream()
                                              .collect(Collectors.toMap(p -> p.getId(),p -> p.getPrice()));

    System.out.println("Results after converting a List to Map are -> "+productsMap);
  }
}
