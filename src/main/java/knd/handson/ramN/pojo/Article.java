package knd.handson.ramN.pojo;

public class Article {
  private String title;
  private String author;
  private String tagName;

  public Article(String title, String author, String tagName) {
    this.title = title;
    this.author = author;
    this.tagName = tagName;
  }

  public Article() {
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getTagName() {
    return tagName;
  }

  @Override
  public String toString() {
    return "Article{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", tagName='" + tagName + '\'' +
        '}';
  }
}
