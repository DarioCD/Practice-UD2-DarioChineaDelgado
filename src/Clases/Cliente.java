package Clases;

public class Cliente extends Thread{
    int quantity = 0;
    Huerto huerto;
    String nombre = "";

    public Cliente(String nombre, int quantity, Huerto huerto) {
        this.quantity = quantity;
        this.huerto = huerto;
        this.nombre = nombre;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run (){
        for (int i = 0; i < quantity ; i++) {
            huerto.consumeVegetables(nombre);
        }
    }
}
