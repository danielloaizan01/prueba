package com.udea.gestionnotas.model.mapeo;

import com.udea.gestionnotas.model.dto.Curso;
import com.udea.gestionnotas.model.entity.CursoE;
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
public class CursoMapperImpl implements CursoMapper {

    @Override
    public Curso toCurso(CursoE cursoE) {
        if ( cursoE == null ) {
            return null;
        }

        Curso curso = new Curso();

        curso.setCursoId( cursoE.getCursoId() );
        curso.setNombre( cursoE.getNombre() );
        curso.setCreditos( cursoE.getCreditos() );
        curso.setCodigo( cursoE.getCodigo() );

        return curso;
    }

    @Override
    public List<Curso> cursoEtoCursoList(List<CursoE> cursoEList) {
        if ( cursoEList == null ) {
            return null;
        }

        List<Curso> list = new ArrayList<Curso>( cursoEList.size() );
        for ( CursoE cursoE : cursoEList ) {
            list.add( toCurso( cursoE ) );
        }

        return list;
    }
}
