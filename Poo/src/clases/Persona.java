package clases;

public class Persona {

    //atributos
    public String nombre;
    public int edad;
    
    //CONSTRUCTOR (se parece al metodo) tiene el mismo nombre que la clase 
    public Persona(){
        System.out.println("Construyendo el objeto");
        
    }
    
    //SOBRECARGA DE CONSTRUCTOR
    
    public Persona(String nombre){
        System.out.println("Hola "+ nombre + " Desde el constructor");
    }

    //metodo de la clase (en este caso para mostrar los datos de la persona)
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

    }
}
