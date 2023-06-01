package com.udea.gestionnotas.model.mapeo;

import com.udea.gestionnotas.model.dto.Actividad;
import com.udea.gestionnotas.model.entity.ActividadE;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T21:25:25-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ActividadMapperImpl implements ActividadMapper {

    @Override
    public ActividadE toActividadE(Actividad actividad) {
        if ( actividad == null ) {
            return null;
        }

        ActividadE actividadE = new ActividadE();

        actividadE.setActividadId( actividad.getActividadId() );
        actividadE.setGrupoId( actividad.getGrupoId() );
        actividadE.setDescripcion( actividad.getDescripcion() );
        actividadE.setPorcentaje( actividad.getPorcentaje() );

        return actividadE;
    }

    @Override
    public List<ActividadE> actividadtoActividadEList(List<Actividad> actividadList) {
        if ( actividadList == null ) {
            return null;
        }

        List<ActividadE> list = new ArrayList<ActividadE>( actividadList.size() );
        for ( Actividad actividad : actividadList ) {
            list.add( toActividadE( actividad ) );
        }

        return list;
    }

    @Override
    public List<Actividad> actividadEtoActividadList(List<ActividadE> actividadEList) {
        if ( actividadEList == null ) {
            return null;
        }

        List<Actividad> list = new ArrayList<Actividad>( actividadEList.size() );
        for ( ActividadE actividadE : actividadEList ) {
            list.add( actividadEToActividad( actividadE ) );
        }

        return list;
    }

    protected Actividad actividadEToActividad(ActividadE actividadE) {
        if ( actividadE == null ) {
            return null;
        }

        Actividad actividad = new Actividad();

        actividad.setActividadId( actividadE.getActividadId() );
        actividad.setGrupoId( actividadE.getGrupoId() );
        actividad.setDescripcion( actividadE.getDescripcion() );
        actividad.setPorcentaje( actividadE.getPorcentaje() );

        return actividad;
    }
}
