package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🏦 --- BIENVENIDO AL BANCO EL AHORRADOR ---");
        System.out.print("Para abrir su cuenta, ingrese su saldo inicial (o 0 si está vacía): $");
        double saldoInicial = scanner.nextDouble();

        // Se crea el objeto cuenta
        Cuenta miCuenta = new Cuenta(saldoInicial);

        // Se crean los objetos para cada operación (Bajo acoplamiento)
        Deposito deposito = new Deposito();
        Retiro retiro = new Retiro();
        Consulta consulta = new Consulta();

        int opcion = 0;

        // Bucle para el menú interactivo
        while (opcion != 4) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double cantidadDeposito = scanner.nextDouble();
                    deposito.ejecutar(miCuenta, cantidadDeposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double cantidadRetiro = scanner.nextDouble();
                    retiro.ejecutar(miCuenta, cantidadRetiro);
                    break;
                case 3:
                    consulta.ejecutar(miCuenta);
                    break;
                case 4:
                    System.out.println("👋 ¡Gracias por usar el Banco El Ahorrador! Hasta luego.");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}