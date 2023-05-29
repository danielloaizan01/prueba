package com.udea.gestionnotas.api;

import com.udea.gestionnotas.model.dto.Actividad;
import com.udea.gestionnotas.model.dto.Estudiante;
import com.udea.gestionnotas.service.actividad.IActividadService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/V1/Actividades")
public class ActividadApi {
    @Autowired
    IActividadService actividadService;
    @PostMapping("")
    @Operation(summary = "Guarda las actividades de un grupo")
    @CrossOrigin(origins = "*")
    public void saveActividades(@RequestBody List<Actividad> actividades ) {
        actividadService.saveActividades(actividades);
    }
    @GetMapping("/{grupoId}")
    @Operation(summary = "Obtiene las actividades de un grupo")
    @CrossOrigin(origins = "*")
    public List<Actividad> getActividadesDeGrupo(int grupoId){
        return actividadService.getActividad(grupoId);
    }

}
