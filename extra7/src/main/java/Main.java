import modelo.Libro;
import persistencia.DemoLibroDB;
import persistencia.LibroDao;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        LibroDao ldao = new LibroDao();

       try{
           Libro res = (Libro) ldao.buscarPorID("1");
           System.out.println(res);
           System.out.println("===========");
           for (Object lib :
                   ldao.obtenerTodo()) {
               System.out.println((Libro)lib);
               System.out.println("====");
           }
       }catch (SQLException sqle){
           System.out.println("error");
       }
    }
}
