/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.facade;

import java.util.List;
import musica.dao.ArtistaDao;
import musica.dto.Artista;
import musica.servicios.MusicaServicio;

/**
 *
 * @author HP pro
 */
public abstract class artistaFacade implements MusicaServicio {
    ArtistaDao artistaDao = new ArtistaDao();

 
    @Override
    public void agregarArtista(List<Artista> lista, Artista artista) {
        artistaDao.agregarArtista(artista);
    }

  
    @Override
    public void actualizarArtista(List<Artista> lista, Artista artista) {
        artistaDao.actualizarArtista(artista);
    }
    
    @Override
    public void eliminarArtista(List<Artista> lista, Artista artista) {
        artistaDao.eliminarArtista(artista);
    }

  
    @Override
    public void buscarArtista(List<Artista> lista, Artista artista) {
        artistaDao.buscarArtista(1);
    }
}
