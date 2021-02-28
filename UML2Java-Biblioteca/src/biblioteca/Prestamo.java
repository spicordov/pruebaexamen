package biblioteca;

import java.time.LocalDate;

/**
 * La clase <code>Prestamos</code> reúne las fechas de inicio y fin de un prestamos
 * @author Bryan R
 * @version 1.0
 * @since 1.0
 */

public class Prestamo {

    /**
     * Inicio de prestamo
     * El modificador es protected ya que copia va a hereder los atributos de prestamo
     */
    protected LocalDate inicio;

    /**
     * Fin de prestamo
     * El modificador es protected ya que copia va a hereder los atributos de prestamo
     */
    protected LocalDate fin;

    /**
     * Constructor con todos los atributos
     * @param inicio
     * @param fin
     */
    public Prestamo(LocalDate inicio, LocalDate fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * Metodo toString(Override) que muestra todos los datos(parametros) de un prestamo
     * @return "Prestamo{" +
     *                 "inicio=" + inicio +
     *                 ", fin=" + fin +
     *                 '}';
     */
    @Override
    public String toString() {
        return "Prestamo{" +
                "inicio=" + inicio +
                ", fin=" + fin +
                '}';
    }
}
