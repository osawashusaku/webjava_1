package jp.co.systena.tigerscave.springtest.model;

import java.util.ArrayList;
import java.util.Map;

public class Cart {

  private int itemId;
  private ArrayList<Map<Integer, Integer>> itemNum = new ArrayList<Map<Integer, Integer>>();

   // public ArrayList<Order> orderList;
  public ArrayList<Order> getOrderList(int num[]) {

      Order ostrich = new Order(1, "ダチョウ", 398, num[0]);
      Order spinach = new Order(2, "ほうれん草", 25, num[1]);
      Order water = new Order(3, "水", 10000, num[2]);

      ArrayList<Order> OrderList = new ArrayList<Order>();
        OrderList.add(ostrich);
        OrderList.add(spinach);
        OrderList.add(water);

      return OrderList;
    }
  }

