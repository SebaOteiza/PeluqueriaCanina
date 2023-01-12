package peliculas.ui;

////INTERFAZ DE USUARIO
import javax.swing.JOptionPane;
import peliculas.modelo.ICatalogoPeliculas;
import peliculas.modelo.ImplementacionCatalogoPelicula;
import peliculas.modelo.Pelicula;

public class UIPeliculas {

    public static void interfazUsuario() {
        ICatalogoPeliculas peliculas = new ImplementacionCatalogoPelicula();
        Pelicula pelicula;

        CERRAR:
        while (true) {

            String opcion = JOptionPane.showInputDialog(
                    null,
                    "1 - Insertar Película\n"
                    + "2 - Listar Película\n"
                    + "3 - Buscar Película\n"
                    + "4 - Salir ",
                    "Ingrese una opción: ",
                    3
            );

            int opcionInt = 0;
            try {
                opcionInt = Integer.parseInt(opcion);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Las opciones tienen que ser números enteros\n"
                        + e,
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE
                );

            }catch(Exception e){
                 JOptionPane.showMessageDialog(
                        null,
                        e,
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE
                );
            }

            switch (opcionInt) {
                case 1:
                    String nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "Ingrese una película",
                            "Entrada",
                            3
                    );

                    pelicula = new Pelicula(nombrePelicula);
                    peliculas.insertarPelicula(pelicula);
                    break;
                case 2:
                    peliculas.listarPelicula();
                    break;
                case 3:
                    nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "Ingrese el nombre de la Película",
                            "Ingrese",
                            3
                    );
                    peliculas.buscarPelicula(nombrePelicula);
                    break;
                case 4:
                    break CERRAR;
                default:

                    JOptionPane.showMessageDialog(null,
                            "OPCIÓN INCORRECTA \n"
                            + "VUELVE A INGRESAR UNA \n"
                            + "OPCIÓN CORRECTA \n"
                            + "LAS OPCIONES SON DE 1 A 4 ",
                            "ERROR",
                            JOptionPane.ERROR_MESSAGE
                    );

            }
        }

    }

}
