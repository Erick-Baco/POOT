package org.example;

public class Libro {
    // atributos
    private String titulo;
    private String autor;
    private String genero;
    private int paginas;

    //metodos de acceso
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    //metodos constructores sobrecargados y por defecto
    public Libro() {
    }

    public Libro(String titulo, String autor, String genero, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
    }

    //toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public void abrir(){
        System.out.println("ahora puedes leer");
    }
    public void leido(){
        int pac = paginas - 250;
        int paa = pac - 1;
        int pas = paa + 1;
        System.out.println("pagina anterior " + paa +" <= pagina actual " + pac + " => pagina siguiente " + pas);
    }
    public void cerrar(){
        System.out.println("ya no puedes leer");
    }
}
