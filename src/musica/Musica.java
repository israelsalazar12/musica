package musica;

import musica.dto.Cancion;
import musica.dto.Artista;
import musica.dto.Albumes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP pro
 */
public class Musica {

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion();
        cancion1.setId(1);
        cancion1.setNombre("el triste");

        Cancion cancion2 = new Cancion();
        cancion2.setId(2);
        cancion2.setNombre("el amar y el querer");

        Cancion cancion3 = new Cancion();
        cancion3.setId(3);
        cancion3.setNombre("siuu");
        cancion3.setCompositor("el minino");

        Cancion cancion4 = new Cancion();
        cancion4.setId(4);
        cancion4.setNombre("nooouu");
        cancion4.setCompositor("el minino");

        Cancion cancion5 = new Cancion();
        cancion5.setId(5);
        cancion5.setNombre("el chicharitou");
        cancion5.setCompositor("el minino");

        Cancion cancion6 = new Cancion();
        cancion6.setId(6);
        cancion6.setNombre("algo mal");
        cancion6.setCompositor("el minino");

        Artista artista1 = new Artista();
        artista1.setId(1);
        artista1.setNombreArtistico("jose jose");

        Artista artista2 = new Artista();
        artista2.setId(2);
        artista2.setNombreArtistico("el minino");

        Artista artista3 = new Artista();
        artista3.setId(3);
        artista3.setNombreArtistico("chicharito");

        List<Cancion> album1 = new ArrayList<>();
        album1.add(cancion3);
        album1.add(cancion4);

        List<Cancion> album2 = new ArrayList<>();
        album2.add(cancion5);
        album2.add(cancion6);

        Albumes disco1 = new Albumes();
        disco1.setId(1);
        disco1.setNombre("el minino");
        disco1.setPersonas(artista2);
        disco1.setCanciones(album1);

        Albumes disco2 = new Albumes();
        disco2.setId(2);
        disco2.setNombre("el minino triste");
        disco2.setPersonas(artista2);
        disco2.setCanciones(album2);

        System.out.println(disco1 + " " + artista2);
        System.out.println(disco2 + " " + artista2);

    }

}
