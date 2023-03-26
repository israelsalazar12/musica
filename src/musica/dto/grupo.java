
package musica.dto;

import java.util.List;


public class Grupo {
    private int id;
    private String nombre; 
    private List<Artista>artistas;

    @Override
    public String toString() {
        return "grupo{" + "id=" + id + ", nombre=" + nombre + ", artistas=" + artistas + '}';
    }

    public int getId() {
        return id;
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

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }
}
