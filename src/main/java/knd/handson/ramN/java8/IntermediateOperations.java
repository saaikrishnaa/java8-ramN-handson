package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.stream.Stream;

/*
* Intermediate operations are LAZY, means, until the terminal operation is called, the intermediate operations will not get executed
* 1. filter()
* 2. map()
* 3. distinct()
* 4. sorted()
* 5. limit()
* */
public class IntermediateOperations {
  public static void main(String[] args) {

    List<Product> understandFilter = PopulateData.products();
            understandFilter
                .stream()
                .filter(p -> {
                  //System.out.println("Until terminal operation is called, I will not get print");
                  return p.getPrice() >50;
                })
                .forEach(System.out::println);//Consumer<? super Product>

    System.out.println("-----------------------");

    List<Product> understandMap = PopulateData.products();
    understandFilter
        .stream()
        .map(p2i -> p2i.getId())
        .forEach(pid -> System.out.println(pid));

    System.out.println("-----------------------");

  List<Product> understandDistinct = PopulateData.products();

  understandDistinct
      .stream()
      .map(p2i->p2i.getId())
      .distinct()
      .forEach(System.out::print);

    System.out.println("-----------------------");
    List<Product> understandSorted = PopulateData.products();
    understandSorted
        .stream()
        .map(p2i -> p2i.getId())
        .sorted()
        .distinct()
        .forEach(System.out::println);

    System.out.println("-----------------------");

    List<Product> understandLimit = PopulateData.products();
    understandLimit
        .stream()
        .limit(3)
        .forEach(System.out::println);

    System.out.println("---------- To prove that same stream can be used again, not like terminal operation -------------");

    understandLimit
        .stream()
        .limit(3)
        .forEach(System.out::println);

    List<Product> cantUseTerminalOperationMoreThanOnce = PopulateData.products();
    Stream<Product> productStream= cantUseTerminalOperationMoreThanOnce
                                                .stream();
    System.out.println("-------------Terminal operation used once----------");
    productStream
        .forEach(System.out::println);
    System.out.println("------------Terminal operation used twice----------");
    productStream
        .forEach(p -> System.out.println(p));





  }
}
