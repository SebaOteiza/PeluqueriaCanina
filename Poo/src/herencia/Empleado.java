package herencia;


public class Empleado extends Persona{ //extends es la forma de herederar de la clase padre 
    //ATRIBUTOS INDEPENDIENTES DE LA CLASE QUE NO SON SIMILARES A SU CLASE PADRE (PERSONA)
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado( double sueldo, String nombre) { //el String nombre es el atributo de la super clase (persona)
        super(nombre);//el super envía este dato a la superclase  
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    
    //GETTERS AND SETTERS 
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

     @Override
    public String obtenerDetalle(){ //HEREDADO DE CLASE PERSONA
        return super.obtenerDetalle() + "Sueldo: "+ this.sueldo;
    }
    
    
   
   //ToString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(";").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    

}
