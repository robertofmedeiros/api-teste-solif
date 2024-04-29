package br.com.senac.api.useCases.usuarios.domains;

import java.time.LocalDateTime;

public class UsuariosRequestDom {
    private String nome;
    private String email;
    private LocalDateTime createdAt;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
