import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaVideojuego implements TableModel {
    public static final int COLS = 6;
    ArrayList<VideoJuego> datos;

    public ModeloTablaVideojuego(ArrayList<VideoJuego> datos) {
        this.datos = datos;
    }
    @Override
    public int getRowCount() {
        return this.datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunName = "";
        switch (columnIndex) {
            case 0:
                colunName = "id";
                break;
            case 1:
                colunName = "nombre";
                break;
            case 2:
                colunName = "genero";
                break;
            case 3:
                colunName = "peso en GB";
                break;
            case 4:
                colunName = "plataforma";
                break;
            case 5:
                colunName = "desarrollador";
                break;
        }

        return colunName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.TYPE;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        VideoJuego tmp = (VideoJuego)this.datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getGenero();
            case 3:
                return tmp.getPesoEnGB();
            case 4:
                return tmp.getPlataforma();
            case 5:
                return tmp.getDesarrollador();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }


    @Override
    public void addTableModelListener(TableModelListener l) {

    }


    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

    public void agregarJuego(VideoJuego juego) {
        this.datos.add(juego);
    }
}
