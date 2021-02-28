package biblioteca;
import java.text.ParseException;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ParseException {
        //creación de socio
        Socio so = new Socio(1234, "Luis", "Alvarez, 28, Madrid", "55313423");
        //creacion de libro
        Libro l1 = new Libro("Como polvo en el viento", "Tusquets", 2021, Genero.NOVELA);

        //creacion de autor
        Date date = new Date(56, 6, 2,00,00);
        Autor au = new Autor("Leonardo Padura", "Cubano", date);
        System.out.println(au.toString());

    }

}
