package com.elvispresley.demo;

import com.elvispresley.demo.Servicios.CancionServicio;
import com.elvispresley.demo.entities.Cancion;
import java.util.List;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RockolaApplicationTests {

    @Autowired
        private CancionServicio servicio;
	@Test
        void pruebaSearchCancion(){
            List<Cancion> buscar = servicio.searchCancion("... ");
            Assertions.assertTrue(buscar != null, "Error! no se encontró la canción");
            
        }
	
        

}
