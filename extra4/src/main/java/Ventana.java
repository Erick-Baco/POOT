import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame {
    private JPanel panel1;
    private JButton botonPanel1;
    private JLabel etiquetaPanel1;

    private JPanel panel2;
    private JLabel getEtiquetaPanel2;

    private JPanel panel3;
    private JComboBox<String> comboBoxPanel3;
    protected JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //panel1
        panel1 = new JPanel();
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        botonPanel1 = new JButton("presioname");
        panel1.add(botonPanel1);
        etiquetaPanel1 = new JLabel(".........");
        panel1.add(etiquetaPanel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("hola, presionaste el boton del panel 1");
            }
        });

        this.getContentPane().add(panel1,0);

        //panel2
        String urlImagen = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3lFJyhzNapC2T97sZtLjhrEWay-EgrUwEOA&usqp=CAU";
        panel2 = new JPanel();
        panel2.setBackground(new Color(153, 255, 204));
        panel2.setLayout(new FlowLayout());

        //cargar la imagen
        try {
            URL url = new URL(urlImagen);
            Image image = ImageIO.read(url);
            ImageIcon imageIcon = new ImageIcon(image);
            getEtiquetaPanel2 = new JLabel(imageIcon);
            panel2.add(getEtiquetaPanel2);
            this.getContentPane().add(panel2,1);
        }catch (MalformedURLException me){
            System.out.println("url no válida");
        }catch (Exception e){
            System.out.println("error al cargar la imagen");
        }


        //panel3
        panel3 = new JPanel();
        panel3.setBackground(new Color(255, 204, 153));
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"opcion","opcion2","opcion3","opcion4"};
        comboBoxPanel3 = new JComboBox<>(elementos);
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel3.getSelectedIndex());

            }
        });
        panel3.add(comboBoxPanel3);
        this.getContentPane().add(panel3,2);
        //panel4
        panel4 = new JPanel();
        panel4.setBackground(new Color(204, 153, 255));
        this.getContentPane().add(panel4,3);

        this.setVisible(true);
    }
}
