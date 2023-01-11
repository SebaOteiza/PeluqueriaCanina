
package peliculas;

import java.util.ArrayList; //el arrayList almacena objetos 
import javax.swing.JOptionPane;
public class Main {

   
    public static void main(String[] args) {
        
        /*
        JOptionPane.ERROR_MESSAGE. -> 0
        JOptionPane.INFORMATION:MESSAGE. -> 1
        JOptionPane.WARNING_MESSAGE. -> 2
        JOptionPane.QUESTION_MESSAGE. -> 3
     
        */
        
        
        //TODO LO QUE INGRESA POR EL CUADRO DE DIALOGO SERÁ CONSIDERADO STRING 
        
        String valor = JOptionPane.showInputDialog(
                null,
                "Ingrese un texto",
                "Entrada",
                3);
        
        //me va a imprimir un cuadro de diálogo
        JOptionPane.showMessageDialog(
                null, 
                valor, //ESTE VALOR EQUIVALE A LO QUE SE INGRESÓ ARRIBA EN EL INPUT CREADO 
                "Mi Mensaje",
               JOptionPane.ERROR_MESSAGE );
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*ArrayList<String> meses = new ArrayList<>(); //así se define un arraylist
        
        //no definimos la cantidad que se van a almacenar a diferencia del ARRAY 
        
        meses.add("Enero"); //el add es para asignar un nuevo dato
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        System.out.println(meses);
        
        //también se puede iterar con iun foreach
        
        for(String dato : meses){
            System.out.println(dato);
        }*/
    }
    
}
