package com.udea.gestionnotas.model.mapeo;

import com.udea.gestionnotas.model.dto.Estudiante;
import com.udea.gestionnotas.model.dto.Grupo;
import com.udea.gestionnotas.model.entity.EstudianteE;
import com.udea.gestionnotas.model.entity.GrupoE;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-01T13:04:27-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class GrupoMapperImpl implements GrupoMapper {

    @Override
    public Grupo toGrupo(GrupoE grupoE) {
        if ( grupoE == null ) {
            return null;
        }

        Grupo grupo = new Grupo();

        grupo.setGrupoId( grupoE.getGrupoId() );
        grupo.setCodigo( grupoE.getCodigo() );
        grupo.setProfesorId( grupoE.getProfesorId() );
        grupo.setCursoId( grupoE.getCursoId() );
        grupo.setHorario( grupoE.getHorario() );
        grupo.setEstudiantes( estudianteEListToEstudianteList( grupoE.getEstudiantes() ) );

        return grupo;
    }

    @Override
    public List<Grupo> grupoEtoGrupoList(List<GrupoE> grupoEList) {
        if ( grupoEList == null ) {
            return null;
        }

        List<Grupo> list = new ArrayList<Grupo>( grupoEList.size() );
        for ( GrupoE grupoE : grupoEList ) {
            list.add( toGrupo( grupoE ) );
        }

        return list;
    }

    protected Estudiante estudianteEToEstudiante(EstudianteE estudianteE) {
        if ( estudianteE == null ) {
            return null;
        }

        Estudiante estudiante = new Estudiante();

        estudiante.setEstudianteId( estudianteE.getEstudianteId() );
        estudiante.setNombre( estudianteE.getNombre() );
        estudiante.setCorreo( estudianteE.getCorreo() );
        estudiante.setNumeroIdentificacion( estudianteE.getNumeroIdentificacion() );

        return estudiante;
    }

    protected List<Estudiante> estudianteEListToEstudianteList(List<EstudianteE> list) {
        if ( list == null ) {
            return null;
        }

        List<Estudiante> list1 = new ArrayList<Estudiante>( list.size() );
        for ( EstudianteE estudianteE : list ) {
            list1.add( estudianteEToEstudiante( estudianteE ) );
        }

        return list1;
    }
}
