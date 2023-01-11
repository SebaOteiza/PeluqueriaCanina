
package test;


public class TestEnvolventes {
    public static void main(String[] args) {
        
        Integer n = 10; //n lo está almacenando como un objeto / convertir un valor literal a un objeto 
        System.out.println("Entero -> "+ n + " -> " + (n +n)); 
        
        String ns = n.toString();
        System.out.println("Entero a String  -> "+ns+" -> "+(ns + ns));
        
        System.out.println("Entero a double -> "+ n.doubleValue());
        
        int n2 = n; // ese objeto que era n lo estamos convirtiendo a un tipo de dato primitivo
        
        n2 =  Integer.parseInt(ns); // convierte string a entero 
        System.out.println(n2 + n2);
        
        double nd = Double.parseDouble(ns);
        System.out.println(nd);
    }

}
