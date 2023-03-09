package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class Gato {
    private byte edad;
    private String raza;
    private  String nombre;
    private String sexo;

    public Gato() {
    }

    public Gato(byte edad, String raza, String nombre, String sexo) {
        this.edad = edad;
        this.raza = raza;
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "edad=" + edad +
                ", raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
    public void carnet(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> vacunas = new ArrayList<>();
        vacunas.add("Rabia");
        vacunas.add("Leucemia");
        vacunas.add("Parvovirus");
        vacunas.add("Moquillo");

        System.out.println("que vacuna deseas registrar");
        String vacuna = sc.nextLine();

        vacunas.add(vacuna);

        System.out.println(" Ahora tu gato tiene las siguientes vacunas: ");
        for (String vac : vacunas) {
            System.out.println(vac);
        }

        System.out.println(vacunas.size() + "/15");
    }
    public void alimentar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres saber cada cuanto alimentar a tu gato?");
        System.out.println("Cual fue la ultima hora en que lo alimentaste [14]");
        int ultHora = sc.nextInt();

        if (ultHora > 20){
            System.out.println("tu gato debe comer hasta mañana");
        }else {
            System.out.println("\n\t...\t");
            System.out.println("Las comidas de tu gato el día de hoy serán a las: ");

            while (ultHora <= 24){
                ultHora += 4;
                if (ultHora>24){
                    System.out.println("=========");
                }else
                System.out.println("a las " + ultHora + "hrs");
            }
        }
    }
}
