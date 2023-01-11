package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepcion {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        //MANEJO DE EXCEPCION
        //dentro del try  va todo el código que pudiese tener algún conflicto
        try {
            System.out.println("Ingrese N1: ");
            int n1 = leer.nextInt();
            System.out.println("Ingrese N2 : ");
            int n2 = leer.nextInt();

            int resultado = n1 / n2;
            System.out.println(resultado);

            //EXCEPTION ES LA CLASE PADRE DE TODAS LAS EXCEPCIONES
            //ACA SE MANEJAN LAS EXCEPCIONES 
        } catch (InputMismatchException e) { //este es el error que arroja si divido un numero entero con otro que no es entero
            System.err.println("Ha ocurrido un error: Ingrese solo numeros enteros ");
            e.printStackTrace(System.out);
        }

        //en este emjemplo no arroja ningun error, pero al ejecurtar si yo divido por un número booleano, no me lo permite 
        //ya que están instanciados como enteros
        //error InputMismatchException
        //en este ejemplo (dividir un numero por 0), el programa no me arroja ningún error de compilación
        //pero si ejecuto el programa me arroja un error de ejecución porque 4 no se puede dividir por 0
        //arroja la excepción ArithmeticException que es una clase ya definida en java 
    }

}
