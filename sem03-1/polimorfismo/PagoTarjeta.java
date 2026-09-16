public class PagoTarjeta implements MetodoPago {
    public void procesar(double monto) {
        System.out.println("Se pagó con tarjeta el valor " + monto + " soles");
    }
}
