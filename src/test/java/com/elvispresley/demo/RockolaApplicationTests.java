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
//	
//        @Test
//	void probarAddCancion() {
//            Cancion c = new Cancion("Monkey Dance", "3:26", "https://www.youtube.comka5", 1);
//            Cancion guardada = servicio.addCancion(c);
//            Assertions.assertTrue(guardada.getId() > 0, "Error, no se guardó la canción");
//        }
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
        
//        @Test
//        void probarGetAllCanciones(){
//          List<Cancion> allCanciones = servicio.getAllCanciones();
//          Assertions.assertNotNull(allCanciones, "Error, no existen canciones en la lista");
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
//            int id = 15;
//            List<Cancion> getCancion = servicio.getCancionById(id);
//            Assertions.assertNotNull(getCancion, "Error, no se encontró canción");
//        }
//        
//          @Test
//          void probarDeleteCancion(){
//            Integer id = 22;
//            List<Cancion> getCancion = servicio.getCancionById(id);
//            boolean borrar = servicio.deleteCancion(id);
//            Assertions.assertNull(borrar); 
//        }       
//   --------------------ARTISTA-----------------------------     
//        @Test
//        void probarAddArtista(){
//            Artista a = new Artista("Tones and I", "Australia");
//            Artista guardado = artistaService.addArtista(a);
//            Assertions.assertTrue(guardado.getId() > 0 , "Error, no se encontró artista");
//        }
////        
//        @Test
//        void probarUpdateArtista(){
//         String nacionalidadNueva = "Francia";
//         Artista update = new Artista("Something About Us", nacionalidadNueva);
//         update.setId(2);
//         Artista guardar = artistaService.updateArtista(update);
//         Artista update2 = (Artista) artistaService.getArtistaByNacionalidad(nacionalidadNueva);
//         Assertions.assertTrue(update2.getNombre() == nacionalidadNueva, "Error, no se actualizo el campo");          
//        }
//        
//        @Test
//        void probarGetAllArtista(){
//            List<Artista> artista = artistaService.getAllArtistas();
//            Assertions.assertTrue(artista.size()>0, "Error, no hay artistas");
//        }
//        
//        @Test
//        void probarGetViewArtista(){
//         Artista view = artistaService.viewArtista(2);
//         Assertions.assertTrue(view.getId() == 14, "Error, no se puede mostrar la cancion"); 
//        }
//        
//        @Test
//        void probarGetArtistaByNombre(){
//            List<Artista> artista = artistaService.getArtistaByNombre("Shakira");
//            Assertions.assertTrue(artista.size() > 0, "Error, no se encontró el artista");
//        }
//        
//        @Test
//        void probarGetArtistaByNacionalidad(){
//            List<Artista> artista = artistaService.getArtistaByNacionalidad("Francia");
//            Assertions.assertTrue(artista.size() > 0, "Error, no se encontró el artista");
//        }
//        
//        @Test
//        void probarDeleteArtista(){
//            Integer id = 4;
//            List<Artista> getArtista = artistaService.getArtistaById(id);
//            boolean borrar = artistaService.deleteArtista(id);
//            Assertions.assertNull(borrar); 
//        } 
////    ----------------GENERO----------------    
//        @Test
//        void probarAddGenero(){
//            Genero g = new Genero("Soul");
//            Genero guardado = servicioGenero.addGenero(g);
//            Assertions.assertTrue(guardado.getId() > 0, "Error, no se guardó la canción");
//        }
//        
//         @Test
//         void probarUpdateGenero(){
//         String nombreNuevo = "Jazz";
//         Genero update = new Genero(nombreNuevo);
//         update.setId(5);
//         Genero guardar = servicioGenero.updateGenero(update);
//         Genero update2 = (Genero) servicioGenero.getGeneroByNombre(nombreNuevo);
//         Assertions.assertTrue(update2.getNombre() == nombreNuevo, "Error, no se actualizo el campo");          
//        }
//        
//        @Test
//        void probarGetAllGenero(){
//            List<Genero> generos = servicioGenero.getAllGeneros();
//            Assertions.assertTrue(generos.size()>0, "Error, no hay artistas");
//        }
//        
//        @Test
//        void probarGetViewGenero(){
//         Genero view = servicioGenero.viewGenero(3);
//         Assertions.assertTrue(view.getId() == 3, "Error, no se puede mostrar la cancion"); 
//        }
//        
//        @Test
//        void probarGetGeneroByNombre(){
//            List<Genero> generos = servicioGenero.getGeneroByNombre("Rock");
//            Assertions.assertTrue(genero.size() > 0, "Error, no se encontró el artista");
//        }
//        
//        @Test
//        void probarDeleteGenero(){
//            Integer id = 5;
//            List<Genero> getGenero = servicioGenero.getGeneroById(id);
//            boolean borrar = servicioGenero.deleteGenero(id);
//            Assertions.assertNull(borrar); 
//        } 
}
