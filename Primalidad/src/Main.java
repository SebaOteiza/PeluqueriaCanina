
import java.util.Scanner;

//APLICACION PARA DETECTAR SI EL NUMERO INGRESADO ES PRIMO 
public class Main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = leer.nextInt();
        
        if(esPrimo(numero)){
            System.out.println("=================");
            System.out.println("Es numero primo");
            System.out.println("=================");
        }else{
            System.out.println("=================");
            System.out.println("No es numero primo");
            System.out.println("=================");
        }
    }
    
    /**
     * <h2>Función esPrimo</h2>
     * Descripción: Detecta si un número es primo o no
     * @param numero Resive un número entero
     * @return Retorna un valor booleano indicando si el número recibido es primo o no
     */
    static boolean esPrimo(int numero){
        int contador = 0; //CONTADOR, CON CUANTOS NUMEROS SE PUEDE DIVIDIR EL NUMERO INGRESADO, VALOR INICIAL CERO
        
        int [] numeros = new int [numero];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i+1;
            
        }
        for(int i : numeros){
            if(i == 1 || i == numero){
                continue;
            }
            if(numero % i == 0){
                contador++;
            }
        }
        return contador == 0;
    }
}
