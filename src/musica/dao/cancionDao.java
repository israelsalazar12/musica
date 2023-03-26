/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.dao;

import java.util.ArrayList;
import java.util.List;
import musica.dto.Cancion;

/**
 *
 * @author HP pro
 */
public class CancionDao {
     public  List<Cancion> canciones = new ArrayList<>();

     
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);

    }

    public void eliminarCancion(Cancion cancion) {
        canciones.remove(cancion);
    }

    public Cancion buscarCancion(int id) {
        for (int i = 0; i < canciones.size(); i++) {
            Cancion a= canciones.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarCancion(Cancion cancion) {
        for (int i = 0; i < canciones.size(); i++) {
          if(canciones.get(i).getId()== cancion.getId()){
              canciones.get(i).setNombre(cancion.getNombre());
          }
            }
        }
     
    
    public void imprimirCancion (ArrayList<Cancion> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
         
       

    }
}
