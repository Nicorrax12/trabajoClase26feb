package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("--- BANCO ---");
        System.out.print("Plata inicial: $");
        double plataInicial = teclado.nextDouble();

        Cuenta miCuenta = new Cuenta(plataInicial);
        Deposito deposito = new Deposito();
        Retiro retiro = new Retiro();
        Consulta consulta = new Consulta();

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n1. Depositar | 2. Retirar | 3. Ver plata | 4. Salir");
            System.out.print("Elige: ");
            opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.print("¿Cuánta plata depositas?: $");
                double plata = teclado.nextDouble();
                deposito.ejecutar(miCuenta, plata);
            }
            else if (opcion == 2) {
                System.out.print("¿Cuánta plata retiras?: $");
                double plata = teclado.nextDouble();
                retiro.ejecutar(miCuenta, plata);
            }
            else if (opcion == 3) {
                consulta.ejecutar(miCuenta);
            }
            else if (opcion == 4) {
                System.out.println("adios");
            }
        }

        teclado.close();
    }
}
