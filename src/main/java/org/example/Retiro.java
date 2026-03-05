package org.example;

public class Retiro {
    public void ejecutar(Cuenta cuenta, double cantidad) {
        if (cantidad <= 0) {
            System.out.println("❌ Error: La cantidad a retirar debe ser mayor a $0.");
        } else if (cantidad > cuenta.getSaldo()) {
            System.out.println("❌ Error: Fondos insuficientes. Su saldo es solo de $" + cuenta.getSaldo());
        } else {
            // Resta el dinero y actualiza el saldo
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);
            System.out.println("✅ Retiro exitoso. Entregando $" + cantidad);
        }
    }
}