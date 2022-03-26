
package Modelo;

public class Pelicula {
    
    private int idP;
    private String nombreP;
    private String descripcion;
    private int idT;
    private int calificacion;
    private int duracion;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public Pelicula(int idP, String nombreP, String descripcion, int idT, int calificacion, int duracion) {
        this.idP = idP;
        this.nombreP = nombreP;
        this.descripcion = descripcion;
        this.idT = idT;
        this.calificacion = calificacion;
        this.duracion = duracion;
    }
    
}
