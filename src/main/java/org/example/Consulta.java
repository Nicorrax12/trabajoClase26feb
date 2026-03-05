package org.example;

public class Consulta {
    public void ejecutar(Cuenta cuenta) {
        System.out.println("💰 Su saldo actual es: $" + cuenta.getSaldo());
    }
}