
package Modelo;

public class Tipo {
    
    private int idT;
    private String nombreT;

    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
    }

    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public Tipo() {
    }

    public Tipo(int idT, String nombreT) {
        this.idT = idT;
        this.nombreT = nombreT;
    }
    
}
