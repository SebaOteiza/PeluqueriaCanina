/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clases;

import javax.swing.JFrame;


public class Ventana extends JFrame{
    
    private final int ANCHO=800, ALTO=500;
    private TableroJuego lamina;
    private Hilo hilo;
      
    
    public Ventana(){
        
          setTitle("Pong");
          setSize(ANCHO, ALTO);
          setLocationRelativeTo(null);//ubicando la ventana en el centro de la pantalla 
          setResizable(false); //impedir que modifiquemos el tamaño de la ventana 
          lamina = new TableroJuego();
          add(lamina);
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //   hilo = new Hilo(lamina);
        //  hilo.start();
        lamina.iterarJuego();
        
    }
}
