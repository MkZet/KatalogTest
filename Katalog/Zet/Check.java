package Katalog.Zet;

public class Check extends Buy {
  public void show(){
        // Tovar
        System.out.println("Товар: "+checkName());
        System.out.println("Цена: "+checkPrice());
        System.out.println("Вес: "+checkWeight());

        //Buy
        System.out.println("Вы покупаете: "+checkName());
        System.out.println("Количество: "+checkSize());
        System.out.println("Общий вес: "+checkTWeight());
        System.out.println("Общая цена: "+checkTPrice());

    }


}
