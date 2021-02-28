package biblioteca;

import biblioteca.Genero;
/**
 * La clase <code>Libro</code> que reúne las características de un libro como el titulo, su categoría
 * @author Bryan R
 * @version 1.0
 * @since 1.0
 */

public class Libro {

    /**
     * Titulo del libro
     */
    private String titulo;

    /**
     * editorial que hizo el libro
     */
    private String editorial;

    /**
     * Año de su publicación
     */
    private int year;

    /**
     * Genero, creado a partir de un enum, con constantes como Novela, teatro...
     */
    private Genero genero;

    /**
     * Constructor con todos los atributos:
     * @param titulo
     * @param editorial
     * @param year
     * @param genero
     */
    public Libro(String titulo, String editorial, int year, Genero genero) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.year = year;
        this.genero = genero;
    }

    /**
     * Devuelve el titulo del libro
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Modifica el titulo del libro
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve el nombre de la editorial
     * @return editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Modifica el nombre de la editorial
     * @param editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Devuelve el año de publicacion del libro
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Modifica el año de publicacion del libro
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Devuelve el genero del libro
     * @return genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Modifica el genero del libro
     * @param genero
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    /**
     * Metodo toString(Override) que muestra todos los datos(parametros) de un libro
     * @return  "Libro{" +
     *                 "titulo='" + titulo + '\'' +
     *                 ", editorial='" + editorial + '\'' +
     *                 ", year=" + year +
     *                 ", genero=" + genero +
     *                 '}';
     */
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", year=" + year +
                ", genero=" + genero +
                '}';
    }
}
