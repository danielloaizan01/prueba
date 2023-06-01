package com.udea.gestionnotas.model.mapeo;

import com.udea.gestionnotas.model.dto.Estudiante;
import com.udea.gestionnotas.model.entity.EstudianteE;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T21:25:26-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class EstudianteMapperImpl implements EstudianteMapper {

    @Override
    public Estudiante toEstudiante(EstudianteE estudiante) {
        if ( estudiante == null ) {
            return null;
        }

        Estudiante estudiante1 = new Estudiante();

        estudiante1.setEstudianteId( estudiante.getEstudianteId() );
        estudiante1.setNombre( estudiante.getNombre() );
        estudiante1.setCorreo( estudiante.getCorreo() );
        estudiante1.setNumeroIdentificacion( estudiante.getNumeroIdentificacion() );

        return estudiante1;
    }

    @Override
    public List<Estudiante> estudianteEtoEstudianteList(List<EstudianteE> estudianteE) {
        if ( estudianteE == null ) {
            return null;
        }

        List<Estudiante> list = new ArrayList<Estudiante>( estudianteE.size() );
        for ( EstudianteE estudianteE1 : estudianteE ) {
            list.add( toEstudiante( estudianteE1 ) );
        }

        return list;
    }
}
