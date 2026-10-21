
package pregunta18;

/**
 *
 * @author esqui
 */
public class NodoEstado {
    private String estado;
    private NodoEstado siguiente;

    public NodoEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public NodoEstado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEstado siguiente) {
        this.siguiente = siguiente;
    }
}
