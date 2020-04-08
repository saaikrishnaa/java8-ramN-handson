package knd.handson.ramN.java7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FilterResultsFromMap {

  public static void main(String[] args) {
    Map<Integer,String> productMap = new HashMap<>();
    productMap.put(1,"Cricket Bat");
    productMap.put(2,"Cricket Ball");
    productMap.put(3,"Grace Ball");
    productMap.put(4,"Action Shoes");
    productMap.put(5,"Guards");

    String value = filterMapAndGetValueUsingKey(productMap,3);
    System.out.println(value);
  }
  public static String filterMapAndGetValueUsingKey(Map<Integer,String> givenMap,int givenKey){

    String valueToFetch= "";

    for(Map.Entry<Integer,String> entry :givenMap.entrySet()){

      if(entry.getKey() == givenKey)
        valueToFetch = entry.getValue();
    }
    return valueToFetch;
  }
}
