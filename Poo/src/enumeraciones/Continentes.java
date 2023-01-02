
package enumeraciones;

//ENUMERACIONES CON VALORES, UN ELEMENTO Y SUS VALORES
public enum Continentes {
    AFRICA(54),
    EUROPA(50),
    ASIA(48),
    AMERICA(35),
    OCEANIA(14);
    
    //para solucionar el error de arroja se debe crear un private para que no se puedan modificar los elementos
    
    private final int paises;
    
    //constructor que va a manipular los datos, los valores de cada elemento
    //el elemento llega aquí al constructor y lo vamos a pasar al constructor, cada elemento
    //por eso creamos el private final para no poder modificarlos 
    private Continentes(int paises){
        this.paises = paises;
        
    }
    
    //para obtener los valores de los continentes (paises)  crear método GET
    
    public int getPaises(){
        return this.paises;
    }
}
