package com.udea.gestionnotas.api;

import com.udea.gestionnotas.model.dto.Grupo;
import com.udea.gestionnotas.service.grupo.IGrupoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/V1/grupo")
public class GrupoApi {

  @Autowired
  private IGrupoService grupoService;

  @Operation(summary = "Obtiene los datos de un grupo")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Encontró el grupo sin problema",
          content = { @Content(mediaType = "application/json",
              schema = @Schema(implementation = Grupo.class)) }),
      @ApiResponse(responseCode = "204", description = "No se encontraro el grupo",
          content = @Content),
      @ApiResponse(responseCode = "404", description = "No se encontró el grupo ingresado",
          content = @Content) })
  @GetMapping("/{grupoId}")
  @CrossOrigin(origins = "*")
  public ResponseEntity<Grupo> getGrupo(@PathVariable("grupoId") int grupoId){

    if(grupoService.getGrupo(grupoId) == null){
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    Grupo grupo = grupoService.getGrupo(grupoId);

    return ResponseEntity.status(HttpStatus.OK).body(grupo);
  }
}
