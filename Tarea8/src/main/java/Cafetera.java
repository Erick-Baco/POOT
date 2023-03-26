public class Cafetera {
    //se miden en ml
    private int cantidadAgua;
    private int cantidadCafe;
    private int cantidadCrema;
    //se miden en unidades
    private int cantidadVasos;

    public Cafetera() {
    }

    public Cafetera(int cantidadAgua, int cantidadCafe, int cantidadCrema, int cantidadVasos) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadCafe = cantidadCafe;
        this.cantidadCrema = cantidadCrema;
        this.cantidadVasos = cantidadVasos;
    }

    public int getCantidadAgua() {
        return cantidadAgua;
    }

    public void setCantidadAgua(int cantidadAgua) {
        if (cantidadAgua > 0 && cantidadAgua <= 5000)
        this.cantidadAgua = cantidadAgua;
    }

    public int getCantidadCafe() {
        return cantidadCafe;
    }

    public void setCantidadCafe(int cantidadCafe) {
        if (cantidadCafe > 0 && cantidadCafe <= 1000)
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCrema() {
        return cantidadCrema;
    }

    public void setCantidadCrema(int cantidadCrema) {
        if (cantidadCrema > 0 && cantidadCrema <= 1500)
        this.cantidadCrema = cantidadCrema;
    }

    public int getCantidadVasos() {
        return cantidadVasos;
    }

    public void setCantidadVasos(int cantidadVasos) {
        this.cantidadVasos = cantidadVasos;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "cantidadAgua=" + cantidadAgua +
                ", cantidadCafe=" + cantidadCafe +
                ", cantidadCrema=" + cantidadCrema +
                ", cantidadVasos=" + cantidadVasos +
                '}';
    }

    public boolean americano(int cantidad ){
        boolean x = false;
        if (cantidadAgua >= 180 * cantidad && cantidadCafe >= 15 * cantidad && cantidadVasos >= 1 * cantidad){
            cantidadAgua -= 180 * cantidad;
            cantidadCafe -= 15 * cantidad;
            cantidadVasos -= 1 * cantidad;
            System.out.println("\tPreparando");
            System.out.println("\t\t...");
            System.out.println( "\t" + cantidad + " Café americano (s) listo :)");
            x = true;
        }
        else {
            if (cantidadAgua < 180*cantidad)
                System.out.println("\tnecesita recargar agua");
            if (cantidadCafe < 15*cantidad)
                System.out.println("\tnecesita recargar cafe");
            if (cantidadVasos < 1*cantidad)
                System.out.println("\tnecesita recargar vasos");
        }
        return x;
    }

    public boolean expreso(int cantidad){
        boolean x = false;
        if (cantidadAgua >= 120 * cantidad && cantidadCafe >= 20 * cantidad && cantidadVasos >= 1 * cantidad){
            cantidadAgua -= 120 * cantidad;
            cantidadCafe -= 20 * cantidad;
            cantidadVasos -= 1 * cantidad;
            System.out.println("\tPreparando");
            System.out.println("\t\t...");
            System.out.println("\t" + cantidad + " Café expreso (s) listo :)");
            x = true;
        }else {
            if (cantidadAgua < 120 * cantidad)
                System.out.println("\tnecesita recargar agua");
            if (cantidadCafe < 20 * cantidad)
                System.out.println("\tnecesita recargar cafe");
            if (cantidadVasos < 1 * cantidad)
                System.out.println("\tnecesita recargar vasos");
        }
        return x;
    }

    public boolean capuchino(int cantidad){
        boolean x = false;
        if (cantidadAgua >= 100 * cantidad && cantidadCafe >= 14 * cantidad && cantidadVasos >= 1 * cantidad && cantidadCrema >= 70 * cantidad){
            cantidadAgua -= 100 * cantidad;
            cantidadCafe -= 14 * cantidad;
            cantidadCrema -= 70 * cantidad;
            cantidadVasos -= 1 * cantidad;
            System.out.println("\tPreparando");
            System.out.println("\t\t...");
            System.out.println("\t" + cantidad + " Café capuchino (s) listo :)");
            x = true;
        }else {
            if (cantidadAgua < 100 * cantidad)
                System.out.println("\tnecesita recargar agua");
            if (cantidadCafe < 14 * cantidad)
                System.out.println("\tnecesita recargar cafe");
            if (cantidadVasos < 1 * cantidad)
                System.out.println("\tnecesita recargar vasos");
            if (cantidadCrema < 70 * cantidad)
                System.out.println("\tnecesita recargar crema");
        }
        return x;
    }


    public void estado (){
        System.out.println("\tcantidad de agua disponible: " + cantidadAgua + "ml"
                           + "\n\tcantidad de cafe disponible: " + cantidadCafe + "gm"
                           + "\n\tcantidad de crema disponible: " + cantidadCrema + "ml"
                           + "\n\tcantidad de vasos disponibles: " + cantidadVasos );
    }
}
