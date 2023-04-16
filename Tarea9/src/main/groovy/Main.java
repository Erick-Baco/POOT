public class Main {
    public static void main(String[] args) {

        System.out.println("========vehiculo==========");

        Vehiculo globo = new Vehiculo("aereo","personas",false);
        globo.apagar();
        globo.encender();

        System.out.println("========automovil==========");
        Automovil automovil = new Automovil("terrestre","mercancias",true,"14OTP","O874","mercedes benz","2020");
        automovil.encender();
        automovil.combustible();
        automovil.velocidades();
        automovil.apagar();

        System.out.println("==========taxi============");
        Taxi taxi = new Taxi("terrestre","personas",true,"OPC87","chevrolet","aveo","2021","Juan542","taxisCDMX");
        taxi.encender();
        taxi.combustible();
        taxi.solicitarViaje();
        taxi.velocidades();
        taxi.calcularTarifa();
        taxi.apagar();
    }
}
