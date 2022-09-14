package com.elvispresley.demo;

import com.elvispresley.demo.entities.Artista;
import com.elvispresley.demo.entities.Cancion;
import com.elvispresley.demo.entities.Genero;
import com.elvispresley.demo.services.ArtistaService;
import com.elvispresley.demo.services.CancionService;
import com.elvispresley.demo.services.GeneroService;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties= "spring.main.allow-bean-definition-overriding=true")
class RockolaApplicationTests {
        @Autowired
        private CancionService servicio;
        
        @Autowired
        private GeneroService servicioGenero;
        
        @Autowired ArtistaService artistaService;
        
//         -------------------CANCION-------------
	
//        @Test
//	void probarAddCancion() {
//            Cancion c = new Cancion("Monkey Dance", "3:28", "https://www.youtube.com/watch?v=bqaQLeNAs2M", 1);
//            Cancion guardada = servicio.addCancion(c);
//            Assertions.assertTrue(guardada.getId() > 0, "Error, no se guardó la canción");
//        }       
       
//        @Test
//        void probarUpdateCancion(){
//         String nombreNuevo = "SONG50";
//         Integer generoNuevo = 3;
//         Cancion update = new Cancion(nombreNuevo, "3:10", "https://www.youtube.comka4,",generoNuevo);
//         update.setId(16);
//         Cancion guardar = servicio.updateCancion(update);
//        
//         Cancion update2 = (Cancion) servicio.getCancionByNombre(nombreNuevo);
//         Assertions.assertTrue(update2.getNombre() == nombreNuevo, "Error, no se actualizo el campo");
//        }
//        
//        @Test
//        void probarGetAllCanciones(){
//          List<Cancion> allCanciones = servicio.getAllCanciones();
//          Assertions.assertTrue( allCanciones != null , "Error, no hay canciones en la lista");
//        }
//        
//        @Test
//       
//       void probarViewCancion(){
//           Cancion view = servicio.viewCancion(14);
//          Assertions.assertTrue(view.getId() == 14, "Error, no se puede mostrar la cancion"); 
//       }
//        
//        @Test
//       void probarGetCancionByNombre(){
//           List <Cancion> getCancion = servicio.getCancionByNombre("Something About Us");
//          Assertions.assertTrue(getCancion.size() > 0 , "Error, la cancion que busca no existe!");
//       }
//        
//        @Test
//        void probarGetCancionById(){
//          Integer id = 12;
//          List<Cancion> getCancion = servicio.getCancionById(id);
//          Assertions.assertTrue(getCancion.size() > 0, "Error, no se encontró la canción");
//        }
//          @Test
//          void probarDeleteCancion(){
//            Integer id = 12;
//            List<Cancion> getCancion = servicio.getCancionById(id);
//            boolean borrar = servicio.deleteCancion(id);
//            Assertions.assertNull(borrar);
//          }
//   --------------------ARTISTA-----------------------------     
//        @Test
//	void probarAddArtista() {
//            Artista a = new Artista("Shakira", "Colombia");
//            Artista guardado = artistaService.addArtista(a);
//            Assertions.assertTrue(guardado.getId() > 0, "Error, no se guardó la canción");
//        }
////    ----------------GENERO----------------    
//        @Test
//        void probarAddGenero(){
//            Genero g = new Genero("Rock");
//            Genero guardado = servicioGenero.addGenero(g);
//            Assertions.assertTrue(guardado.getId() > 0, "Error, no se guardó la canción");
//        }

}
