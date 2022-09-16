package com.elvispresley.demo;

import com.elvispresley.demo.entities.Artista;
import com.elvispresley.demo.entities.Cancion;
import com.elvispresley.demo.entities.Cliente;
import com.elvispresley.demo.entities.Genero;
import com.elvispresley.demo.entities.Playlist;
import com.elvispresley.demo.services.ArtistaService;
import com.elvispresley.demo.services.CancionService;
import com.elvispresley.demo.services.GeneroService;
import com.elvispresley.demo.services.PlaylistService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RockolaApplicationTests {
        @Autowired
        private CancionService cancionServicio;
        
        @Autowired
        private GeneroService generoServicio;
        
        @Autowired 
        private ArtistaService artistaServicio;
    
        @Autowired 
        private PlaylistService playlistServicio;
        
        @Test
        @Disabled
	void probarAddGenero() {
            Genero genero = new Genero("Boleros");
            Genero generoGuardado = generoServicio.addGenero(genero);
            Assertions.assertTrue(generoGuardado.getId() > 0, 
                    "*** Error *** /nGénero no guardada");
        }
        
        @Test
        @Disabled       
	void probarAddCancion() {
            Cancion cancion = new Cancion("Por debajo de la mesa", "3:26", "https://www.youtube.com");
            Cancion cancionGuardada = cancionServicio.addCancion(cancion);
            Assertions.assertTrue(cancionGuardada.getId() > 0, 
                    "*** Error *** /nCanción no guardada");
        }
        
        @Test
        @Disabled
	void probarEliminarCancion() {
            //Eliminar canción con el id 4
            Cancion cancion = cancionServicio.getCancionByNombre("Por debajo").get(0);
            cancionServicio.deleteCancion(cancion);
            List<Cancion> canciones = cancionServicio.getAllCanciones();
            Assertions.assertTrue(!canciones.contains(cancion), 
                    "*** Error *** /nCanción no eliminada");
        }
        
        @Test
        @Disabled
	void probarAddCancion2() {
            Genero genero = generoServicio.getAllGeneros().get(0);
            Cancion cancion = new Cancion("Bésame mucho", "3:26", "https://www.youtube.com");
            cancion.setGenero(genero);
            Cancion cancionGuardada = cancionServicio.addCancion(cancion);
            Assertions.assertTrue(cancionGuardada.getId() > 0, 
                    "*** Error *** /nCanción no guardada");
        }
        
        @Test
        @Disabled
        void probarCrearPlaylist(){
            Playlist pl = new Playlist();
            pl.setNombre("Boleritos");
            pl.setCliente(new Cliente("Juan", "Hernández", "abcd@gmail.com",
                    LocalDate.now(), "4436785678","male","mexican",true));
            pl.setCancion(new ArrayList<Cancion>());
            
            Playlist plGuardada = playlistServicio.crearNuevaPlaylist(pl);
            
            Assertions.assertTrue(plGuardada.getId() > 0, 
                    "*** Error *** /nPlaylist no guardada");  
        }
        
        @Test
        @Disabled
        void probarConsultarPlaylistExistente(){
            List<Playlist> listaPlaylists = playlistServicio.consultarPlaylist("boleritos");
            Assertions.assertTrue(!listaPlaylists.isEmpty(),
                    "*** Error *** /nPlaylist no encontrada");
        }
        
        


}
