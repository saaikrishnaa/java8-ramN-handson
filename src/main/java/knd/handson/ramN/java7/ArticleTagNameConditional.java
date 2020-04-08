package knd.handson.ramN.java7;

import knd.handson.ramN.pojo.Article;
import knd.handson.ramN.util.PopulateData;

import java.util.*;

public class ArticleTagNameConditional {

  public static void main(String[] args) {

    List<Article> articles = PopulateData.articles();

    //Get articles by tag name
    Map<String,List<Article>> tagArticleMap = groupArticlesByAuthor(articles);

    for(String tag: tagArticleMap.keySet()){
      System.out.println("Tag - "+tag+" -> "+tagArticleMap.get(tag));
    }

    //Get distinct tag names
    Set<String> distinctTags = getDistinctTagNames(articles);
    System.out.println("Distinct tag names -> "+distinctTags);
  }

  public static Map<String, List<Article>> groupArticlesByAuthor(List<Article> articles){

    Map<String, List<Article>> atMap = new HashMap<>();
    for(Article article : articles){
      if(atMap.containsKey(article.getTagName())){
        atMap.get(article.getTagName()).add(article);
      }else{
        ArrayList<Article> newList = new ArrayList<>();
        newList.add(article);
        atMap.put(article.getTagName(),newList);
      }
    }
    return atMap;
  }

  public static Set<String> getDistinctTagNames(List<Article> articles){

    Set<String> distinctTagNames = new HashSet<>();
    for(Article article : articles)
      distinctTagNames.add(article.getTagName());

    return distinctTagNames;
  }

}
