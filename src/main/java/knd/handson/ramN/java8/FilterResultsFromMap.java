package knd.handson.ramN.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterResultsFromMap {
  public static void main(String[] args) {
    Map<Integer,String> productMap = new HashMap<>();
    productMap.put(1,"Cricket Bat");
    productMap.put(2,"Cricket Ball");
    productMap.put(3,"Grace Ball");
    productMap.put(4,"Action Shoes");
    productMap.put(5,"Guards");

    Map<Integer,String> map = filterMapAndGetValueUsingKey(productMap,3);
    System.out.println(map);
  }

  private static Map<Integer,String> filterMapAndGetValueUsingKey(Map<Integer,String> productMap, int i) {
    return productMap
              .entrySet()
              .stream()
              .filter(id -> id.getKey() == i)
              //.map(entryToValue -> entryToValue.getValue())
              //.findFirst()
              //.get(); --> Way 1
              //.collect(Collectors.joining()); --> Way 2
              .collect(Collectors.toMap(p -> p.getKey(),p -> p.getValue())); //--> Way 3
  }


}
