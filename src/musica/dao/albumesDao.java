/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.dao;

import java.util.ArrayList;
import java.util.List;
import musica.dto.Albumes;

/**
 *
 * @author HP pro
 */
public class AlbumesDao {
     public List<Albumes> albums = new ArrayList<>();

    public void agregarAlbumes(Albumes album) {
        albums.add(album);

    }

    public void eliminarAlbumes(Albumes album) {
        albums.remove(album);
    }

    public Albumes buscarAlbumes(int id) {
        for (int i = 0; i < albums.size(); i++) {
            Albumes a = albums.get(i);
            if (a.getId() == id) {
//                 System.out.println(a.getId());
                return a;
            }
        }
        return null;

    }

    public void actualizarAlbumes(Albumes album) {
        for (int i = 0; i < albums.size(); i++) {
            if (albums.get(i).getId() == album.getId()) {
                albums.get(i).setNombre(album.getNombre());
            }
        }
    }
}
