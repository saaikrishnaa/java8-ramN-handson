package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Author;
import knd.handson.ramN.pojo.Book;
import knd.handson.ramN.util.PopulateData;

import java.util.List;

public class MapFilterFilterMapReduceOrElse {
  public static void main(String[] args) {
    List<Book> books = PopulateData.books();
    Integer result = books.stream()
                         .map(Book::getAuthor)//.map(b->b.getAuthor())
                         .filter(a->a.getAge()>=40)
                         .filter(m -> m.getGender() == 'F')
                         .map(Author::getAge)//.map(a -> a.getAge())
                         .reduce(Integer::sum)
                         //.get();
                         .orElse(0);
    System.out.println("Result -> "+result);

  }
}
