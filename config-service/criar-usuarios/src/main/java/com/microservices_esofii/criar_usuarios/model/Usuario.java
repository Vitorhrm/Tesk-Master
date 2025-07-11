package com.microservices_esofii.criar_usuarios.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity  // Define que esta classe é uma entidade JPA
@Table(name = "usuarios")  // Especifica o nome da tabela no banco de dados
public class Usuario {

    @Id  // Indica a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ID gerado automaticamente pelo banco (auto-incremento)
    private Long id;

    @Column(nullable = false, unique = true)  // Campo obrigatório e único (não permite emails duplicados)
    private String email;

    @Column(nullable = false)  // Campo obrigatório
    private String nome;

    @Column(name = "data_criacao",nullable = false)  // Armazena a data de criação do usuário
    private LocalDateTime dataCriacao = LocalDateTime.now();  // Inicializa com o momento atual


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Usuario() {
        // Necessário para JPA e para instanciar via `new Usuario()`
    }
}
