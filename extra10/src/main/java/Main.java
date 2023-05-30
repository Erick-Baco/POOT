import Controlador.ControladorEjempllo;
import Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("JOP");
        ControladorEjempllo controller = new ControladorEjempllo(ventana);
    }
}
