package model;

/**
 *
 * @author Usuario
 */
public class PedidoRigido {

    public double calcularTotal(String tipoCliente, double subtotal, String metodoPago) {
        double total = subtotal;
        // Descuento según cliente
        if (tipoCliente.equals("regular")) {
        // sin descuento 
        } else if (tipoCliente.equals("vip")) {
            total = total * 0.85;
        } else if (tipoCliente.equals("navidad")) {
            total = total * 0.80;
        }
        // Procesamiento según método de pago 
        if (metodoPago.equals("tarjeta")) {
            System.out.println("Cobrando S/ " + total + " con tarjeta");
        } else if (metodoPago.equals("yape")) {
            System.out.println("Cobrando S/ " + total + " con Yape");
        } else if (metodoPago.equals("efectivo")) {
            System.out.println("Cobrando S/ " + total + " en efectivo");
        }
        return total;
    }
}
