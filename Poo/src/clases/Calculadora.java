
package clases;


public class Calculadora {
    
    //atributos
    public static double PI = 3.141592;
    
    
    //metodo
    
    public static int sumar(int a, int b){
        return a + b;
        
    }
    public static double sumar(double a, double b){
        return a + b;
    }
    
    //SOBRECARGA DE MÉTODOS
    //el public es modificador de acceso, que se debe ocupar al trabajar con diferentes paquetes
    
    //EN LA CLASE MAIN DEBEMOS CREAR UN OBJETO RESTAR 
    public int restar(int a, int b){
        return a - b;
        
    }
    public double restar(double a, double b){
        return a - b;
        
    }
}
