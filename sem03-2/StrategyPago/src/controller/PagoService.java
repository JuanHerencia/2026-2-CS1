package controller;

import model.MetodoPago;

/**
 *
 * @author Usuario
 */
class PagoService {
    private MetodoPago metodoPago;

    public PagoService(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double monto) {
        metodoPago.pagar(monto);
    }
}