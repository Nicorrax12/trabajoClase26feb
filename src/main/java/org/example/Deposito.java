package org.example;

public class Deposito {

    public void ejecutar(Cuenta cuenta, double plata) {
        if (plata > 0) {
            double total = cuenta.getSaldo() + plata;
            cuenta.setSaldo(total);
            System.out.println("Depósito listo.");
        } else {
            System.out.println("No puedes depositar cero o negativo.");
        }
    }
}
