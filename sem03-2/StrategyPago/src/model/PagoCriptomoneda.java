package model;

/**
 *
 * @author Usuario
 */
public class PagoCriptomoneda implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando S/ " + monto + " con cripto moneda");
    }
}