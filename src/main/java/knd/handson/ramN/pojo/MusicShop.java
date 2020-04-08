package knd.handson.ramN.pojo;

import java.util.HashSet;
import java.util.Set;

public class MusicShop {

  private String shopName;
  private Set<String> musicItems;

  public MusicShop() {
  }

  public MusicShop(String shopName, Set<String> musicItems) {
    this.shopName = shopName;
    this.musicItems = musicItems;
  }

  public void addMusicItems(String musicItemToAdd){
    if(this.musicItems == null)
      this.musicItems = new HashSet<>();
    this.musicItems.add(musicItemToAdd);
  }

  public String getShopName() {
    return shopName;
  }

  public void setShopName(String shopName) {
    this.shopName = shopName;
  }

  public Set<String> getMusicItems() {
    return musicItems;
  }

  public void setMusicItems(Set<String> musicItems) {
    this.musicItems = musicItems;
  }

  @Override
  public String toString() {
    return "MusicShop{" +
        "shopName='" + shopName + '\'' +
        ", musicItems=" + musicItems +
        '}';
  }
}
