package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //clase Automovil
        Automovil automovil = new Automovil("BMW","mini",(byte)23, Color.BLACK);
        System.out.println(automovil);
        automovil.encender();
        automovil.gasolina();
        automovil.apagar();

        //clase Monitor
        Monitor monitor = new Monitor(27,"SAMSUMG","CurvedMonitor","AMOLED",14999);
        System.out.println(monitor);
        monitor.encender();
        monitor.brillo();
        monitor.wallpaper();


        //clase Persona
        Persona persona = new Persona("Juan",(byte)56,175.5,70.600,"masculino");
        System.out.println(persona);
        persona.comer();
        persona.caminar();
        persona.crecer();

        //clase Libro
        Libro libro = new Libro("LA CASA DE LOS ESPIRITUS","Isabel Allende","Novela",480);
        System.out.println(libro);
        libro.abrir();
        libro.leido();
        libro.cerrar();




    }
}