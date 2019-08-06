package jp.co.systena.tigerscave.springtest.model;

public class Order {
  private int itemId;
  private String name;
  private int price;
  private int num;

  public Order(int ITEMID, String NAME, int PRICE, int NUM) {
    itemId = ITEMID;
    name = NAME;
    price = PRICE;
    num = NUM;
  }

  public int getItemId() {
    return this.itemId;
  }

  public void setItemId(int itemId) {
    this.itemId = itemId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  public int getNum() {
    return this.num;
  }

  public void setNum(int num) {
    this.num = num;
  }

}
