package jp.co.systena.tigerscave.springtest.model;

import java.util.ArrayList;

public class ListService {

  public static ArrayList<Item> getItemList(){
    Item ostrich = new Item(1, "ダチョウ", 398);
    Item spinach = new Item(2, "ほうれん草", 25);
    Item water = new Item(3, "水", 10000);

    ArrayList<Item> itemList = new ArrayList<Item>();
      itemList.add(ostrich);
      itemList.add(spinach);
      itemList.add(water);

    return itemList;
  }
}