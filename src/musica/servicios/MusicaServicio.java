/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musica.servicios;

import java.util.List;
import musica.dto.Albumes;
import musica.dto.Artista;
import musica.dto.Cancion;
import musica.dto.Grupo;

/**
 *
 * @author HP pro
 */
public interface MusicaServicio {
    void agregarArtista ( List<Artista> lista, Artista artista);
    void actualizarArtista ( List<Artista> lista, Artista artista);
    void buscarArtista ( List<Artista> lista, Artista artista);
    void eliminarArtista (List<Artista> lista, Artista artista);
    
    void agregarGrupo ( List<Grupo> lista, Grupo grupo);
    void actualizarGrupo ( List<Grupo> lista, Grupo grupo);
    void buscarGrupo (  List<Grupo> lista, Grupo grupo);
    void eliminarGrupo ( List<Grupo> lista, Grupo grupo);
    
    void agregarCancion ( List<Cancion> lista, Cancion cancion);
    void actualizarCancion ( List<Cancion> lista, Cancion cancion);
    void buscarCancion (  List<Cancion> lista, Cancion cancion);
    void eliminarCancion ( List<Cancion> lista, Cancion cancion);
    
    void agregarAlbumes ( List<Albumes> lista, Albumes album);
    void actualizarAlbumes ( List<Albumes> lista, Albumes album);
    void buscarAlbumes ( List<Albumes> lista, Albumes album);
    void eliminarAlbumes (List<Albumes> lista, Albumes album);
}
