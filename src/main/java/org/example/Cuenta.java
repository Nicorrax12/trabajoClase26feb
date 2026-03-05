package org.example;

public class Cuenta {

    double saldo;

    public Cuenta(double plataInicial) {
        if (plataInicial >= 0) {
            saldo = plataInicial;
        } else {
            saldo = 0.0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double plataNueva) {
        saldo = plataNueva;
    }
}
