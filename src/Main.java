
import Clases.Huerto;
import Clases.Productor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int quantity = 10;
        Productor p = new Productor();
        p.select(quantity);
    }
}