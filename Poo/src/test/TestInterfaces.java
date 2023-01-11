

package test;
import interfaces.*;


public class TestInterfaces {
    public static void main(String[] args) {
        
        BaseDatos datos = new ImplementarMySQL();
        datos.insertar();
        datos.actualizar();
        datos.listar();
        datos.eliminar();
        
        
    }

}
