package com.udea.gestionnotas.service.actividad;

import com.udea.gestionnotas.model.dto.Actividad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ActividadServiceTest {

    @Autowired
    private IActividadService miServicio;
    List<Actividad> actividadesResponse;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getActividad() {
        Actividad actividad1 = new Actividad();
        actividad1.setActividadId(1);
        actividad1.setGrupoId(1);
        actividad1.setDescripcion("Parcial 1");
        actividad1.setPorcentaje(30);

        Actividad actividad2 = new Actividad();
        actividad2.setActividadId(2);
        actividad2.setGrupoId(1);
        actividad2.setDescripcion("Parcial 2");
        actividad2.setPorcentaje(30);

        Actividad actividad3 = new Actividad();
        actividad3.setActividadId(3);
        actividad3.setGrupoId(1);
        actividad3.setDescripcion("Proyecto final");
        actividad3.setPorcentaje(40);

        actividadesResponse = Arrays.asList(actividad1,actividad2,actividad3);

        List<Actividad> resultado = new ArrayList<Actividad>();
        resultado = miServicio.getActividad(1);

        // Verificar el resultado esperado
        assertEquals(actividadesResponse, resultado);
    }

    @Test
    void saveActividades() {
    }
}