package org.example;

import java.util.Scanner;

public class Lampara {
    private boolean prendido;
    private String tipo;
    private String color;

    public Lampara() {
    }

    public Lampara(boolean prendido, String tipo, String color) {
        this.prendido = prendido;
        this.tipo = tipo;
        this.color = color;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "prendido=" + prendido +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void prender(){
        prendido = false;
        String opcion = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("La lampara está apagada \n Deseas prenderla? Y/N ");
        opcion=sc.next();
        if (opcion.equals("Y")){
            prendido = true;
            System.out.println("la lampara está prendida");

        }
        if (opcion.equals("N")){
            prendido = false;
            System.out.println("la lampara está apagada");
        }

    }
    public void color(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema donde puedes elegir la tonalidad de la luz de tu lampara");
        System.out.println("Que tipo de lampara es: (LED, IN)");
        String opcion = sc.nextLine();
        if (opcion.equals("LED")){
            System.out.println("Que color deseas \n1 Blanca \n2 Calida \n3 Otro");
            String opcion1 = sc.nextLine();
            switch (opcion1){
                case "1":
                    color = "Blanca";
                    System.out.println("la luz ahora es " + color);
                    break;
                case "2":
                    color = "amarilla";
                    System.out.println("la luz ahora es " + color);
                    break;
                case "3":
                    System.out.println("ingresa el color: ");
                    color = sc.nextLine();
                    System.out.println("exito, ahora la luz es de color " + color);
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
        }else {
            System.out.println("Tu lampara no puede cambiar de color");
        }


    }
}
