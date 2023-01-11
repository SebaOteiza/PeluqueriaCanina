

package test;

import abstractas.*;
public class TestAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo1");
        //creando una variable figura de tipo geometrica y un objeto de tipo rectangulo lo convertimos a figura geometrica
        //la conversió de la clase hija a la clase padre es mas sencillo 
        System.out.println(figura);
        
        
        //cuando nosotros llamamos a un método que está definido en dos clases, lo que va a tomar más importancia  al momento de lalamr
        //de esta forma (abajo) es a la clase menos generica 
        figura.dibujar();
        
        figura = new Cuadrado("cuadrado1");
        figura.dibujar();
        
    }

}
