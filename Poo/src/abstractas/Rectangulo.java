
//HEREDA DE LA CLASE ABSTRACTA 
package abstractas;


public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    
    //definir metodo dibujar
    @Override
    public void dibujar(){
        System.out.println("Se dibuja un: "+getClass().getSimpleName()); //aquí debería obtener le nombre de la clase (rectangulo)
    }

}
