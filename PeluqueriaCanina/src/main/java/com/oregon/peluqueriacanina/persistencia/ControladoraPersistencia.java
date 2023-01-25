package com.oregon.peluqueriacanina.persistencia;

import com.oregon.peluqueriacanina.logica.Duenio;
import com.oregon.peluqueriacanina.logica.Mascota;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
       
        //crear en la BD el dueño
        duenioJpa.create(duenio);
        
        //crear en la DB mascota
        mascoJpa.create(masco);
    }
    
    
    

}
