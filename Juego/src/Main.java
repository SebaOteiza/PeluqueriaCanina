
import java.util.Scanner;

//APLICACION PARA ADIVINAR EL NUMERO
public class Main {

    
    public static void main(String[] args) {
       
        OUTER://esto detiene el ciclo while
        while(true){
            System.out.println("  JUEGO ADIVINA EL NUMERO \n");
            System.out.println("1 - Nivel Facil\n"
            + "2 - Nivel Intermedio \n"
            + "3 - Nivel Dificil \n"
            + "4 - Salir");
            
            //parte para que elija una opcion
            Scanner leer = new Scanner(System.in);
            System.out.print("INGRESE UNA OPCION: ");
            int opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    jugar(10);
                    break;
                case 2:
                    jugar(7);
                    break;
                case 3:
                    jugar(5);
                    break;
                case 4:
                    System.out.println("CERRANDO PROGRAMA");
                    break OUTER;
                    default:
                        System.out.println("OPCION INCORRECTA");
                    
                            
                
            }
        }
        
   
    }
    
    //funcion
    
    static void jugar(int vidas){
        
        //asignar numero aleatorio
        int numeroRandom = (int)(Math.random()*101); //PARA QUE GENERE UN NUMERO ALEATORIO entero ENTRE 0 -100
        //variable para el numero que va a escoger el usuario
        int  numeroElegido = -1; //será distinto a lo generado por el numeroRandom
        
        //objeto de la clase scanner para ingresar los numeros
        
        Scanner leer = new Scanner(System.in);
        
        //Ciclo while para que el usuario intente adivinar un numero, porque tenemos que ejecutar varias veces hasta que adivine
        while(numeroElegido != numeroRandom){ //si el numero elegido es distinto al random, debe seguir intentando
            System.out.print("Ingrese un numero entre 1 y 100: ");
            numeroElegido = leer.nextInt(); //es donde el usuario ingresará sus intentos
            
            //comparacion para ayudar al usuario a que adivine y vaya perdiendo vidas
            
            if(numeroRandom < numeroElegido){
                System.out.println("El numero es mas pequeño");
                vidas--; //aquí la vida se descuenta 
            }else if(numeroRandom > numeroElegido){
                System.out.println("El numero es mas grande");
                vidas--;
            }
            //avisar cuantas vidas le quedan
            if(vidas == 0){
                System.out.println("---------------------");
                System.out.println("|    GAME OVER      |");
                System.out.println("---------------------");
                break;
            }
            System.out.println("-----------------------");
            System.out.printf("|  Te quedan %d vidas |\n", vidas);
            System.out.println("-----------------------");
        }
        if(numeroElegido == numeroRandom){
            System.out.println("-------------------------");
            System.out.println("|  FELICIDADES GANASTE  |");
            System.out.println("-------------------------");
        }
        
    }
}
