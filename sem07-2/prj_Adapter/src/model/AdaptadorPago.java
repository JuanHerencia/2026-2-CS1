package model;
import sis_externo.PasarelaExterna;
/**
 *
 * @author Usuario
 */
public class AdaptadorPago implements ProcesadorPago {

    private final PasarelaExterna pasarela;

    public AdaptadorPago(PasarelaExterna pasarela) {
        this.pasarela = pasarela;
    }

    @Override
    public void pagar(double monto) {
        pasarela.realizarTransaccion(monto);
    }
}
