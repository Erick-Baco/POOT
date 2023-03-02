package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        String move = "";
        boolean flag = true;
        int ascii;
        String [][] parts ;
        parts = new String[3][3];
        do {
            flag = true;
            //impresiones
            System.out.println("Introduce la cadena: ");
            move = sc.nextLine();

            //control de errores
            //tamaño
            if (move.length() != 9)
                flag = false;

            //caracteres
            for (int i = 0; i < move.length(); i++) {
                char caracter = move.charAt(i);
                ascii = (int) caracter;
                if (ascii != 88 && ascii != 79 && ascii != 95){
                    flag = false;
                }
            }

            //reinicio
            if(flag == false)
                System.out.println("entrada no válida");

        }while(flag == false);

        //dividir
        String[] caracteres = move.split("");

        //poner move en la matriz
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                parts[i][j] = caracteres[k++];
            }
        }

        //imprimrir
        System.out.println("-----");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(parts[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-----");
    }
}