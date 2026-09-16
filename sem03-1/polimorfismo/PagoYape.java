public class PagoYape implements MetodoPago{
    public void procesar(double monto) {
        System.out.println("Se pagó con Yape el valor " + monto + " soles");
    }
}
