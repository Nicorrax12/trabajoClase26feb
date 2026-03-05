package org.example;

public class Deposito {
    public void ejecutar(Cuenta cuenta, double cantidad) {
        if (cantidad > 0) {
            // Obtiene el saldo actual, le suma la cantidad y actualiza la cuenta
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
            System.out.println("Depósito exitoso. Se agregaron $" + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a $0.");
        }
    }

}
