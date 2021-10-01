
package Paquete_1;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args){
     
        String nombre,aporte;
        int fecha,option_1;     
        
        Scientist s1;
        Mipila_1 p1 = new Mipila_1();
        
        do{
            
            option_1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu:\n"
                    + "1. Ingresar cientifico.\n"
                    + "2. Mostrar pila.\n"
                    + "3. Eliminar un nodo.\n"
                    + "4. Vaciar pila.\n"
                    + "5. Salir."));
            
            switch(option_1){
                case 1:
                    nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre: ");
                    fecha = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la fecha del aporte: "));
                    aporte = JOptionPane.showInputDialog(null,"Aporte realizado: ");
            
                    s1 = new Scientist(nombre,fecha,aporte);
                    p1.apilar(s1);
                    break;
                    
                case 2:
                    
                    if(!p1.PilaVacia()){
                        p1.MostrarValores();
                    }else{
                        JOptionPane.showMessageDialog(null, "La pila está vacia.");
                    }                                        
                    break;
                    
                case 3:
                    
                    if(!p1.PilaVacia()){
                        JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo: \n"+p1.EliminarNodo());
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay nada que eliminar.");
                    }
                    
                    break;
                    
                case 4:
                    
                    if(!p1.PilaVacia()){
                        p1.VaciarPila();
                        JOptionPane.showMessageDialog(null, "La pila se ha vaciado correctamente.");
                    }else{
                        JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                    }
                    
                    break;
                    
                case 5:
                    option_1 = 5;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opción no definida.");
                    break;
            }
            
        }while(option_1 != 5);
        
    }    
}
