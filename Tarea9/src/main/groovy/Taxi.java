import java.util.Scanner;

public class Taxi extends Automovil{
    private String conductorID;
    private String plataforma;
    private final double TARIFAKM = 20;

    public Taxi() {
    }

    public Taxi(String tipo, String clasificacion, boolean motor, String placa, String marca, String modelo, String anio, String conductorID, String plataforma) {
        super(tipo, clasificacion, motor, placa, marca, modelo, anio);
        this.conductorID = conductorID;
        this.plataforma = plataforma;
    }

    public String getConductorID() {
        return conductorID;
    }

    public void setConductorID(String conductorID) {
        this.conductorID = conductorID;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getTARIFAKM() {
        return TARIFAKM;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "conductorID='" + conductorID + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", TARIFAKM=" + TARIFAKM +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + anio + '\'' +
                ", tipo='" + tipo + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", motor=" + motor +
                '}';
    }
    public void calcularTarifa(){
        Scanner sc = new Scanner(System.in);
        double distancia;
        System.out.println("cual fue la distancia: (km)");
        distancia = sc.nextDouble();
        distancia *= TARIFAKM;
        System.out.println("el costo del viaje es de $" + distancia);
    }
    public void solicitarViaje(){
        Scanner sc = new Scanner(System.in);
        int tiempo=(int)Math.random()*10;
        System.out.println("A donde desea ir: ");
        String lugar = sc.nextLine();
        System.out.println("buscando conductor...");
        System.out.println("listo, el conductor: " + conductorID
                + " pasara por ti en : "
                + tiempo + " minutos");
    }
}
