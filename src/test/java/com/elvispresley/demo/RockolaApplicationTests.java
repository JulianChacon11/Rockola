package com.elvispresley.demo;

import com.elvispresley.demo.entities.Artista;
import com.elvispresley.demo.entities.Cancion;
import com.elvispresley.demo.entities.Genero;
import com.elvispresley.demo.services.ArtistaService;
import com.elvispresley.demo.services.CancionService;
import com.elvispresley.demo.services.GeneroService;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RockolaApplicationTests {
        @Autowired
        private CancionService servicio;
        
        @Autowired
        private GeneroService servicioGenero;
        
        @Autowired ArtistaService artistaService;
        
 // ---------------------------CANCION------------------------     
	
//       @Test
//	void probarAddCancion() {
//           Cancion c = new Cancion("Sweet Child O' Mine", "5:02", "https://www.youtube.com/watch?v=1w7OgIMMRc4", 4);
//           Cancion guardada = servicio.addCancion(c);
//           Assertions.assertTrue(guardada.getId() > 0, "Error, no se guardó la canción");
//        }
//       @Test
//        void probarAddCancion(){
//           Cancion c = new Cancion( "Smells like teen spirit", "4:38", "https://www.youtube.com/watch?v=hTWKbfoikeg", 4);
//           Cancion guardado = servicio.addCancion(c);
//           Assertions.assertTrue(guardado.getId() > 0 , "Error, no se guardó la canción");
//       }
////        
//       @Test
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
//       @Test
//              void probarGetAllCanciones(){
//          List<Cancion> allCanciones = servicio.getAllCanciones();
//          Assertions.assertTrue( allCanciones != null , "Error, no hay canciones en la lista");
//       }
        
//        @Test
//       
//       void probarViewCancion(){
//           Cancion view = servicio.viewCancion(14);
//          Assertions.assertTrue(view.getId() == 14, "Error, no se puede mostrar la cancion"); 
//       }
        
//        @Test
//       void probarGetCancionByNombre(){
//           List <Cancion> getCancion = servicio.getCancionByNombre("Something About Us");
//          Assertions.assertTrue(getCancion.size() > 0 , "Error, la cancion que busca no existe!");
//       }
//        
//        @Test
//        void probarGetCancionById(){
//            List<Cancion> getCancion = servicio.getCancionByGenero(id);
//            Assertions
//        }
//          @Test
//          void probarDeleteCancion(){
//          Integer id = 14;
//            Optional<Cancion> buscarCancion = servicio.getCancionById(id);
//            Optional<Cancion> borrado =  servicio.getCancionById(id);
//          Assertions.assertTrue(borrado.getId()==0, "Error!");        
//}

//      
// --------------------------ARTISTA------------------
//        
//        @Test
//	void probarAddArtista() {
//            Artista a = new Artista("Guns N' Roses", "Estados Unidos");
//            Artista guardado = artistaService.addArtista(a);
//            Assertions.assertTrue(guardado.getId() > 0, "Error, no se guardó la canción");
//        }
//      
//        @Test
//       void probarAddArtista(){
//           Artista a = new Artista("Daft Punk", "Estados Unidos");
//           Artista guardar = artistaService.addArtista(a);
//           Assertions.assertTrue(guardar.getId() > 0, "Error, no se guardó la canción");
//       }
//       @Test
//       void probarUpdateArtista(Artista a) {
//         String nombreNuevo = "ARTISTA1";
//         String artistaNuevo = "Francia";
//         Artista update = new Artista(nombreNuevo, artistaNuevo);
//         update.setId(4);
//         Artista guardar = artistaService.updateArtista(update);
//         Artista update2 = (Artista) artistaService.getArtistaByNombre(nombreNuevo);
//         Assertions.assertTrue(update2.getNombre() == nombreNuevo, "Error, no se actualizo el campo");
//       }
        
//         Artista update2 = (Artista ) artistaService.getArtistaByNombre(nombreNuevo);
//         Assertions.assertTrue(update2.getNombre()== nombreNuevo, "Error, no se actualizo el campo");
//       }
//       @Test
//       void probarGetAllArtist(){
//           List<Artista> artistas = artistaService.getAllArtistas();
//           Assertions.assertTrue(artistas != null, "Error, no hay datos de artistas");
//       }
//       
//        @Test
//          void probarViewArtista(){
//          Artista view = artistaService.viewArtista(2);
//          Assertions.assertTrue(view.getId() == 2 , "Error, no se puede mostrar al artista");
//                 
//      }
        
//        @Test
//          void probarGetArtistbyNombre(){
//          List <Artista> getArtista = artistaService.getArtistaByNombre("Daft Punk");
//          Assertions.assertTrue(getArtista.size() > 0, "Error, no se encontró el artista");
//          }
//          @Test
//           void probarDeleteArtista(){
//           String artist = "artista1";
//           List<Artista> artista = artistaService.getArtistaByNombre(artist);
//           Artista delete = artistaService.deleteArtista(artist, "Colombia");
//           List<Artista> borrado = artistaService.getArtistaByNombre(artist);
//           Assertions.assertTrue(borrado == null, "Error!, el artista no fue borrado"); 
//           }
//    ------------------------------GENERO---------------------------- 
//        @Test
//        void probarAddGenero(){
//            Genero g = new Genero("Rock");
//            Genero guardado = servicioGenero.addGenero(g);
//            Assertions.assertTrue(guardado.getId() > 0, "Error, no se guardó la canción");
//        }
//       @Test 
//          void probarAddGenero(){
//              Genero g = new Genero("Electronica");
//              Genero guardar = servicioGenero.addGenero(g);
//              Assertions.assertTrue(guardar.getId() > 0 , "Error, no se guardó la canción");
//          }
//        @Test
//        void probarUpdateGenero(){
//          String generoNuevo = "Pop";
//          Genero update = new Genero(generoNuevo);
//         update.setId(1);
//         Genero guardar = servicioGenero.updateGenero(update);
//        
//         Genero update2 = (Genero) servicioGenero.getGeneroByNombre(generoNuevo);
//         Assertions.assertTrue(update2.getNombre() == generoNuevo, "Error, no se actualizo el campo");   
//        
//        }
//        
//        @Test
//        void probarGetAllGeneros(){
//             List<Genero> generos = servicioGenero.getAllGeneros();
//             Assertions.assertTrue(generos != null, "Error, no hay datos de género musical");
//
//        }
//        
//        @Test
//        void probarGeneroByNombre(){
//         List<Genero> getGeneros = servicioGenero.getGeneroByNombre("Electronica");
//         Assertions.assertTrue(getGeneros.size() > 0, "Error, no se encontró el género");
//        }       
//        
//        @Test
//        void probarViewGenero(){
//          Genero view = servicioGenero.viewGenero(2);
//          Assertions.assertTrue(view.getId() == 2 , "Error, el genero no existe");   
//        }
//          @Test
//          void probarDeleteGenero(){
//           List<Genero> getGeneros = servicioGenero.getGeneroById(1);
//           Genero borrarGenero = servicioGenero.deleteGenero();
//}
}
  
