package jp.co.systena.tigerscave.springtest.model;

public class Listform {
  private int itemId;
  private String name;
  private int price;
  private int[] num;

  public int getItemId() {
    return this.itemId;
  }

  public void setItemId(int ItemId) {
    this.itemId = ItemId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String Name) {
    this.name = Name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int Price) {
    this.price = Price;
  }

  public int[] getNum() {
    return num;
  }

  public void setNum(int[] Num) {
    this.num = Num;
  }
}
