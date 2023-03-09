package org.example;

import java.util.Scanner;

public class Balon {
    private int diametro;
    private String deporte;
    private String material;
    private double gramos;

    public Balon() {
    }

    public Balon(int diametro, String deporte, String material, double gramos) {
        this.diametro = diametro;
        this.deporte = deporte;
        this.material = material;
        this.gramos = gramos;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getGramos() {
        return gramos;
    }

    public void setGramos(double gramos) {
        this.gramos = gramos;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "diametro=" + diametro +
                ", deporte='" + deporte + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    public void inflar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inflando balon ");
        System.out.println("Cuanto desea inflar¿ (g)");
        int aire = sc.nextInt();

        System.out.println("Inflando...");

        gramos = gramos + aire;

        System.out.println("ahora el balon tiene la cantidad perfecta de aire " + gramos + "g");
    }

    public void clasificar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("cual es el diametro del balon?");
        diametro = sc.nextInt();

        if (diametro > 7.3 && diametro < 7.5)
            System.out.println("el valon es de beisbol");
        if (diametro == 4)
            System.out.println("el valon es de golf");
        if (diametro > 5 && diametro < 7)
            System.out.println("el valon es de billar");
        if (diametro > 20.7 && diametro < 21.3)
            System.out.println("el valon es de soccer");
    }
}
