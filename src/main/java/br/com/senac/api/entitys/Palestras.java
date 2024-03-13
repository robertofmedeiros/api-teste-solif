package br.com.senac.api.entitys;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Palestras {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private LocalDateTime dataHora;

    private int duracao;

    @ManyToMany
    @JoinTable(name = "palestras_palestrante",
                joinColumns = @JoinColumn(name = "palestras_id"),
                inverseJoinColumns = @JoinColumn(name = "palestrantes_id"))
    private List<Palestrantes> palestrantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<Palestrantes> getPalestrantes() {
        return palestrantes;
    }

    public void setPalestrantes(List<Palestrantes> palestrantes) {
        this.palestrantes = palestrantes;
    }
}
