package Vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    private JButton btnMensaje;
    private JButton btnEntrada;
    private JButton btnOpcion;
    private JLabel lblresultado;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(450,200);

        btnMensaje = new JButton("mensaje");
        btnEntrada = new JButton("entrada");
        btnOpcion = new JButton("opcion");
        lblresultado = new JLabel("resultado");

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(btnMensaje);
        this.getContentPane().add(btnEntrada);
        this.getContentPane().add(btnOpcion);
        this.getContentPane().add(lblresultado);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JButton getBtnMensaje() {
        return btnMensaje;
    }

    public void setBtnMensaje(JButton btnMensaje) {
        this.btnMensaje = btnMensaje;
    }

    public JButton getBtnEntrada() {
        return btnEntrada;
    }

    public void setBtnEntrada(JButton btnEntrada) {
        this.btnEntrada = btnEntrada;
    }

    public JButton getBtnOpcion() {
        return btnOpcion;
    }

    public void setBtnOpcion(JButton btnOpcion) {
        this.btnOpcion = btnOpcion;
    }

    public JLabel getLblresultado() {
        return lblresultado;
    }

    public void setLblresultado(JLabel lblresultado) {
        this.lblresultado = lblresultado;
    }
}
