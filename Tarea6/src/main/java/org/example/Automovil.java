package org.example;

import java.awt.*;

public class Automovil {
    //atributos
    private String marca;
    private String submarca;
    private byte modelo;
    private Color color;

    //metodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public byte getModelo() {
        return modelo;
    }

    public void setModelo(byte modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //metodos constructore por defecto y sobrecargados
    public Automovil(String marca, String submarca, byte modelo, Color color) {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil() {
    }

    //toString
    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", submarca='" + submarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                '}';
    }

    public void encender(){
        System.out.println(submarca+" encendiendo");
    }
    public void gasolina(){
        System.out.println("recargando\n   ...   \n tanque lleno");
    }
    public void apagar(){
        System.out.println("apagando " + submarca);
    }
}
