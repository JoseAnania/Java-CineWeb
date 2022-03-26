package Controlador;

import Dto.PeliculaDto;
import Modelo.Pelicula;
import Modelo.Tipo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {

    private Connection con;
    private PreparedStatement PS;
    private Statement S;
    private ResultSet RS;

    public void abrirConexion() {
        try {
            String url = "jdbc:sqlserver://DESKTOP-E8FRIUV\\SQLEXPRESS:1433;databaseName=Cine";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            con = DriverManager.getConnection(url, "sa", "giandjoe");
            System.out.println("Conexión a la BD");
        } catch (Exception e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        try {
            con.close();
            System.out.println("Conexión a la BD cerrada");
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexión:" + e.getMessage());
        }
    }
    
    public void agregarPelicula(Pelicula nuevaPelicula)
    {
        try {
            abrirConexion();
            PS=con.prepareStatement("INSERT INTO Pelicula (nombre, descripcion, idTipo, calificacion, duracion) VALUES (?,?,?,?,?)");
            
            PS.setString(1, nuevaPelicula.getNombreP());
            PS.setString(2, nuevaPelicula.getDescripcion());
            PS.setInt(3, nuevaPelicula.getIdT());
            PS.setInt(4, nuevaPelicula.getCalificacion());
            PS.setInt(5, nuevaPelicula.getDuracion());
            
            PS.execute();
            PS.close();
            cerrarConexion();
            
        } catch (Exception e) {
        }
    }
    
    public ArrayList<Tipo>llenarCombo()
    {
        ArrayList<Tipo>lista=new ArrayList<>();
        
        try {
            abrirConexion();
            S=con.createStatement();
            RS=S.executeQuery("SELECT * FROM Tipo");
            
            while(RS.next())
            {
                Tipo T=new Tipo();
                
                T.setIdT(RS.getInt(1));
                T.setNombreT(RS.getString(2));
                
                lista.add(T);
            }
            RS.close();
            S.close();
            cerrarConexion();
            
        } catch (Exception e) {
        }
        return lista;
    }
    public ArrayList<PeliculaDto>llenarTabla()
    {
        ArrayList<PeliculaDto>lista=new ArrayList<>();
        
        try {
            abrirConexion();
            S=con.createStatement();
            RS=S.executeQuery("SELECT p.idPelicula, p.nombre, p.descripcion, t.nombre, p.calificacion, p.duracion FROM Pelicula p INNER JOIN Tipo t on p.idTipo=t.idTipo ");
            
            while(RS.next())
            {
                PeliculaDto P=new PeliculaDto();
                
                P.setIdP(RS.getInt(1));
                P.setNombreP(RS.getString(2));
                P.setDescripcion(RS.getString(3));
                P.setNombreT(RS.getString(4));
                P.setCalificacion(RS.getInt(5));
                P.setDuracion(RS.getInt(6));
                
                lista.add(P);
            }
            RS.close();
            S.close();
            cerrarConexion();
            
        } catch (Exception e) {
        }
        return lista;
    }
}
