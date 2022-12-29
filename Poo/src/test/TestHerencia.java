package test;

import herencia.*;
import java.util.Date;
public class TestHerencia {
    public static void main(String[] args) {
        
        //crear objeto de clase persona
        Persona persona = new Persona("Perico los palotes", 'M', 55, "Cuscotopia");
        System.out.println(persona.obtenerDetalle());
        imprimer(persona);
        
        
        //creacion de empleado
        
        Empleado empleado = new Empleado(8500, "Porcco Rosso");
        System.out.println(empleado.obtenerDetalle());
        imprimer(empleado);
        
        Empleado empleado1 = new Empleado(3500, "Sebastian");
        System.out.println(empleado1);
        //esto nos va a devolver los datos de empleado (sueldo y nombre) y aparte nos mostrará los datos de clase persona
        
         Empleado empleado2 = new Empleado(3800, "Maria");
        System.out.println(empleado2);
        
         Empleado empleado3 = new Empleado(3700, "Roberto");
        System.out.println(empleado3);
        
        //EL ID del empleado se irá incrementando automaticamente 
        
        //CREACION CLIENTE
       
        var fecha = new Date();//con esto obtengo la fecha actual del día 
         Clientes cliente = new Clientes(fecha, true, "Olivia", 'F', 36, "Colon");
         System.out.println(cliente.obtenerDetalle());
         imprimer(cliente);
        
        Clientes cliente1 = new Clientes(fecha, true, "Kendra Fabrega", 'f', 28, "Almirante Barroso");
        System.out.println(cliente1);
        
        
        //LLAMADO DE LA FUNCION INSTANCEOF
        determinarTipo(empleado);//objeto empleado
        determinarTipo(cliente);
        determinarTipo(persona);
        
        
        //CONVERSIÓN DE OBJETOS, esta conversión se llama DOWNCASTING
        //DOWNCASTING  = conversión de clase padre a clase hija
        Persona persona1 = new Empleado(65000, "Rodrigo");
        //un objeto de tipo Persona que tendrá los datos de clase Empleado
        
        //PARA PODER ACCEDER A ESOS METODOS, DEBO CONVERTIR ESE OBJETO DE TIPO PERSONA A OBJETO EMPLEADO
        Empleado empleado4 = (Empleado) persona1;
        
        //OBTENER DETALLES DEL NUEVO OBJETO
        System.out.println(empleado4.obtenerDetalle());
        
        //CONVERSIÓN DE CLASE HIJA A CLASE PADRE 
        //SE LLAMA UPCASTING 
        
        Persona persona5 = empleado4;
        //PARA HACER LA CONVERSION DE OBJETO HIJO A OBJETO PADRE, SIMPLEMENTE LE ASIGNAMOS 
        System.out.println(persona5.obtenerDetalle());
        
        
        //EQUALS = DEVUELVE UN VALOR BOOLEANO, TRUE O FALSE 
       
        
        //VAMOS A CREAR OBJETOS DEL MISMO TIPO Y COMPARAR SI SON IGUALES
        Persona p1 = new Persona("El Mariana", 'm', 78, "Culiacan");
        Persona p2 = new Persona("El Mariano", 'm', 78, "Culiacan");
        
        //comparar si los valores son iguales
        System.out.println(p1.equals(p2));
        
        
        //HASHCODE = DEVUELVE UN VALOR ENTERO
        
        if(p1.hashCode() == p2.hashCode()){
            System.out.println("Los objetos son iguales");
        }else{
            System.out.println("Los objetos no son iguales");
        }
        //System.out.println(p1.hashCode());
        //System.out.println(p2.hashCode());
        
    }
    
    //funcion para obtener objeto de tipo persona
    
    public static void imprimer(Persona persona){//podríamos recibir cualquier objeto
        System.out.println(persona.obtenerDetalle());//ese objeto que recibimos accede al metodo  obtenerDetalle
    }
    
        
    //INSTANCEOF
    //LA BUSQUEDA SE REALIZA DE MAS GENERICA A MENOS GENERICA
    //LAS MENOS GENERICAS SON LAS SUBCLASES
    //LAS MÁS GENERICAS SON LAS SUPERCLASES
    
    public static void determinarTipo(Object objeto){//OBJECT ES LA CLASE PADRE DE TODAS LAS CLASES EN JAVA
        if(objeto instanceof Empleado){//HAY QUE REALIZAR LA COMPARACION DE LA MÁS GENERICA A LA MENOS GENERICA
            System.out.println("Es de tipo Empleado");
        }else if(objeto instanceof Clientes){
            System.out.println("Es de tipo Clientes");
        }else if(objeto instanceof Persona){
            System.out.println("Es de tipo Persona");
        }else if( objeto instanceof Object){//CLASE MÁS GENERICA DE TODAS
            System.out.println("Es de tipo Object");
        }
        
        
    }
    
}
