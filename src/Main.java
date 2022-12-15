
import Clases.Cliente;
import Clases.Huerto;
import Clases.Productor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int cantidad = 20;
        Huerto huerto = new Huerto();
        Productor productor = new Productor(cantidad, huerto);
        Cliente cliente = new Cliente(cantidad, huerto);
        productor.start();
        cliente.start();
    }
}