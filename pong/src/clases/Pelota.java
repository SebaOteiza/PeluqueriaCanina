/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;


public class Pelota {
    
    private int x;
    private int y;
    private  int dx=1, dy=1;
    
    private final int ANCHO=15, ALTO=15;
    public Pelota(int x, int y){
        this.x=x;
        this.y=y;
        
        
        
    }
    
    public Rectangle2D getPelota(){
        return new Rectangle2D.Double(x,y,ANCHO,ALTO);
    }
    
    public void mover(Rectangle limites){
        x+=dx;
        y+=dy;
        
        if(x>limites.getMaxX()){
            dx=-dx;
        }
         if(x>limites.getMaxY()){
            dy=-dy;
        }
         if(x<0){
            dx=-dx;
        }
         if(y<0){
             dy=-dy;
         }
    }
}
