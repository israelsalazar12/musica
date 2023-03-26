/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.facade;

import java.util.List;
import musica.dao.AlbumesDao;
import musica.dto.Albumes;
import musica.servicios.MusicaServicio;



/**
 *
 * @author HP pro
 */
public abstract class albumesFacade implements MusicaServicio  {
    AlbumesDao albumDao = new AlbumesDao();

 
    @Override
    public void agregarAlbumes(List<Albumes> lista, Albumes album) {
        albumDao.agregarAlbumes(album);
    }

  
    @Override
    public void actualizarAlbumes(List<Albumes> lista, Albumes album) {
        albumDao.actualizarAlbumes(album);
    }
    
    @Override
    public void eliminarAlbumes(List<Albumes> lista, Albumes album) {
        albumDao.eliminarAlbumes(album);
    }

  
    @Override
    public void buscarAlbumes(List<Albumes> lista, Albumes album) {
        albumDao.buscarAlbumes(1);
    }
}
