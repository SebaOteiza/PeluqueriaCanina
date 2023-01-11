package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepcion {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        boolean continuarEjecucion = true;

        do {
            //MANEJO DE EXCEPCION
            //dentro del try  va todo el código que pudiese tener algún conflicto
            try {
                System.out.println("Ingrese N1: ");
                int n1 = leer.nextInt();
                System.out.println("Ingrese N2 : ");
                int n2 = leer.nextInt();

                int resultado = n1 / n2;
                System.out.println("Resultado -> " + resultado);
                
                continuarEjecucion = false;
                
                

                //EXCEPTION ES LA CLASE PADRE DE TODAS LAS EXCEPCIONES
                //ACA SE MANEJAN LAS EXCEPCIONES 
            } catch (InputMismatchException e) { //este es el error que arroja si divido un numero entero con otro que no es entero
                System.err.println("Ha ocurrido un error: Ingrese solo numeros enteros ");
                e.printStackTrace(System.out);
                leer.nextLine();

                //MULTIPLES EXCEPCIONES
                //si vemod que nuestra app es propensa a caer en varios error, podemos aumentar el número de CATCH para agrupar más excepciones
            } catch (ArithmeticException e) {
                System.err.println("Error: No se puede divivir entre 0");
            } catch (Exception e) { //CON ESTE EXCEPCION SOLITO, podemos considerar cualquier tipo de error posible si no sabemos lo que pueda ocurrir
                e.printStackTrace(System.out); //System.out es lo que se muestra por consola 
            } finally { //esta instruccion es de final, esto se ejecuta siempre que termina la excepcion
                System.out.println("Se reviso la division");
            }

            //en este emjemplo no arroja ningun error, pero al ejecurtar si yo divido por un número booleano, no me lo permite 
            //ya que están instanciados como enteros
            //error InputMismatchException
            //en este ejemplo (dividir un numero por 0), el programa no me arroja ningún error de compilación
            //pero si ejecuto el programa me arroja un error de ejecución porque 4 no se puede dividir por 0
            //arroja la excepción ArithmeticException que es una clase ya definida en java 
        } while (continuarEjecucion);

    }

}
