package com.oregon.peluqueriacanina.persistencia;

import com.oregon.peluqueriacanina.logica.Duenio;
import com.oregon.peluqueriacanina.logica.Mascota;
import com.oregon.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {

        //crear en la BD el dueño
        duenioJpa.create(duenio);

        //crear en la DB mascota
        mascoJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        return mascoJpa.findMascotaEntities();//busca todos los registro de tabla mascota y asigna todo lo que debemos asignar

    }

    public void borarMascota(int num_cliente) {
        mascoJpa.destroy(num_cliente);

    }

}
