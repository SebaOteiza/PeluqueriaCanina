
package peliculas;

import java.util.ArrayList; //el arrayList almacena objetos 
public class Main {

   
    public static void main(String[] args) {
        
        ArrayList<String> meses = new ArrayList<>(); //así se define un arraylist
        
        //no definimos la cantidad que se van a almacenar a diferencia del ARRAY 
        
        meses.add("Enero"); //el add es para asignar un nuevo dato
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        System.out.println(meses);
        
        //también se puede iterar con iun foreach
        
        for(String dato : meses){
            System.out.println(dato);
        }
    }
    
}
