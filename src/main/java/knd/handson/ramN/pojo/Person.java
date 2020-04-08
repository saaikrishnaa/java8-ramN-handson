package knd.handson.ramN.pojo;

public class Person {

  private String name;
  private int age;
  private Character sex;
  private String designation;

  public Person() {
  }

  public Person(String name, int age, Character sex, String designation) {
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.designation = designation;
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

  public Character getSex() {
    return sex;
  }

  public void setSex(Character sex) {
    this.sex = sex;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", sex=" + sex +
        ", designation='" + designation + '\'' +
        '}';
  }
}
