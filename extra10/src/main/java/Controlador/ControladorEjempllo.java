package Controlador;

import Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorEjempllo extends MouseAdapter {
    private Ventana view;

    public ControladorEjempllo(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnMensaje()){
            ImageIcon imageIcon = new ImageIcon("exito.png");
            JOptionPane.showMessageDialog(view,
                    "Hola desde el ejemplop",
                    "Titulo personalizado",
                    JOptionPane.WARNING_MESSAGE,
                    imageIcon);
        }
        if (e.getSource() == view.getBtnEntrada()){
            String datos = JOptionPane.showInputDialog(view,
                    "ejemplo de entrada",
                    "titulo personalizado",
                    JOptionPane.QUESTION_MESSAGE);
            this.view.getLblresultado().setText(datos);
        }
        if (e.getSource() == view.getBtnOpcion()){
            int respuesta = JOptionPane.showConfirmDialog(view,
                    "ejemplo de ¿estas seguro de borrar registro?",
                    "confirmacion",
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_NO_OPTION){
                view.getLblresultado().setText("elejiste opcion si");
            }else {
                view.getLblresultado().setText("elejiste opcion no");
            }
        }
    }
}
