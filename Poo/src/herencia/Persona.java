package herencia;

//CLASE PADRE
public class Persona {
    
    //nuevo modificador de acceso (PROTECTED) 
    
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //CONSTRUCTOR VACIO

    public Persona() {
    }
    
    //SOBRECARGA DE CONSTRUCTOR (solo recibiremos nombre)

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //CONSTRUCTOR LLENO

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public String obtenerDetalle(){
        return "Nombre: %s Edad: %d ".formatted(this.nombre, this.edad);
    }
    
    //GETTERS AND SETTERS 

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //TOSTRING PARA MOSTRAR EL ESTADO DEL OBJETO

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); //creamos objeto de la clase String Builder  (sb)
        sb.append("Persona{");
        sb.append("nombre=").append(this.nombre);
        sb.append(", genero=").append(this.genero);
        sb.append(", edad=").append(this.edad);
        sb.append(", direccion=").append(this.direccion);
        sb.append('}');
        return sb.toString();
    }

  
    
    
}
