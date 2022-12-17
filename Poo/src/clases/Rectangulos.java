
package clases;


public class Rectangulos {
    
    //VARIABLES DE LA CLASE QUE PODEMOS UTILIZAR EN SUS METODOS Y CONSTRUCTORES DE LA CLASE 
    public int base;
    public int altura;
    
    //constructor
    
    public Rectangulos(){
        System.out.println(base);
        System.out.println(altura);
    }
    
    //area de un rectangulo
    
    //ESTAS SON VARIABLES LOCALES , SE PUEDEN UTILIZAR SOLO DENTRO DE ESTE MÉTODO
    public int area(int base, int altura){ //base * altura
        this.base = base;
        this.altura = altura;
        //EL THIS SE REFIERE A LOS ATRIBUTOS DE LA CLASE
        return this.base * this.altura;
    }
    
    //PERIMETRO
    
    public int perimetro(int base, int altura){
        this.base = base;
        this.altura = altura;
        return 2 *(this.base + this.altura);
     
        //TODOS LOS DATOS QUE ESTAMOS RECIBIENDO DEBEMOS ASIGNARLOS A LOS ATRIBUTOS DE RECTANGULO
    }
   
}
