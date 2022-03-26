
package Dto;

public class PeliculaDto {
    private int idP;
    private String nombreP;
    private String descripcion;
    private String nombreT;
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

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
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

    public PeliculaDto() {
    }

    public PeliculaDto(int idP, String nombreP, String descripcion, String nombreT, int calificacion, int duracion) {
        this.idP = idP;
        this.nombreP = nombreP;
        this.descripcion = descripcion;
        this.nombreT = nombreT;
        this.calificacion = calificacion;
        this.duracion = duracion;
    }
    
}
