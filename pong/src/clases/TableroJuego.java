/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;


public class TableroJuego extends JPanel{
    
    Pelota pelota = new Pelota(0, 0);
    
    public TableroJuego(){
        setBackground(Color.BLACK);
       
    }
     public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
         dibujar(g2);
         actualizar();
         
     }
     
     public void dibujar(Graphics2D g){
         g.fill(pelota.getPelota());
     }
     
     public void actualizar(){
         pelota.mover(getBounds());
     }
     
     public void iterarJuego(){
         while(true){
             try {
                 repaint();
                 Thread.sleep(6);
             } catch (InterruptedException ex) {
                 Logger.getLogger(TableroJuego.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
}
