package com.udea.gestionnotas.model.mapeo;

import com.udea.gestionnotas.model.dto.Profesor;
import com.udea.gestionnotas.model.entity.ProfesorE;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T22:02:19-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ProfesorMapperImpl implements ProfesorMapper {

    @Override
    public Profesor toProfesor(ProfesorE profesorE) {
        if ( profesorE == null ) {
            return null;
        }

        Profesor profesor = new Profesor();

        profesor.setProfesorId( profesorE.getProfesorId() );
        profesor.setNombre( profesorE.getNombre() );
        profesor.setTipo( profesorE.getTipo() );
        profesor.setCorreoElectronico( profesorE.getCorreoElectronico() );
        profesor.setUsuarioPortal( profesorE.getUsuarioPortal() );

        return profesor;
    }
}
