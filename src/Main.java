
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
        Cliente cliente = new Cliente("Adrián",cantidad, huerto);

        productor.start();
        cliente.start();
    }
}