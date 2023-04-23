public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("diesel",3);

        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());

        System.out.println("------motocicleta------");

        Motocicleta motocicleta = new Motocicleta(150,"italika");
        System.out.println(motocicleta);
        System.out.println(motocicleta.encender());
        motocicleta.avanzar();
        motocicleta.hacerCaballito();
        motocicleta.frenar();
        System.out.println(motocicleta.apagar());
    }
}
