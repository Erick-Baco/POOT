import java.util.Scanner;

public class Automovil extends Vehiculo{
    protected String placa;
    protected String marca;
    protected String modelo;
    protected String anio;

    public Automovil() {
    }

    public Automovil(String tipo, String clasificacion, boolean motor, String placa, String marca, String modelo, String anio) {
        super(tipo, clasificacion, motor);
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + anio + '\'' +
                ", tipo='" + tipo + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", motor=" + motor +
                '}';
    }

    @Override
    public void encender() {
        System.out.println("el automovil está encendido ");
    }

    @Override
    public void apagar() {
        System.out.println("el automovil está apagado");
    }
    public void velocidades(){
        Scanner sc = new Scanner(System.in);
        System.out.println("cambiar a velocidad: ");
        int entrada = sc.nextInt();
        if (entrada <= 5)
            System.out.println("ahora está en la " + entrada + " velocidad");
        else
            System.out.println("error");
    }
    public void combustible(){
        double costo = 21.45;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tipo de combustible (gasolina/electrico");
        String opcion = sc.nextLine();

        switch (opcion){
            case "gasolina":
                System.out.println("Cuanta gasolina desea cargar (litros): ");
                System.out.println("costo de gasolina: $" + costo);
                int cantidad = sc.nextInt();
                cantidad *= costo;
                System.out.println("cargando...");
                System.out.println("listo, debe pagar: $" + cantidad);
                break;
            case "electrico":
                System.out.println("cuanto tiempo desea cargar su vehiculo(horas: ");
                int horas = sc.nextInt();
                horas *= costo;
                System.out.println("cargando...");
                System.out.println("listo, debe pagar: $" + horas);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
