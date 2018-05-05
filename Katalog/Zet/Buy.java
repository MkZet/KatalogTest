package Katalog.Zet;

public class Buy extends Product {
  private int size;
 private double totalPrice;
 private double totalWeight;

    public void getSize(int size){
        this.size = size;
        totalWeight = checkWeight()*size;
        totalPrice = checkPrice()*size;
    }

 public  int checkSize(){
        return size;
}

 public  double checkTPrice(){
        return totalPrice;
    }
 public  double checkTWeight(){
        return totalWeight;
}

}
