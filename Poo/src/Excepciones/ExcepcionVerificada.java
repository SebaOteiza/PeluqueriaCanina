
package Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExcepcionVerificada {
    public static void main(String[] args) throws FileNotFoundException {
        readFile1();
        
    }
    
    //funcion
    
    public static void readFile1()//leer un archivo
            //lanzar una excepcion en el método
            throws FileNotFoundException{ //probablemente exista excepciones 
        File file = new File("C://file.txt");
        //estamos trabajando con la clase FIle y queremos leer el archivo file 
        //este archivo en verdad no existe, por eso no envía una excepción
        FileReader fr = new FileReader(file);//aquí tratamos de leer ese archivo
        
        
    }

}
