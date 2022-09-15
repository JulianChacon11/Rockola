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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RockolaApplicationTests {
        @Autowired
        private CancionService servicio;
        
        @Autowired
        private GeneroService servicioGenero;
        
        @Autowired 
        private ArtistaService artistaService;
        
        @Autowired 
        private PlaylistService playlistServicio;
        
        @Test
        @Disabled
        void probarCrearPlaylist(){
            Playlist pl = new Playlist();
            pl.setNombre("Boleritos");
            pl.setCliente(new Cliente("Juan", "Hernández", "abcd@gmail.com",
                    LocalDate.now(), "4436785678","male","mexican",true));
            pl.setCancion(new ArrayList<Cancion>());
            
            Playlist plGuardada = playlistServicio.crearNuevaPlaylist(pl);
            
            Assertions.assertTrue(plGuardada.getId() > 0, "Error, no se guardó la playlist");
            
        }
	
//        @Test
//	void probarAddCancion() {
//            Cancion c = new Cancion("Camisa Negra", "3:30", "www.youtube.com", 1);
//            Cancion guardada = servicio.addCancion(c);
//            Assertions.assertTrue(guardada.getId() > 0, "Error, no se guardó la canción");
//        }
//        
//        @Test
//	void probarAddArtista() {
//            Artista a = new Artista("Shakira", "Colombia");
//            Artista guardado = artistaService.addArtista(a);
//            Assertions.assertTrue(guardado.getId() > 0, "Error, no se guardó la canción");
//        }
////        
//        @Test
//        void probarAddGenero(){
//            Genero g = new Genero("Rock");
//            Genero guardado = servicioGenero.addGenero(g);
//            Assertions.assertTrue(guardado.getId() > 0, "Error, no se guardó la canción");
//        }

}
