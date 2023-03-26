/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.facade;

import java.util.List;
import musica.dao.GrupoDao;
import musica.dto.Grupo;
import musica.servicios.MusicaServicio;

/**
 *
 * @author HP pro
 */
public abstract class grupoFacade implements MusicaServicio {
    GrupoDao grupoDao = new GrupoDao();

 
    @Override
    public void agregarGrupo(List<Grupo> lista, Grupo grupo) {
        grupoDao.agregarGrupo(grupo);
    }

  
    @Override
    public void actualizarGrupo(List<Grupo> lista, Grupo grupo) {
        grupoDao.actualizarGrupo(grupo);
    }
    
    @Override
    public void eliminarGrupo(List<Grupo> lista, Grupo grupo) {
        grupoDao.eliminarGrupo(grupo);
    }

  
    @Override
    public void buscarGrupo(List<Grupo> lista, Grupo grupo) {
        grupoDao.buscarGrupo(1);
    }
}
