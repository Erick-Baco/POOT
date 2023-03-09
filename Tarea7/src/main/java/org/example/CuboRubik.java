package org.example;

import java.util.Scanner;

public class CuboRubik {
    private String material;
    private int numDivisiones;
    private String forma;

    public CuboRubik() {
    }

    public CuboRubik(String material, int numDivisiones, String forma) {
        this.material = material;
        this.numDivisiones = numDivisiones;
        this.forma = forma;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumDivisiones() {
        return numDivisiones;
    }

    public void setNumDivisiones(int numDivisiones) {
        this.numDivisiones = numDivisiones;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "material='" + material + '\'' +
                ", numDivisiones='" + numDivisiones + '\'' +
                ", forma='" + forma + '\'' +
                '}';
    }

    public void resolver(){

        Scanner sc = new Scanner(System.in);

        System.out.println("forma:\n1. cubo\n2. piramide");
        forma = sc.nextLine();

        switch (forma){
            case "1":
                System.out.println("numero de divisiones? ");
                numDivisiones = sc.nextInt();
                if (numDivisiones == 3)
                    System.out.println("se necesitan 20 movimientos siguiendo el numero de dios");
                else
                    System.out.println("depende de tu habilidad");
                break;
            case "2":
                System.out.println("se necesitan menos de 20 movimientos en promedio");
                break;
        }

    }

    public void practica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("tienes un minuto para resolver el cubo");
        int flag = 1;
        do{
            int s = 0;
            while (s <= 10){
                s++;
                try {
                    // Pausar la ejecución del hilo actual durante 3 segundos
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(s);
            }
            System.out.println("El tiempo terminó !!");
            System.out.println("Deseas volver a intentarlo?\n1. si\n0. no");
            int option = sc.nextInt();
            flag = option;
        }while (flag == 1);
    }
}
