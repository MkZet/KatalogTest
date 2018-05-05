package Katalog.Zet;

public class Product {

  private String name;
  private double price;
  private double weight;

    public void getName(String name){
        this.name = name;
    }
    public void getPrice(int price){
        this.price = price;
    }
    public void getWeight(double weight){
        this.weight = weight;
    }



  public  String checkName(){
        return name;
    }
   public  double checkPrice(){
        return price;
    }
   public  double checkWeight(){
        return weight;
    }
}
