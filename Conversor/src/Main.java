
import java.util.Scanner;


//APLICACION DE CONVERSOR DE MONEDAD 
public class Main {

    
    public static void main(String[] args) {
        
        //SISTEMA PARA DECIDIR SI SALIMOS DE LA APLICACION O NO
        
        //vamos a generar un ciclo infinito, nosotros decidimos cuando se detiene
        
        //diseñar un menu
        while(true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Soles Peruanos a dolares\n"
            + "2 - Pesos Mexicanos a dolares \n"
            + "3 - Pesos Colombianos a dolares \n"
            + "4- Pesos Chilenos a dolares \n"
            + "5 - Salir");
            System.out.println("INGRESE UNA OPCION:  ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            //condiciones
            
            EXTERNA: //CON ESTA ANOTACION SE DETIENE EL PROGRAMA SI ESCOJO LA OPCION 5 QUE ES SALIR
            switch (opcion) {
                case '1':
                    convertir(3.52, "Soles Peruanos");
                    break;
                case '2':
                    convertir(22.15, "Pesos Mexicanos");
                    break;
                case '3':
                    convertir(3851.90, "Pesos Colombianos");
                    break;
                case '4':
                    convertir(878.65, "Pesos Chilenos");
                    break;
                case '5':
                    System.out.println("CERRANDO PROGRAMA");
                    break EXTERNA; //ESTO ROMPE EL CICLO WHILE
                    default://ESTO SERÁ EL QUIEBRE DE LA APLICACION, SE CIERRA SI NINGUNA OPCION ES CORRECTA
                        System.out.println("OPCION INCORRECTA");
                        break;
                    
                
            }
            
        }
       
    }
    
    //FUNCION PARA GENERAR LA CONVERSION
    
    //va a recibir dos datos, uno double porque trabajaremos con monedas 
    static void convertir(double valorDolar, String pais){
        
        //conversion, pedir al usuario que ingrese la cantidad de monedad
        
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :",pais);
        double cantidadMoneda = leer.nextDouble();
        
        //convertir a dolares
        
        double dolares = cantidadMoneda / valorDolar;
        
        //REDONDEAR EL RESULTADO A SOLO 2 DECIMALES
        dolares = (double)Math.round(dolares * 100d) /100; 
        
        System.out.println("-----------------------------");
        System.out.println("| Tienes $"+dolares+" Dolares   |");
        System.out.println("-----------------------------");
        
               
        
        
        
    }
}
