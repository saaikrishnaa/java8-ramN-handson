package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.MusicShop;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExamples {

  public static void main(String[] args) {

    //Stream<Set<String>> to Stream<Sring>
    System.out.println("\nstreamOfSetOfStringsToStreamOfStrings\n");
    Set<String> setOfStrings = new HashSet<>();
    setOfStrings.add("A");
    setOfStrings.add("a");
    setOfStrings.add("A");
    setOfStrings.add("B");

    Stream
        .of(setOfStrings)
        .flatMap(streamOfSetOfStringsToStreamOfStrings -> streamOfSetOfStringsToStreamOfStrings.stream())
        .forEach(System.out::print);

    //Stream<List<String>> to Stream<String>
    System.out.println("\nstreamOfListOfIntegersToStreamOfIntegers\n");
    List<Integer> listOfIntegers = new ArrayList<>();
    listOfIntegers.add(1);
    listOfIntegers.add(2);
    listOfIntegers.add(3);
    listOfIntegers.add(4);

    Stream
        .of(listOfIntegers)
        .flatMap(streamOfListOfIntegersToStreamOfIntegers -> streamOfListOfIntegersToStreamOfIntegers.stream())
        .forEach(System.out::print);

    //Stream<List<Object>> to Stream<Object>
    System.out.println("\nfromListOfObjectsStreamToStreamOfObjects\n");
    List<Object> objectsList = new ArrayList<>();
    objectsList.add(1);
    objectsList.add("Hi");
    objectsList.add(1L);
    objectsList.add(1.01);
    objectsList.add(null);

    Stream<List<Object>> streamOfListOfObjects = Stream.of(objectsList);
    streamOfListOfObjects
        .flatMap(fromListOfObjectsStreamToStreamOfObjects -> fromListOfObjectsStreamToStreamOfObjects.stream())
        .forEach(System.out::print);


    //Stream<Set<MusicStore>> to Stream<String>
    System.out.println("\nStream<Set<MusicStore>> to Stream<String>\n");
    MusicShop aradhana = new MusicShop();
    aradhana.setShopName("Aaradhana Music Store");
    aradhana.addMusicItems("Violin");
    aradhana.addMusicItems("Guitar");
    aradhana.addMusicItems("Veena");
    aradhana.addMusicItems("Mrudangam");

    MusicShop madhuram = new MusicShop();
    madhuram.setShopName("Madhuram Music Store");
    madhuram.addMusicItems("Bass Guitar");
    madhuram.addMusicItems("Drums");
    madhuram.addMusicItems("Guitar");
    madhuram.addMusicItems("Violin");

    List<MusicShop> musicShops = new ArrayList<>();
    musicShops.add(aradhana);
    musicShops.add(madhuram);


    List<String> results = musicShops
                            .stream()
                            .map(stream2set -> stream2set.getMusicItems())
                            .flatMap(setOfStringsToStreamOfStrings -> setOfStringsToStreamOfStrings.stream())
                            .distinct()
                            .collect(Collectors.toList());
    System.out.println(results);

    //FlatMapToInt
    System.out.println("FlatMapToInt");
    int[][] tdarray = {{1,2,3},{4,5,6}};
    Stream<int[]> arrayStream = Stream.of(tdarray);
    arrayStream
        .flatMapToInt(intArrayToIntStream -> Arrays.stream(intArrayToIntStream))
        .forEach(System.out::println);
  }
}
