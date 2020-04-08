package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.FNLN;
import knd.handson.ramN.pojo.Product;
import knd.handson.ramN.util.PopulateData;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TerminalOperations {
  public static void main(String[] args) {
    /*
    * Terminal operations
    *  - Terminal operations return a result of certain type, instead of Stream
    *   1. forEach()*
    *   2. collect()*
    *     - Collectors.groupingBy(Function<T,R>)*
    *     - Collectors.joining
    *   3. anyMatch(Predicate<T>)* - returns true if any element of the stream matches the predicate
    *   4. allMatch(Predicate<T>)* - returns true if all elements of stream match the predicate OR if the stream is empty
    *   5. noneMatch(Predicate<T>)* - returns true if no element match the predicate or if the stream is empty
    *   6. count()*
    *   7. reduce(BinaryOperator<T>)* - processes ALL elements of the stream and produces a single result
    *   8. toArray()*
    *   9. min()*
    *   10. max()*
    *   11. Collectors
    * */

    List<Product> products = PopulateData.products();

    boolean anyMatch = products
                        .stream()//Stream<E>
                        .filter(p -> p.getName().length() >= 2)//Stream<T>
                        .map(p -> p.getName())//Stream<R>
                        .anyMatch(p -> p.startsWith("T"));//boolean

          long count = products
                          .stream()//Stream<T>
                          .filter(p -> p.getName().length() > 2)//Stream<T>
                          .count();

    boolean noneMatch = products
                          .stream()//Stream<E>
                          .filter(p -> p.getName().length() > 2)//Stream<T>
                          .map(p2s -> p2s.getName())//Stream<R>
                          .noneMatch(n -> n.startsWith("this-prefix-is-not-there-hence-returning-true"));//boolean

    boolean allMatch = products
                          .stream()//Stream<E>
                          .filter(p -> p.getName().length() > 2)//Stream<T>
                          .map(p2s -> p2s.getName())//Stream<R>
                          .noneMatch(n -> n.startsWith("A"));//boolean

    List<Product> resultList = products
                                .stream()//Stream<All Elements>
                                .filter(p -> p.getName().length() > 5)//Stream<T>
                                .collect(Collectors.toList());

   Integer totalOfAllProductIds =  products
                                      .stream() //Stream<AllElements>
                                      .map(p2i -> p2i.getId())//Stream<Result> which is int
                                      .reduce((firstIntArgument,secondIntArgument) -> (firstIntArgument+secondIntArgument))//means total of all id's, returns Optional<T>
                                      //.isPresent();//boolean
                                      .get();

    System.out.println(anyMatch);
    System.out.println(count);
    System.out.println(noneMatch);
    System.out.println(allMatch);//returns false as not all products starts with A, but a few
    System.out.println(resultList);


    products
        .stream()
        .map(p2l -> p2l.getPrice())
        .forEach(System.out::println);//Consumer<? super Long>

    System.out.println("Total of all product ids ->"+totalOfAllProductIds);



    Object[] productsEndWithP = products
                                  .stream()
                                  .map(p2n -> p2n.getName())
                                  .filter(n -> n.endsWith("p"))
                                  .toArray();

    for(Object productWithFilteredCriteria : productsEndWithP)
      System.out.println(productWithFilteredCriteria);


    Integer[] productIdsWithMatchedFilterCrteria =  products
                                                        .stream()
                                                        .map(p2i -> p2i.getId())
                                                        .filter(i -> i > 3)
                                                        .toArray(Integer[]::new);
    for(Integer productIdMatchedWithFilterCriteria : productIdsWithMatchedFilterCrteria)
      System.out.println(productIdMatchedWithFilterCriteria);


    List<Integer> integers = Arrays.asList();
    boolean allMatchResultIfStreamIsEmpty = integers
                                                .stream()
                                                .allMatch(i -> i >2);
    System.out.println(allMatchResultIfStreamIsEmpty);

    boolean noneMatchResult = integers
                                  .stream()
                                  .noneMatch(i -> i<10);
    System.out.println(noneMatchResult);

    //Min and Max
     int minimumElement = products
                            .stream()
                            .map(p2i -> p2i.getId())
                            .min((pid1,pid2) -> pid1.compareTo(pid2))
                            .get();
    System.out.println(minimumElement);

    int maximumElement = products
        .stream()
        .map(p2i -> p2i.getId())
        .max((pid1,pid2) -> pid1.compareTo(pid2))
        .get();
    System.out.println(maximumElement);

    int minResultOfIntStream = IntStream
                                  .of(1,2,3,4,5)
                                  .min()
                                  .getAsInt();

    System.out.println(minResultOfIntStream);

    int maxResultOfIntStream = IntStream
                                      .of(1,2,3,4,5)
                                      .max()
                                      .getAsInt();
    System.out.println(maxResultOfIntStream);


    //Collectors.groupingBy(Function<T,R>)
    List<FNLN> namesList = PopulateData.names();

    Map<String,List<FNLN>> resultsGroupedByFirstName
        = namesList
            .stream()
            .sorted()
            .collect(Collectors.groupingBy(groupingBy -> groupingBy.getLastName()));

            resultsGroupedByFirstName.forEach((fn,fnlnObject) -> System.out.println(fn+", "+fnlnObject));

   //Collectors.toMap()
   namesList
       .stream()
       .collect(Collectors.toMap(km -> km.getFirstName(),vm -> vm.getLastName(),(fName1,fName2) -> fName1+", "+fName2))
       .forEach((f,s) -> System.out.println(f+"; "+s));


   //Collectors.joining
    String result = namesList
                        .stream()
                        .filter(fn -> fn.getFirstName().startsWith("John"))
                        .map(fnln2s ->fnln2s.getFirstName()+"<>"+fnln2s.getLastName())
                        .collect(Collectors.joining("| ","[","]"));
    System.out.println("Collectors.joining(delimiter,prefix,suffix) --> "+result);

    //Collectors.averagingInt/averagingLong/averagingDouble

    List<Product> productsList = PopulateData.products();

    Double averagingIntResult = productsList
                                      .stream()
                                      .collect(Collectors.averagingInt(Product::getPrice));
    System.out.println("AveragingInt result -> "+averagingIntResult);

    //Collectors.summingInt
    int summingIntOfProductPrice = productsList
                                      .stream()
                                      .collect(Collectors.summingInt(product -> product.getPrice()));
    System.out.println("Summing Int result -> "+summingIntOfProductPrice);

    //Collectors.summarizingInt
    IntSummaryStatistics summarizingIntForProductPrice = productsList
                                                            .stream()
                                                            .collect(Collectors.summarizingInt(productToProductPrice -> productToProductPrice.getPrice()));
    System.out.println("SummarizingInt results ->");
    System.out.println(summarizingIntForProductPrice.getAverage());
    System.out.println(summarizingIntForProductPrice.getCount());
    System.out.println(summarizingIntForProductPrice.getMax());
    System.out.println(summarizingIntForProductPrice.getMin());
    System.out.println(summarizingIntForProductPrice.getSum());


   //Collectors.groupingBy
    Map<Integer,List<Product>> productPriceGroupMap = productsList
                                                        .stream()
                                                        .collect(Collectors.groupingBy(groupingByPrice -> groupingByPrice.getPrice()));
    Set<Map.Entry<Integer,List<Product>>> productEntrySet = productPriceGroupMap.entrySet();
    for(Map.Entry<Integer,List<Product>> entry: productEntrySet)
      System.out.println(entry.getKey()+ ": "+entry.getValue());

    //Collectors.partitioningBy
    Map<Boolean, List<Product>> partitioningByMap = productsList
                                                          .stream()
                                                          .collect(Collectors.partitioningBy(conditionOnProductClassFields -> conditionOnProductClassFields.getPrice() > 60));


    Set<Map.Entry<Boolean, List<Product>>> partitioningByProductEntrySet = partitioningByMap.entrySet();
    for(Map.Entry<Boolean,List<Product>> entry: partitioningByProductEntrySet)
      System.out.println(entry.getKey()+" -> "+entry.getValue());

   Map<Integer,List<Product>> groupingThePartitionedResultsMap =
       partitioningByProductEntrySet
           .stream()
           .flatMap(entry -> entry.getValue().stream())
           .collect(Collectors.groupingBy(groupByPrice -> groupByPrice.getPrice()));
           //.collect(Collectors.groupingBy(groupByPrice -> groupByPrice.getPrice()), Collectors.counting());

   Set<Map.Entry<Integer, List<Product>>> groupingThePartitionedResultsMapEntrySet = groupingThePartitionedResultsMap.entrySet();
    for( Map.Entry<Integer,List<Product>> entry:groupingThePartitionedResultsMapEntrySet)
      System.out.println("Further grouping the partitioned results -> "+entry.getKey()+" : "+entry.getValue());

    System.out.println();

    //Mentioning to which collection, i have to use while collecting the results
     Collection<Integer> hashSet = products
                                .stream()
                                .map(p2i -> p2i.getId())
                                .collect(Collectors.toCollection(ArrayList::new));
    System.out.println(hashSet);


  }
}
