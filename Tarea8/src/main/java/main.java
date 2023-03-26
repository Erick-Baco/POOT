import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Cafetera cafetera = new Cafetera(5000,1000,1500,50);
        Scanner sc = new Scanner(System.in);

        int cantidad;
        System.out.println("\tbienvenido a la cafeteria Sugar");

        int opcion = 1;
        boolean y = true;
        do {
            System.out.println("\t\t =MENU= \n\t1. cafe americano\n\t2. cafe expreso\n\t3. cafe capuchino ");
            System.out.println("\tselecciona la opción preferida*");
            opcion = sc.nextInt();
            System.out.println("\tselecciona la cantidad de cafes");
            cantidad = sc.nextInt();


            switch (opcion){
                case 1:
                    if (cafetera.americano(cantidad) == true){
                        cafetera.estado();
                        y = true;
                    }else {
                        y = false;
                        cafetera.estado();
                    }
                    break;
                case 2:
                    if (cafetera.expreso(cantidad) == true){
                        cafetera.estado();
                        y = true;
                    }else {
                        y = false;
                        cafetera.estado();
                    }
                    break;
                case 3:
                    if (cafetera.capuchino(cantidad) == true){
                        cafetera.estado();
                        y = true;
                    }else{
                        y = false;
                        cafetera.estado();
                    }
                    break;
                default:
                    System.out.println("\topcion invalida vuelve a intentarlo");
                    break;
            }
        }while (opcion > 0 && opcion <= 3 && y == true);

    }
}
