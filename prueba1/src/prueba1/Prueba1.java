
package prueba1;

public class Prueba1 {

    public static void main(String[] args) {
        Documento[] documentos = {
            new FacturaContado("Contado:", 10000),
            new FacturaCredito("Credito:", 10000),
            new NotaCredito("Nota:", 10000)
        };
        double cierre = 0;

        for (Documento documento : documentos) {
            double total = documento.calcularTotal();
            cierre += total;
            System.out.printf("%-8s%s%.2f%n", documento.getCodigo(),
                    total < 0 ? "-" : " ", Math.abs(total));
        }

        System.out.printf("Cierre:  %.2f%n", cierre);
    }
}
