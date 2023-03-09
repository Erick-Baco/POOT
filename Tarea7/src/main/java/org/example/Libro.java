package org.example;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Libro {
    private int numPaginas;
    private String autor;
    private String tipo;

    public Libro() {
    }

    public Libro(int numPaginas, String autor, String tipo) {
        this.numPaginas = numPaginas;
        this.autor = autor;
        this.tipo = tipo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "numPaginas=" + numPaginas +
                ", autor='" + autor + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void avanzarPagina(){
        int pagina = 0;
        int ps = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("pagina anterior:" + pagina);
            pagina++;
            System.out.println("pagina actual:" + pagina);
            ps = pagina+1;
            System.out.println("pagina siguiente:" + ps);

            System.out.println("Terminaste de leer¿");
            System.out.println("presiona: \n1 para avanzar de pagina ");
            int opcion = sc.nextInt();
        }while (pagina <= numPaginas);
    }

    public void notas(){
        try {
            File archivo = new File("C:\\Users\\hp\\Desktop\\notas.txt");
            FileWriter escritor = new FileWriter(archivo, true);
            Scanner lector = new Scanner(System.in);
            System.out.print("Ingrese las notas sobre el libro: ");
            String texto = lector.nextLine();
            escritor.write(texto);

            lector.close();
            escritor.close();

        } catch (Exception e) {
        System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
