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
        
        
        
    }
    
    //funcion para obtener objeto de tipo persona
    
    public static void imprimer(Persona persona){//podríamos recibir cualquier objeto
        System.out.println(persona.obtenerDetalle());//ese objeto que recibimos accede al metodo  obtenerDetalle
    }
    

}
