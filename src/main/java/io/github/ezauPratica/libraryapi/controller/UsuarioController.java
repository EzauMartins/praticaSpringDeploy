package io.github.ezauPratica.libraryapi.controller;

import io.github.ezauPratica.libraryapi.controller.dto.UsuarioDTO;
import io.github.ezauPratica.libraryapi.controller.mappers.UsuarioMapper;
import io.github.ezauPratica.libraryapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;
    private final UsuarioMapper usuarioMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody UsuarioDTO usuarioDTO){
        usuarioService.salvar(usuarioMapper.toEntity(usuarioDTO));
    }
}
