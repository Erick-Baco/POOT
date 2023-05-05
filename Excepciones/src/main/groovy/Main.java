import java.util.Scanner;

public class Main {
    /**
     * Manejo de excepciones:
     *
     * try{
     *     //codigo que podría causar una excepción
     * }catch( tipo de excepcion){
     *     //codigo para manejra la excepcion
     *     // un tipo especifico de excepciones
     * }catch (tipo de excepcion 2){
     *     //codigo para manejar la excepcion 2
     *     //excepciones generales
     * }finally{
     *     //siempre se ejecuta, incluso si se lanzaron excepciones
     * }
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {
            int a = 10;
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("division = " + a/b );
        }catch (ArithmeticException e){
            System.out.println(" no se puede dividir entre 0 ");
        }catch (NumberFormatException nfe){
            System.out.println("tipo de dato incorrecto");
        }finally {
            System.out.println("finally siempre se ejecuta ...");
        }

        System.out.println("fin del programa");

    }
}
