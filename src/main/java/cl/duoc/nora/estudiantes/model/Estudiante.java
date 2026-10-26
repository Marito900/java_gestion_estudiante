package cl.duoc.nora.estudiantes.model;

public class Estudiante {
    private int id;
    private String nombre;
    private String correo;
    private String carrera;
    private String jornada;

    public Estudiante() { }

    public Estudiante(int id, String nombre, String correo, String carrera, String jornada) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.jornada = jornada;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    public String getJornada() { return jornada; }
    public void setJornada(String jornada) { this.jornada = jornada; }
}