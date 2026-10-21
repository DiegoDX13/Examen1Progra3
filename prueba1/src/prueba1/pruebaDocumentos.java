package prueba1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PruebaDocumentosTest {
    @Test
    void facturaContadoCalculaTotalConImpuestoYDescuento() {

        FacturaContado factura = new FacturaContado("FC-001", 10000);
        double total = factura.calcularTotal();

        assertEquals(10735.00, total, 0.01);
    }

    @Test
    void notaCreditoCalculaTotalNegativoConImpuesto() {

        NotaCredito nota = new NotaCredito("NC-001", 10000);
        double total = nota.calcularTotal();

        assertEquals(-11300.00, total, 0.01);
    }
}