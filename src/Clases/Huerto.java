package Clases;

import java.util.ArrayList;

public class Huerto {
    ArrayList vegetalesRandom = new ArrayList();
    public synchronized void saveVegetables (String vegetalRadnom){
        vegetalesRandom.add(vegetalRadnom);
        notifyAll();
    }
    public synchronized void consumeVegetables (String nombre){
        try {
            while (vegetalesRandom.size() == 0){
                wait();
            }
            System.out.println("El consumidor " + nombre + " ---> " + vegetalesRandom.remove(0));
        } catch (Exception e){
            System.out.println("CASCASO");
        }
    }

}
