
package Paquete_1;

public class Scientist {
    
    String nombre;
    int fecha;
    String aporte;
    
    public Scientist(String nombre, int fecha, String aporte){        
        this.nombre = nombre;
        this.fecha = fecha;
        this.aporte = aporte;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getFecha(){
        return fecha;
    }
    
    public String getAporte(){
        return aporte;
    }
    
    public String MostrarDatos(){
        return "Nombre: "+nombre+"\nFecha: "+fecha+"\nAporte: "+aporte;
    }        
}
