
package prueba1;

/**
 *
 * @author esqui
 */
public class NotaCredito extends Documento {
    public NotaCredito(String codigo, double subtotal) {
        super(codigo, subtotal);
    }

    @Override
    public double calcularTotal() {
        return -getSubtotal() * 1.13;
    }
}