package model;

/**
 *
 * @author Usuario
 */
public class PagoTarjeta implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando S/ " + monto + " con tarjeta");
    }
}