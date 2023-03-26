/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.facade;

import java.util.List;
import musica.dao.CancionDao;
import musica.dto.Cancion;
import musica.servicios.MusicaServicio;

/**
 *
 * @author HP pro
 */
public abstract class cancionFacade implements MusicaServicio {
    CancionDao cancionDao = new CancionDao();

 
    @Override
    public void agregarCancion(List<Cancion> lista, Cancion cancion) {
        cancionDao.agregarCancion(cancion);
    }

  
    @Override
    public void actualizarCancion(List<Cancion> lista, Cancion cancion) {
        cancionDao.actualizarCancion(cancion);
    }
    
    @Override
    public void eliminarCancion(List<Cancion> lista, Cancion cancion) {
        cancionDao.eliminarCancion(cancion);
    }

  
    @Override
    public void buscarCancion(List<Cancion> lista, Cancion cancion) {
        cancionDao.buscarCancion(1);
    }
}
