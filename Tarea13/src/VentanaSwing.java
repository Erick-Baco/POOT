import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaSwing  extends JFrame {
    private JLabel etiqueta1;
    private JTextField txtgrados;
    private JButton boton;
    private JLabel lblresultado;
    private FlowLayout layout;

    public VentanaSwing(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new FlowLayout();
        this.getContentPane().setLayout(layout);

        etiqueta1 = new JLabel("grados C: ");
        this.getContentPane().add(etiqueta1);

        txtgrados = new JTextField(10);
        this.getContentPane().add(txtgrados);

        boton = new JButton("convertir");
        this.getContentPane().add(boton);

        lblresultado = new JLabel("0.0 °F");
        this.getContentPane().add(lblresultado);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados = Double.parseDouble(txtgrados.getText());
                double Farenheit = (centigrados * 9.0/5.0) + 32.0;
                lblresultado.setText(Farenheit + " °F");
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Adios :D ...");
                System.exit(0);
            }
        });

        this.setVisible(true);

    }
}
