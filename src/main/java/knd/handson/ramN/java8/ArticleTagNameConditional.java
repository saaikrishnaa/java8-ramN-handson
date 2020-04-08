package knd.handson.ramN.java8;

import knd.handson.ramN.pojo.Article;
import knd.handson.ramN.util.PopulateData;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ArticleTagNameConditional {

  public static void main(String[] args) {

    //Get articles by tag name
    List<Article> articles = PopulateData.articles();

    Map<String,List<Article>> tagArticleMap = getArticlesForATag(articles);
    tagArticleMap
        .forEach((tagName,articleList) -> {
          System.out.println("Tag -"+tagName+" -> "+articleList);
        });

    //Get distinct tag names
    Set<String> distinctTags = getDistinctTagNames(articles);
    System.out.println("Distinct tag names -> "+distinctTags);

  }

  public static Map<String,List<Article>> getArticlesForATag(List<Article> articles){

    Map<String, List<Article>> taMap = articles
                                          .stream()
                                          .collect(Collectors.groupingBy(article -> article.getTagName()));
    return taMap;
  }

  private static Set<String> getDistinctTagNames(List<Article> articles) {
    return articles
              .stream()
              .map(a2tn -> a2tn.getTagName())
              .distinct()
              .collect(Collectors.toSet());
  }
}