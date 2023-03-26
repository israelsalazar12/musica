
package musica.dto;


public class Artista extends Persona {
    private int id;
    private String nombreArtistico; 

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "artista{" + "id=" + id + ", nombreArtistico=" + nombreArtistico + '}';
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }
    
}
