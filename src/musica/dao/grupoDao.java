/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.dao;

import java.util.ArrayList;
import java.util.List;
import musica.dto.Grupo;

/**
 *
 * @author HP pro
 */
public class GrupoDao {
     List <Grupo> grupos= new ArrayList<Grupo>();

    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);

    }

    public void eliminarGrupo( Grupo grupo) {
        grupos.remove(grupo);
    }

    public Grupo buscarGrupo(int id) {
        for (int i = 0; i < grupos.size(); i++) {
            Grupo a= grupos.get(i);
            if(a.getId()== id ){
//                 System.out.println(a.getId());
                 return a;
            }
        }
         return null;
     
    }
    
    
        public void  actualizarGrupo(Grupo grupo) {
        for (int i = 0; i < grupos.size(); i++) {
          if(grupos.get(i).getId()== grupo.getId()){
              grupos.get(i).setNombre(grupo.getNombre());
          }
            }
        }
     
    
    public void imprimirGrupo (ArrayList<Grupo> lista){
       for (int i = 0; i < lista.size(); i++) {
           System.out.println(lista.get(i).toString());
       
        } 
}

}
