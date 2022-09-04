package com.elvispresley.demo;

import com.elvispresley.demo.entities.Cancion;
import com.elvispresley.demo.services.CancionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RockolaApplicationTests {
        @Autowired
        private CancionService servicio;
	
//        @Test
//	void probarAddCancion() {
//            Cancion c = new Cancion("Camisa Negra", "3:30", "www.youtube.com");
//            Cancion guardada = servicio.addCancion(c);
//            Assertions.assertTrue(guardada.getId() > 0, "Error, no se guardó la canción");
//        }

}
