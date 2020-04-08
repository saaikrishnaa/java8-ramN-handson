package knd.handson.ramN.pojo;

public class Book {
  private String name;
  private Author author;
  private int price;

  public Book(String name, Author author, int price) {
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", author=" + author +
        ", price=" + price +
        '}';
  }
}
