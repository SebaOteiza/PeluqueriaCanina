
package test;
import enumeraciones.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println(Dias.LUNES); //puedo ingresar a los valores así
        System.out.println(Dias.VIERNES);
        
        //MOSTRAR LOS VALORES DE LA CLASE CONTINENTES QUE SERÍAN ENUMERACIOENES CON VALORES 
        
        System.out.println(Continentes.AMERICA);//de esta forma me imprime igual que los ejemplos de arriba
        
        //si queremos acceder a cuántos paises tiene el continente
        System.out.println(Continentes.AMERICA.getPaises()); //imprimimos el método get creado en la clase continentes
    }

}
