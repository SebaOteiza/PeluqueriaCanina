

package peliculas.modelo;

import java.io.Serializable;
import java.util.Objects;

//EL CONCEPTO DE JAVABEANS DICE QUE NOSOTROS TENEMOS QUE IMPLEMENTAR UNA INTERFACE 
public class Pelicula implements Serializable{
    //todos sus atributos son de tipo privado
    
    private String nombre;

    //EN JAVABEANS tenemos que tener siempre un constructor vacio
    public Pelicula() {
    }

    //constructor lleno
    public Pelicula(String nombre) {
        this.nombre = nombre;
    }
    
    //debemos tener métodos de getter y setter 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
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
        final Pelicula other = (Pelicula) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
    
    

}
