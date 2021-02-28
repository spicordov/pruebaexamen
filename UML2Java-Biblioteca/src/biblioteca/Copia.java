package biblioteca;

import java.time.LocalDate;

/**
 * La clase <code>Copia</code> reúne las características de una copia de un libro
 * como la ref. y su estado(creado a partir de un Enum), he decidido que copia
 * hereda de prestamos ya que asi sabemos la fecha en que se cogio.
 * @author Bryan R
 * @version 1.0
 * @since 1.0
 */
public class Copia  extends Prestamo{


    /**
     * Referencia de la copia
     */
    private int referencia;

    /**
     * Estado actual de la copia
     */
    private Estado estadoCopia;


    /**
     * Constructo con todos los atributos, heredados tambien
     * @param inicio
     * @param fin
     * @param referencia
     * @param estadoCopia
     */
    public Copia(LocalDate inicio, LocalDate fin, int referencia, Estado estadoCopia ) {
        super(inicio, fin);
        this.referencia= referencia;
        this.estadoCopia = estadoCopia;
    }

    /**
     * Devuelve la referencia de una copia, no tenemos set ya que no queremos modificar
     * la referencia
     * @return
     */
    public int getReferencia() {
        return referencia;
    }


    /**
     * Devuelve el estado de una copia
     * @return estadoCopia
     */
    public Estado getEstadoCopia() {
        return estadoCopia;
    }

    /**
     * Modifica el estado de una copia
     * @param estadoCopia
     */
    public void setEstadoCopia(Estado estadoCopia) {
        this.estadoCopia = estadoCopia;
    }

}
