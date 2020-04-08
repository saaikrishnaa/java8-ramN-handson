package knd.handson.ramN.util;

import knd.handson.ramN.pojo.*;

import java.util.Arrays;
import java.util.List;

public class PopulateData {

  public static List<Person> persons() {
    List<Person> persons = Arrays.asList(
        new Person("John", 20, 'M', "Software Engineer"),
        new Person("Mary", 40, 'F', "Plumber"),
        new Person("Admire", 30, 'M', "Teacher"),
        new Person("Peter", 10, 'M', "Student"),
        new Person("Thunderbolt", 50, 'M', "Singer"),
        new Person("Manifest", 35, 'F', "Editor"));
    return persons;
  }

  public static List<Product> products() {
    List<Product> products = Arrays.asList(
        new Product(1, "TV", 60),
        new Product(2, "AplDesktop", 90),
        new Product(3, "AplLaptop", 70),
        new Product(6, "BoseSoundSys", 70),
        new Product(4, "BtSpeakers", 70),
        new Product(5, "BoseHphones", 40),
        new Product(7, "DellLaptop", 90),
        new Product(7, "AcerLaptop", 60),
        new Product(3, "PS3", 90),
        new Product(5, "Fan", 60)
    );

    return products;
  }

  public static List<Book> books() {
    List<Book> books = Arrays.asList(
        new Book("java", new Author("durga", 40, "english", 'M'), 400),
        new Book("poetry", new Author("steve", 80, "english", 'F'), 200),
        new Book("shayari", new Author("javed", 30, "hindi", 'M'), 650),
        new Book("chinese", new Author("zuinchen", 90, "chinese", 'F'), 100),
        new Book("padyaalu", new Author("kavi", 100, "english", 'M'), 1000),
        new Book("java", new Author("koushik", 90, "english", 'M'), 2000),
        new Book("padyaalu", new Author("kavayitri", 80, "english", 'F'), 3500),
        new Book("chinese", new Author("kavi", 100, "english", 'M'), 2000),
        new Book("poetry", new Author("kavi", 100, "hindi", 'M'), 1800),
        new Book("shayari", new Author("shaek", 50, "urdu", 'F'), 1200),
        new Book("padyaalu", new Author("kavi", 100, "english", 'M'), 4000),
        new Book("poetry", new Author("supraja", 100, "kannada", 'F'), 900),
        new Book("chinese", new Author("ching", 100, "chinese", 'F'), 3000)
    );
    return books;
  }

  public static List<FNLN> names() {
    return Arrays.asList(
        new FNLN("John", "David"),
        new FNLN("Muller", "Wright"),
        new FNLN("Knight", "Syamalan"),
        new FNLN("John", "David"),
        new FNLN("Federer", "Roger"),
        new FNLN("Steve", "Jobs"),
        new FNLN("John", "David"),
        new FNLN("Steve", "Roger"),
        new FNLN("Jobs", "Wright"),
        new FNLN("Sumit", "Varma")
    );
  }

  public static List<Student> students() {
    return Arrays.asList(
        new Student("A", 100),
        new Student("B", 30),
        new Student("C", 90),
        new Student("D", 70),
        new Student("E", 20),
        new Student("F", 55),
        new Student("G", 78));
  }

  public static List<Article> articles(){

    return Arrays.asList(
        new Article("Effective Java","Joshua Bloch","Java"),
        new Article("Head First Java","Kathy Sierra & Bert Bates","Java"),
        new Article("Java Concurrency in Practice","Joshua Bloch","Java"),
        new Article("Test-Driven: TDD and Acceptance TDD for Java Developers","Lasse Koskela","Java"),
        new Article("Java Performance: The Definite Guide","Scott Oaks","Java"),
        new Article("RESTful Web Services","Leonard Richardson","REST"),
        new Article("REST in Practice","Jim Webber","REST"),
        new Article("RESTful web services cookbook","Subbu Allamraju","REST"),
        new Article("RESTlet in action","Jerome Louvel","REST"),
        new Article("The REST API design handbook","George Reese","REST"),
        new Article("Spring in Action","Craig Walls","Spring"),
        new Article("Cloud Native Java","Josh Long","Spring"),
        new Article("Learning Spring Boot 2.0","Greg","Spring"),
        new Article("Spring 5 Recipes","Marten","Spring"),
        new Article("AWS in Action","Andreas","AWS"),
        new Article("Mastering AWS development","Uchit","AWS"),
        new Article("Implementing cloud design patterns for AWS","Marcus","AWS"),
        new Article("Docker in Action","Jeff","Docker"),
        new Article("The Docker book","James","Docker"),
        new Article("Docker Up and Running","Sean","Docker"),
        new Article("Kubernetes Up and Running","Brenden","Kubernetes"),
        new Article("Kubernetes in Action","Marko","Kubernetes"),
        new Article("The Kuberneted book","Nigel","Kubernetes"),
        new Article("Kafka The definitive guide","Gwen","Kafka"),
        new Article("Building data streaming applications with Apache Kafka","Chanchal singh","Kafka"),
        new Article("Apache kafka cookbook","Sourabh","Kafka"),
        new Article("Head first design patterns","Kathy Sierra","Design"),
        new Article("Head first OOAD","Brett","Design"),
        new Article("Design Patterns: Elements of Reusable Object-Oriented Software","Ericch","Design"),
        new Article("Software Architecture Design Patterns in Java","Partha Kuchana","Design")
    );
  }

  public static List<MCAStudent> mcaStudents(){

    return Arrays.asList(

        new MCAStudent("Student1","T1",001,"Section-1"),
        new MCAStudent("Student2","T1",002,"Section-2"),
        new MCAStudent("Student3","T1",003,"Section-3"),
        new MCAStudent("Student4","T2",003,"Section-1"),
        new MCAStudent("Student5","T2",002,"Section-2"),
        new MCAStudent("Student6","T2",002,"Section-3"),
        new MCAStudent("Student7","T3",001,"Section-1"),
        new MCAStudent("Student8","T3",002,"Section-2")
    );
  }
}
