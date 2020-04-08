package knd.handson.ramN.pojo;

public class Author {

  private String name;
  private int age;
  private String lang;
  private char gender;

  public Author(String name, int age, String lang,char gender) {
    this.name = name;
    this.age = age;
    this.lang = lang;
    this.gender = gender;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  @Override
  public String toString() {
    return "Author{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", lang='" + lang + '\'' +
        ", gender='"+gender + '\''+
        '}';
  }
}
