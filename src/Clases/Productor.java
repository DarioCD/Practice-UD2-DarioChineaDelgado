package Clases;

public class Productor extends Thread{
    String vegetales[] = {
            "lettuce",
            "cabbage",
            "onion",
            "spinach",
            "potato",
            "celery",
            "asparagus",
            "radish",
            "broccoli",
            "artichoke",
            "tomato",
            "cucumber",
            "eggplant",
            "carrot",
            "green bean"
    };
    public synchronized void select (int quantity) throws InterruptedException {
        for (int i = 0; i < quantity; i++) {
            int index = (int) (Math.random() * vegetales.length);
            int numero = (int) (Math.random() * 1000) + 1;
            Thread.sleep(numero);
            System.out.println(vegetales[index] + "tardo: " + numero + " milisegundos");
        }
    }
};
