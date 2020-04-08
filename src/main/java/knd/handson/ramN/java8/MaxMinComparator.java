package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.*;

public class MaxMinComparator {

  public static void main(String[] args) {
    List<Product> products = PopulateData.products();
    Product productWithMaximumPrice = products.stream()
                                            .max((p1,p2) -> p1.getPrice() > p2.getPrice()?1:-1)
                                            .get();
    System.out.println(productWithMaximumPrice);

    Product productWithMinProductPrice  = products.stream()
                                                .min((p1,p2) -> p1.getPrice() > p2.getPrice()?1:-1)
                                                .get();
    System.out.println(productWithMinProductPrice);


    List<Integer> integerList = Arrays.asList(1,2,3,4,5);

    Integer minimum = integerList
                          .stream()
                          .min(Comparator.comparing(Integer::valueOf))
                          .get();
    System.out.println(minimum);

    Integer maximum = integerList
                          .stream()
                          .max(Comparator.comparing(Integer::valueOf))
                          .get();
    System.out.println(maximum);


    //Sort Map
    Map<Integer,String> map = new HashMap<>();
    map.put(1,"Value1");
    map.put(2,"Value2");
    map.put(3,"Value3");
    map.put(4,"Value4");
    map.put(5,"Value5");

    map.entrySet()
        .stream()
        .sorted(Comparator.comparing(Map.Entry::getValue))
        .forEach(e -> System.out.println("Key - "+e.getKey()+", Value - "+e.getValue()));


  }
}
