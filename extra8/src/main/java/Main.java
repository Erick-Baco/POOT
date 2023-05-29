import controlador.ControladorLibro;
import modelo.Libro;
import persistencia.LibroDao;
import vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        VentanaLibro view = new VentanaLibro("mvc y jdbc");
        ControladorLibro controller = new ControladorLibro(view);

    }
}
