package com.microservices_esofii.criar_usuarios.controller;

import java.util.List;
import com.microservices_esofii.criar_usuarios.dto.UsuarioRequestDTO;
import com.microservices_esofii.criar_usuarios.dto.UsuarioResponseDTO;
import com.microservices_esofii.criar_usuarios.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    //Endpoint POST para cadastrar um usuário via DTO.
    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@Valid @RequestBody UsuarioRequestDTO dto) {
        try {
            UsuarioResponseDTO response = service.cadastrarUsuario(dto);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //Retorna a lista de todos os usuários cadastrados.

    @GetMapping("/listar")
    public ResponseEntity<List<UsuarioResponseDTO>> listarTodos() {
        List<UsuarioResponseDTO> usuarios = service.listarTodos();
        return ResponseEntity.ok(usuarios);
    }
}
