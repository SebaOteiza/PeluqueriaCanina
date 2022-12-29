package herencia;

//CLASE PADRE

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + this.genero;
        hash = 47 * hash + this.edad;
        hash = 47 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.genero != other.genero) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }
    
    

  
    
    
}
