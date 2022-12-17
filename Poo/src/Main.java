import static java.lang.Math.*;
import clases.Calculadora;
import clases.Persona; //importamos desde el paquete clases la clase persona
import clases.Rectangulos;

public class Main {

    
    public static void main(String[] args) {
        
        //OBJETIS DE CLASE PERSONA
      Persona persona1 = new Persona();
      persona1.nombre = "Sebastian";
      persona1.edad = 34;
      persona1.mostrarDatos();
    
      Persona persona2 = new Persona();
      persona2.nombre = "Kendrita";
      persona2.edad = 28;
      persona2.mostrarDatos();
      
        System.out.println(Calculadora.PI);
        System.out.println(Calculadora.sumar(40, 50));
      
        
        //Clases y metodos static de clase MATH
        
        System.out.println(PI);
        System.out.println(pow(4, 3));
         
        //NUEVO OBJETO CLASE PERSONA
        
        Persona persona3 = new Persona();
        //NO TENEMOS NADA PARA MOSTRAR PERO AL EJECUTAR NOS MOSTRARÁ EL MENSAJE QUE ESTÁ EN EL CONSTRUCTOR DE LA CLASE PERSONA
        
        //sobrecarga de constructor, crendo un nuevo objeto de la clase persona
        
        Persona persona4 = new Persona("Sebastian");
        //si lo hago  de esta forma solo se ejecuta el segundo constructor porque entiende los atributos que recibe
        
        //nuevo objeto clase persona
        
        Persona persona5 = new Persona();
        persona5.nombre = "Jaimito el cartero";
        persona5.edad = 555; 
        persona5.mostrarDatos();
        
        //CLASE CALCULADORA
        
        Calculadora calcular = new Calculadora();
        System.out.println(calcular.restar(50, 30));
        System.out.println(calcular.restar(50.5, 3.3));
        
        //CLASE RECTANGULOS
        
        Rectangulos r1 = new Rectangulos(); //si lo ejecuto me devolverá los valores por defecto de cada atributo creado, que en este caso es 0 para c/u
        
        System.out.println(r1.area(8, 4));
        
        
        
    }
    
}
