package io.github.ezauPratica.libraryapi.controller.mappers;

import io.github.ezauPratica.libraryapi.controller.dto.UsuarioDTO;
import io.github.ezauPratica.libraryapi.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDTO dto);

}
