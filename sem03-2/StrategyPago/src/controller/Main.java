package controller;
import model.PagoTarjeta;
import model.PagoCriptomoneda;
/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        PagoService pago = new PagoService(new PagoTarjeta());
        pago.realizarPago(1500);

        pago = new PagoService(new PagoCriptomoneda());
        pago.realizarPago(500);
    }
}
