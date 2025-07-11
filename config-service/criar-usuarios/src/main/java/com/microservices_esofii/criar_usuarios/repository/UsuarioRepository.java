package com.microservices_esofii.criar_usuarios.repository;

import com.microservices_esofii.criar_usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Método para buscar um usuário pelo email. Spring Data JPA irá gerar a query automaticamente.
    Optional<Usuario> findByEmail(String email);
}
