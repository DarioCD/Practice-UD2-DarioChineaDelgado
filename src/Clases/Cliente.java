package Clases;

public class Cliente extends Thread{
    int quantity = 0;
    Huerto huerto;

    public Cliente(int quantity, Huerto huerto) {
        this.quantity = quantity;
        this.huerto = huerto;
    }
    @Override
    public void run (){
        for (int i = 0; i < quantity ; i++) {
            huerto.consumeVegetables();
        }
    }
}
