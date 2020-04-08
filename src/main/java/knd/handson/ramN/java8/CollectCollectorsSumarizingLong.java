package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class CollectCollectorsSumarizingLong {

  public static void main(String[] args) {

    List<Product> productsList = PopulateData.products();

    LongSummaryStatistics statistics = productsList.stream()
                                                   .collect(Collectors.summarizingLong(p -> p.getPrice()));

    System.out.println(statistics);

  }

}
