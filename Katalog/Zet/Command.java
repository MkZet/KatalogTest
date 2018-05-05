package Katalog.Zet;

public class Command {
    public static void main (String[] args){
        Check product = new Check();

product.getName("Апельсины");
product.getWeight(0.1);
product.getPrice(20);
product.getSize(15);
product.show();
    }
}

