package org.example;



public class Main {
    public static void main(String[] args) {

        Pais pais = new Pais("Mexico", "Peso", "Español", 1964375, 1.2);
        pais.desarrollo();
        pais.comerciar();

        Giroscopio giroscopio = new Giroscopio("Metal", null, 0, 800);
        giroscopio.girar();
        giroscopio.calidad();

        CuboRubik cuboRubik = new CuboRubik("plastico", 0, null);
        cuboRubik.resolver();
        cuboRubik.practica();

        Libro libro = new Libro(10,"King","novela");
        libro.avanzarPagina();
        libro.notas();

        Balon balon = new Balon(21,null,"textil",300);
        balon.clasificar();
        balon.inflar();

        Lampara lampara = new Lampara(false,"LED",null );
        lampara.prender();
        lampara.color();

        Gato gato = new Gato((byte)1,"egipcio","mauricio","macho");
        gato.carnet();
        gato.alimentar();

    }
}