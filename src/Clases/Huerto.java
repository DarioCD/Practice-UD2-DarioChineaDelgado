package Clases;

import java.util.ArrayList;

public class Huerto {
    ArrayList vegetalesRandom = new ArrayList();
    int tiempoConsumir = (int) (Math.random() * 10000) + 1;
    public Huerto() {
    }

    public synchronized void saveVegetables (String vegetalRadnom){
        vegetalesRandom.add(vegetalRadnom);
        notifyAll();
    }
    public synchronized void consumeVegetables (String nombre){
        try {
            while (vegetalesRandom.size() == 0){
                wait();
            }
            Thread.sleep(tiempoConsumir);
            System.out.println("El consumidor " + nombre + " ---> " + vegetalesRandom.remove(0));
        } catch (Exception e){
            System.out.println("CASCASO");
        }
    }
}
