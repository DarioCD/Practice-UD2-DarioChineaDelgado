
import Clases.Cliente;
import Clases.Huerto;
import Clases.Productor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int tiempoCrecimiento = (int) (Math.random() * 5000) + 1;
        int cantidad = 5;
        Huerto huerto = new Huerto();
        Productor productor = new Productor("Goyo",cantidad, huerto);
        Cliente cliente = new Cliente("Eduardo",cantidad, huerto);

        Productor productor2 = new Productor("Adrián",cantidad, huerto);
        Cliente cliente2 = new Cliente("Gabriel",cantidad, huerto);

        Productor productor3 = new Productor("Darío",cantidad, huerto);
        Cliente cliente3 = new Cliente("Josito",cantidad, huerto);
        productor.start();
        cliente.start();
        productor2.start();
        cliente2.start();
        productor3.start();
        cliente3.start();
    }
}