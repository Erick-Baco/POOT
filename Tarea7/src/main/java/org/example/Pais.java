package org.example;

import java.util.Scanner;

public class Pais {
    private String nombre;
    private String moneda;
    private String lengua;
    private int extension;
    private double pib;

    public Pais() {
    }

    public Pais(String nombre, String moneda, String lengua, int extension, double pib) {
        this.nombre = nombre;
        this.moneda = moneda;
        this.lengua = lengua;
        this.extension = extension;
        this.pib = pib;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getLengua() {
        return lengua;
    }

    public void setLengua(String lengua) {
        this.lengua = lengua;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", moneda='" + moneda + '\'' +
                ", lengua='" + lengua + '\'' +
                ", extension=" + extension +
                ", pib=" + pib +
                '}';
    }

    public void desarrollo(){
        double crecimientoAnual = pib * 0.3;
        String tiempo = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("Desarrollo nacional");
        System.out.println("Por cuanto tiempo desea invertir?");
        tiempo=sc.nextLine();
        System.out.println("Invertira por " + tiempo + " años a una taza de crecimiento de 0.3 anuales.");
        int num = Integer.parseInt(tiempo);
        double riqueza = crecimientoAnual * num;
        System.out.println("Después de " + tiempo + " años su riqueza será de: " + riqueza + "b USD");

    }

    public void comerciar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println(" con quien desea comerciar");
        System.out.println("1. EU");
        System.out.println("2. Brazil");
        System.out.println("3. Europa");
        System.out.println("0. Ninguno");
        String socio = sc.nextLine();

        switch (socio){
            case "1":
                double beneficio = 0.002;
                pib = pib + (pib * beneficio);
                System.out.println("las ganancias fueron de 0.002");
                System.out.println("Ahora el pib es: " + pib);
                break;
            case  "2":
                beneficio = 0.004;
                pib = pib + (pib * beneficio);
                System.out.println("las ganancias fueron de 0.001");
                System.out.println("ahora el ´pib es: " + pib);
                break;
            case  "3":
                beneficio = 0.003;
                pib = pib + (pib * beneficio);
                System.out.println("las ganancias fueron de 0.001");
                System.out.println("ahora el ´pib es: " + pib);
                break;
            case  "0":
                System.out.println(" no gana nada");
                break;
        }


    }
}
