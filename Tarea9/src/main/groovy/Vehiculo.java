public class Vehiculo {
    protected String tipo;
    protected String clasificacion;
    protected boolean motor;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String clasificacion, boolean motor) {
        this.tipo = tipo;
        this.clasificacion = clasificacion;
        this.motor = motor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", motor=" + motor +
                '}';
    }

    public void encender (){
        System.out.println("el vehiculo está encendido");
    }
    public void apagar(){
        System.out.println("apagado");
    }

}
