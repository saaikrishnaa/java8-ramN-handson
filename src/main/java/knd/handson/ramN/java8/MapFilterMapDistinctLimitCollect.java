package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Author;
import knd.handson.ramN.pojo.Book;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.stream.Collectors;

public class MapFilterMapDistinctLimitCollect {

  //Solve  - Get first two author names whose age is >=80 in upper case
  public static void main(String[] args) {
    List<Book> books = PopulateData.books();
    List<String> authors =  books.stream() //returns Stream<Book>
                                 .map(b -> b.getAuthor())//Convert Stream<Book> to Stream<Author>
                                 .filter(a -> a.getAge()>=80)//Predicate takes a type Book with a condition on the Book, that returns a new stream if True, do not return stream if False
                                 .map(Author::getName)//.map(n -> n.getName())//now i get author whose age is >=80, now i have to convert Stream<Author> to Stream<String>, to get author names METHOD REFERENCE
                                 .distinct()
                                 .limit(2)
                                 .map(String::toUpperCase)//.map(u->u.toUpperCase()) METHOD REFERENCE
                                 .collect(Collectors.toList());

    System.out.println("Result ->"+authors);
  }
}
