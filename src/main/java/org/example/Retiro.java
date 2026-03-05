package org.example;

public class Retiro {

    public void ejecutar(Cuenta cuenta, double plata) {
        if (plata <= 0) {
            System.out.println("No puedes retirar cero o números negativos.");
        } else if (plata > cuenta.getSaldo()) {
            System.out.println("No tienes tanta plata. Tu saldo es $" + cuenta.getSaldo());
        } else {
            double total = cuenta.getSaldo() - plata;
            cuenta.setSaldo(total);
            System.out.println("Retiro exitoso.");
        }
    }
}
