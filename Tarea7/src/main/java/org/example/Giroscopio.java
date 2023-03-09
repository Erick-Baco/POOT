package org.example;

import java.util.Scanner;

public class Giroscopio {
    private String material;
    private String posicion;
    private  int estado;
    private int costo;

    public Giroscopio() {
    }

    public Giroscopio(String material, String posicion, int estado, int costo) {
        this.material = material;
        this.posicion = posicion;
        this.estado = estado;
        this.costo = costo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "material='" + material + '\'' +
                ", posicion='" + posicion + '\'' +
                ", estado=" + estado +
                ", costo=" + costo +
                '}';
    }

    public void girar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Grados: ");
        estado = sc.nextInt();

        if (estado < 180 && estado > 0){
            if (estado == 90)
                posicion = "vertical, arriba";
            System.out.println(posicion);
            if (estado < 90)
                posicion = "inclinado, arriba";
            System.out.println(posicion);
            if (estado > 90)
                posicion = "declinado, arriba";
            System.out.println(posicion);
        }else {
            if (estado == 180)
                posicion = "horizontal, abajo";
            System.out.println(posicion);
            if (estado == 270)
                posicion = "vertical, abajo";
            System.out.println(posicion);
            if (estado < 270 )
                posicion = "inclinado, abajo";
            System.out.println(posicion);
            if (estado > 270)
                posicion = "declinado, abajo";
            System.out.println(posicion);
            if (estado == 360 || estado == 0)
                posicion = "horizontal, arriba";
            System.out.println(posicion);
        }
    }

    public void calidad(){
        if (costo < 500)
            System.out.println("La calidad del giroscopio es buena");
        if (costo > 500)
            System.out.println("Es necesario otro giroscopio");

    }
}
