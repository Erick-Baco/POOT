import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class NombreModeloCombo implements ComboBoxModel {
    private ArrayList<String> datos;
    private String selected;

    public NombreModeloCombo(ArrayList<String> datos) {
        this.datos = datos;
    }

    public NombreModeloCombo() {
        datos = new ArrayList<>();
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selected = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return datos.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
    public void agregarNombre (String nombre){
        datos.add(nombre);
    }
}
