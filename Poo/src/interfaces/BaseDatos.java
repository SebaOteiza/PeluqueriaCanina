
package interfaces;

//al igual que la clase abstracta, no se pueden crear objetos directamente en la clase interface
//en interface no se puede crear constructores, porque el interface lo que hace es heredar el comportamiento 
//a diferencia de las abstractas que apuntas más a las caracteristicas 
public interface BaseDatos {
    
    //en interfaces es muy recomendable utilizar PURAS MAYUSCULAS  
    //en las variables de interfaces sí o sí se le debe asignar un valor  
    
    int MAXIMO_DATOS = 10;
    
    //comportamientos en comun al trabajar con las bases de datos INSERTAR, ACTUALIZAR, LISTAR, ELIMINAR
    
    void insertar(); 
    void listar();
    void actualizar();
    void eliminar();
    
    //al momento de implementar esta interfaces vamos a implementar 
}
