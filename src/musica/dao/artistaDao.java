/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.dao;

import java.util.ArrayList;
import java.util.List;
import musica.dto.Artista;

/**
 *
 * @author HP pro
 */
public class ArtistaDao {
    public  List<Artista> artistas = new ArrayList<>();

     
    public void agregarArtista(Artista artista) {
        artistas.add(artista);

    }

    public void eliminarArtista( Artista artista) {
        artistas.remove(artista);
    }

    public Artista buscarArtista(int id) {
        for (int i = 0; i < artistas.size(); i++) {
            Artista a= artistas.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarArtista(Artista artista) {
        for (int i = 0; i < artistas.size(); i++) {
          if(artistas.get(i).getId()== artista.getId()){
              artistas.get(i).setNombre(artista.getNombre());
               artistas.get(i).setNombreArtistico(artista.getNombreArtistico());
          }
            }
        }
     
    
    public void imprimirArtista (ArrayList<Artista> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
}
}

