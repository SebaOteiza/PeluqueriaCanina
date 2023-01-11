
package interfaces;


public class ImplementarMySQL implements BaseDatos{

    @Override
    public void insertar() {
        System.out.println("Se insertó un dato");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos");
    }

    @Override
    public void eliminar() {
        System.out.println("Se eliminó un dato");
    }

}
