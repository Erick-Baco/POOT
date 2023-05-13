public class VideoJuego {
    private int id;
    private String nombre;
    private String genero;
    private double pesoEnGB;
    private String plataforma;
    private String desarrollador;

    public VideoJuego() {
    }

    public VideoJuego(int id, String nombre, String genero, double pesoEnGB, String plataforma, String desarrollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.pesoEnGB = pesoEnGB;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPesoEnGB() {
        return this.pesoEnGB;
    }

    public void setPesoEnGB(double pesoEnGB) {
        this.pesoEnGB = pesoEnGB;
    }

    public String getPlataforma() {
        return this.plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrollador() {
        return this.desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String toString() {
        return "VideoJuego{id=" + this.id + ", nombre='" + this.nombre + "', genero='" + this.genero + "', pesoEnGB=" + this.pesoEnGB + ", plataforma='" + this.plataforma + "', desarrollador='" + this.desarrollador + "'}";
    }
}
