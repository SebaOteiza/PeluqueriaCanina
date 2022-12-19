package test;
import encapsulamiento. *; //AL IMPORTA CON * LO QUE HAGO ES LLAMAR A TODAS LAS CLASES QUE ESTÁN DENTRO DEL PAQUETE 

//VAMOS A TESTEAR LA CLASE PERSONA CREADA EN PAQUETE ENCAPSULAMIENTO

public class TestPersona {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Sebastian", 34, false);
        //YA ENVIANDO ESTOS DATOS EL CONSTRUCTOR ACABA DE CONSTRUIR A LA PERSONA 
        
        //SI QUEREMOS GUARDAR EL ESTADO DE ESTE OBJETO EN UNA VARIABLE
            String estado = persona1.toString();
            //MOSTRAR EL ESTADO
            System.out.println(estado);
       
        //antes podíamos poner persona1.nombre pero ahora no se puede porque sus datos en la clase persona están en PRIVATE
        
        //PARA PODER ACCEDER AHORA Y OBTENER EL NOMBRE 
        
        persona1.getNombre(); //así se obtiene el nombre, nos devuelve su valor 
        System.out.println(persona1.getNombre());
        
        //SI QUEREMOS MODIFICAR 
        persona1.setNombre("Sebastian Oteiza Hernandez");
       persona1.setEdad(26);
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        
        //ejecución de la sobreescritura del metodo ToString, mostrando el estado del objeto
        System.out.println(persona1);
        
        
    }

}
