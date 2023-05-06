public class Main {
    public static void main(String[] args) {

        //Plan de proyecto
        /**
         * Crear una ventana que administre un almacen
         *
         * -modelo CRUD
         *  crear (dar de alta nuevos productos:
         *                  -id
         *                  -nombre
         *                  -categoria
         *                  -precio
         *                  -unidades
         *                  -foto )
         *  leer (ver lo que está dado de alta en el almacen x medio de una tabla)
         *  modificar ( puedes modificar la tabla)
         *  eliminar ( eliminar objetos de la tabla y recorrer tabla)
         *
         * - administrar con una base de datos de tipo SQLITE
         *   curso de JDBC (java data base)
         *
         * */

        //Ventana ventana = new Ventana("ventana flayout");
        VentanaGrid ventanaGrid = new VentanaGrid("ventana grid");
    }

}