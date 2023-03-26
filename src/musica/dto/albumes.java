/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musica.dto;

import java.util.Date;
import java.util.List;

public class Albumes {
    private int id;
    private String nombre;
    private List<Cancion>canciones;
    private Persona personas;

    public Persona getPersonas() {
        return personas;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "albumes{" + "id=" + id + ", nombre=" + nombre + ", canciones=" + canciones + ", fechaLanzamiento=" + fechaLanzamiento + '}';
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    private Date fechaLanzamiento;
}
