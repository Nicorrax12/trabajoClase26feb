package org.example;

public class Consulta {

    public void ejecutar(Cuenta cuenta) {
        System.out.println("💰 Tienes: $" + cuenta.getSaldo());
    }
}
