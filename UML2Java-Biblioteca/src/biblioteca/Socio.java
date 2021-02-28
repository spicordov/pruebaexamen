package biblioteca;

/**
 * La clase <code>Socio</code> reúne las características del socio de la biblioteca
 * como nombre, dirección
 * @author Bryan R
 * @version 1.0
 * @since 1.0
 */
public class Socio {

    /**
     * Numeroo(id) del socio
     */
    private int numero;

    /**
     * Nombre del socio
     */
    private String nombre;

    /**
     * Direccion del socio
     */
    private String direccion;

    /**
     * Telefono de contacto
     */
    private String telefono;

    /**
     * Constructor con todos los atributos
     * @param numero
     * @param nombre
     * @param direccion
     * @param telefono
     */

    public Socio(int numero, String nombre, String direccion, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Devuelve el numero de contacto
     * @return numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * Modifica el numero de contacto
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Devuelve el nombre del socio
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del socio
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la direccion del socio
     * @return
     */
    public String getDireccion() {
        return direccion;
    }


    /**
     * Modifica la direccion del socio
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve el telefono del socio
     * @return telefono
     */
    public String getTelefono() {
        return telefono;
    }


    /**
     * Modifica el telefono del socio
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    /**
     * Metodo toString(Override) que muestra todos los datos(parametros) de un socio
     * @return "biblioteca.Socio{" +
     *                 "numero=" + numero +
     *                 ", nombre='" + nombre + '\'' +
     *                 ", direccion='" + direccion + '\'' +
     *                 ", telefono='" + telefono + '\'' +
     *                 '}';
     */
    @Override
    public String toString() {
        return "biblioteca.Socio{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }


}
