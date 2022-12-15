package Clases;

import java.util.ArrayList;

public class Huerto {
    ArrayList vegetalesRandom = new ArrayList();
    public synchronized void saveVegetables (String vegetalRadnom){
        vegetalesRandom.add(vegetalRadnom);
        notifyAll();
    }
    public synchronized void consumeVegetables (){
        try {
            while (vegetalesRandom.size() <= 0){
                wait();
                System.out.println("Consumidor ---> " + vegetalesRandom.remove(0));
            }
        } catch (Exception e){
            System.out.println("CASCASO");
        }
    }

}
