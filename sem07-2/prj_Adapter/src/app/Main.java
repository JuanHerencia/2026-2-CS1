package app;
import sis_externo.PasarelaExterna;
import model.*;
/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        PasarelaExterna pasarela = new PasarelaExterna();
        ProcesadorPago adaptador
                = new AdaptadorPago(pasarela);
        ServicioMatricula servicio
                = new ServicioMatricula(adaptador);
        servicio.pagarMatricula(850.00);
    }
}
