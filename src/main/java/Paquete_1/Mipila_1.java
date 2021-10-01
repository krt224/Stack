
package Paquete_1;

import javax.swing.JOptionPane;

public class Mipila_1 {
    
    private class Nodo{
        
        public Scientist Sct;
        
        public Nodo siguiente = null;
        
        public Nodo(Scientist Sct){
            this.Sct = Sct;
        }                        
    }
    
    private Nodo cima = null;
    private int longitud = 0;  
    String Lista = "";
    
    public boolean PilaVacia(){
        return cima == null;
    }
                            
    public void apilar(Scientist Sct){               
      
        Nodo nodo = new Nodo(Sct);
        nodo.siguiente = cima;
        cima = nodo;
        longitud++;
    }
    
    public String EliminarNodo(){
        int a = longitud;
        String auxiliar = cima.Sct.MostrarDatos();
        cima = cima.siguiente;        
        longitud--;       
        return "Cientifico "+a+":\n"+auxiliar;
    }
    
    public void VaciarPila(){        
        while(!PilaVacia()){
            EliminarNodo();
        }        
    }
                     
    
    public void MostrarValores(){
        int i=longitud;
        Nodo recorrido = cima;
        
        while(recorrido != null){            
            Lista += "Cientifico "+i+":\n"+recorrido.Sct.MostrarDatos() + "\n\n";
            recorrido = recorrido.siguiente;                       
            i--;
        }
        
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }            
}
