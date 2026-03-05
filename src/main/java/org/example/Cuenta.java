package org.example;

public class Cuenta {
    private double saldo;

    // Constructor para inicializar la cuenta
    public Cuenta(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }

    // Métodos para ver y modificar el saldo (Encapsulamiento)
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}