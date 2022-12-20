package test;

import herencia.*;
import java.util.Date;
public class TestHerencia {
    public static void main(String[] args) {
        
        //creacion de empleado
        
        Empleado empleado1 = new Empleado(3500, "Sebastian");
        System.out.println(empleado1);
        //esto nos va a devolver los datos de empleado (sueldo y nombre) y aparte nos mostrará los datos de clase persona
        
         Empleado empleado2 = new Empleado(3800, "Sebastian");
        System.out.println(empleado2);
        
         Empleado empleado3 = new Empleado(3700, "Sebastian");
        System.out.println(empleado3);
        
        //EL ID del empleado se irá incrementando automaticamente 
        
        //CREACION CLIENTE
        var fecha = new Date();//con esto obtengo la fecha actual del día 
        
        Clientes cliente1 = new Clientes(fecha, true, "Kendra Fabrega", 'f', 28, "Almirante Barroso");
        System.out.println(cliente1);
        
        
        
    }
    
    

}
