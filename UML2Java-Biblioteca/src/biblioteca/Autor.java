package biblioteca;


import java.util.Date;

/**
 * La clase <code>Autor</code> reúne las características del autor de un libro
 * como su nombre, nacionalidad...
 * @author Bryan R
 * @version 1.0
 * @since 1.0
 */
public class Autor {

    /**
     * Nombre del autor
     */
    private String nombre;

    /**
     * Nacionalidad del autor
     */
    private String nacionalidad;

    /**
     * Fecha de nacimiento del autor
     */
    private Date fechaNacimiento;


    /**
     * Constructor con todos los atributos:
     * @param nombre
     * @param nacionalidad
     * @param fechaNacimiento
     */
    public Autor(String nombre, String nacionalidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Devuelve el nombre de un autor
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de un autor
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Devuelve la nacionalidad de un autor
     * @return nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Modifica la nacionalidad de un autor
     * @param nacionalidad
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Devuelve la fecha de nacimiento del autor
     * @return fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Modifica la fecha de nacimiento del autor
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Metodo toString(Override) que muestra todos los datos(parametros) de un autor
     * @return  "Autor{" +
     *                 "nombre='" + nombre + '\'' +
     *                 ", nacionalidad='" + nacionalidad + '\'' +
     *                 ", fechaNacimiento=" + fechaNacimiento +
     *                 '}';
     */
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
