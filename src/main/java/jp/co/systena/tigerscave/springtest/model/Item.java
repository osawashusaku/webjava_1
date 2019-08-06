package jp.co.systena.tigerscave.springtest.model;

public class Item {
  private int itemId;
  private String name;
  private int price;

  public Item(int ITEMID,String NAME, int PRICE) {
    itemId = ITEMID;
    name = NAME;
    price = PRICE;
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
}
