package persistencia;

import java.sql.SQLException;
import java.util.ArrayList;

public interface InterfazDao {
    public abstract boolean insertar (Object obj) throws SQLException;
    public abstract boolean update (Object obj) throws SQLException;
    public abstract boolean delete (String id) throws SQLException;
    public abstract ArrayList obtenerTodo () throws SQLException;
    public abstract Object buscarPorID (String id) throws SQLException;
}
