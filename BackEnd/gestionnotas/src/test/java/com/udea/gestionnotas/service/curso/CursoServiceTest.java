package com.udea.gestionnotas.service.curso;


import com.udea.gestionnotas.model.dto.Actividad;
import com.udea.gestionnotas.model.dto.Curso;
import com.udea.gestionnotas.model.dto.Grupo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CursoServiceTest {

    @Autowired
    ICursoService miServicio;


    @BeforeEach
    void setUp() {
    }

    @Test
    void getCursosProfesor() {
    }

    @Test
    void getCurso() {


    }

    @Test
    void cargarGrupo() {
    }
}