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
        /*
        @Autowired
        private CancionService servicio;
        
        @Autowired
        private GeneroService servicioGenero;
        
        @Autowired 
        private ArtistaService artistaService;
        */
    
        @Autowired 
        private PlaylistService playlistServicio;
        
<<<<<<< Updated upstream
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
=======
//         -------------------CANCION-------------
//	
        @Test
	void probarAddCancion() {
            Cancion c = new Cancion("Monkey Dance", "3:26", "https://www.youtube.comka5", 1);
            Cancion guardada = servicio.addCancion(c);
            Assertions.assertTrue(guardada.getId() > 0, "Error, no se guardó la canción");
        }
//              
//        @Test
//        void probarUpdateCancion(){
//         String nombreNuevo = "Something About Us";
//         Integer generoNuevo = 2;
//         Cancion update = new Cancion(nombreNuevo, "3:10", "https://www.youtube.comka4,",generoNuevo);
//         update.setId(16);
//         Cancion guardar = servicio.updateCancion(update);
//        
//         Cancion update2 = (Cancion) servicio.getCancionByNombre(nombreNuevo);
//         Assertions.assertTrue(update2.getNombre() == nombreNuevo, "Error, no se actualizo el campo");
//        }
>>>>>>> Stashed changes
        
        @Test
        @Disabled
        void probarConsultarPlaylistExistente(){
            List<Playlist> listaPlaylists = playlistServicio.consultarPlaylist("boleritos");
            Assertions.assertTrue(!listaPlaylists.isEmpty(),
                    "*** Error *** /nPlaylist no encontrada");
        }
        
        


}
