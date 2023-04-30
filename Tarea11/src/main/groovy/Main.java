import javax.security.auth.callback.CallbackHandler;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Caja<String> miCaja = new Caja<>(new String[10]);
        miCaja.add(0,"hola");
        miCaja.add(1,"adios");
        miCaja.add(2,"hi");
        System.out.println(miCaja);

        String temp = miCaja.get(0);

        System.out.println("======= Caja sin genericos ========");

        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0,"hola");
        cajaSin.add(1,"adios");
        cajaSin.add(2,"hi");
        System.out.println(cajaSin);

        String temp2 = (String) cajaSin.get(0);

        System.out.println("======= Comida =======");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yogirt", true));
        System.out.println(cajaComida.get(0));

        System.out.println("===================");

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("manzana",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        comidas.add(new Comida("zanahoria",false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(0));

        ArrayList<Comida> comidas1 = new ArrayList<>();
        comidas1.add(new Comida("zanahoria",false));
        comidas1.add(new Comida("yogurt",true));
        comidas1.add(new Comida("danonino",true));
        comidas1.add(new Comida("manzana",false));
        comidas1.add(new Comida("bisteck",false));

        System.out.println(comidas1.get(3));
        //sustituye
        comidas1.set(3,new Comida("fresa",false));
        //introduce y recorre
        comidas1.add(3, new Comida("naranja",false));
        //introduce al finall
        comidas1.add(new Comida("toronja",false));

        System.out.println("====final=====");

        for (Comida comida : comidas1) {
            System.out.println(comida);
        }

    }
}
