package org.example;

public class Monitor {
    //atributos
    private double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;

    //metodos constructore sobrecargados y por defecto
    public Monitor(double pulgadas, String marca, String modelo, String tipo, double precio) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Monitor() {
    }

    //metodos de acceso
    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //toStrign
    @Override
    public String toString() {
        return "Monitor{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void encender(){
        System.out.println(marca + " no signal");
    }
    public void brillo(){
        System.out.println("aumentando brillo...\nbrillo maximo");
    }
    public void wallpaper(){
        System.out.println("seleccione el nuevo fondo de pantalla: ");
    }
}
