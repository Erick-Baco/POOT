package org.example;

public class Persona {
    //atributos
    private String nombre;
    private byte edad;
    private double estatura;
    private double peso;
    private String genero;

    //metodos constructore sobrecargados y por defecto
    public Persona(String nombre, byte edad, double estatura, double peso, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public Persona() {
    }

    //metodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void caminar(){
        peso -=0.001;
        System.out.println("ahora eres saludable " + peso);
    }
    public void crecer(){
        edad++;
        System.out.println("nueva edad " +edad);
    }
    public void comer(){
        peso+=0.125;
        System.out.println("comiendo... nuevo peso " + peso);
    }
}
