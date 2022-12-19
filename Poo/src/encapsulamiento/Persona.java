package encapsulamiento;


public class Persona {
    
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private boolean eliminado;

    //CONSTRUCTOR 
    public Persona(String nombre, int edad, boolean eliminado) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminado = eliminado;
        //Vamos a utilizar el THIS para referirnos al atributo de la clase, a la variable y a eso le vamos a asignar los datos por recibir
        //mediante el parametro del constructor, vamos a recibir parametros nombre, edad, y la opcion si está o no eliminado
   
        }
        
       //ENCAPSULAMIENTO
        
        public String getNombre(){//vamos a devolver un dato de tipo string 
            return this.nombre; //retornamos el valor del atributo de la clase 
    }
        //acá no queremos devolver un dato, queremos que se ejecute 
        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public int getEdad(){
            return this.edad;
           
        }
        
        public void setEdad(int edad){
            this.edad = edad;
        }
        
        public boolean isEliminado(){
            return this.eliminado;
        }
        public void setEliminado(boolean eliminado){
            this.eliminado = eliminado;
        }
        
        //SOBREESCRIBIR EL MÉTODO, TOSTRING 
        
        //TO + ctrl+espacio y se implementa el ToString
        
    @Override //ESTA ANOTACION NOS PERMITE MODIFICAR UN METODO YA IMPLEMENTADO EN JAVA (en este caso ToString)
    //va a aliminar el valor que tenía y podrá el valor que nosotros estamos colocando
    public String toString() {
        return "Persona: [Nombre: %s, Edad: %d, Eliminado: %b]" //%s String, %d Numeros enteros, %B Booleanos
                .formatted(this.nombre, this.edad, this.eliminado); 
        //BORRAMOS LO QUE MUESTRA POR DEFECTO Y MOSTRAMOS EL ESTADO DE NUESTRO OBJETO, CUALES SON LOS DATOS 
    }
        
        
}
