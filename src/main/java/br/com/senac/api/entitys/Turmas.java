package br.com.senac.api.entitys;

import jakarta.persistence.*;

@Entity
public class Turmas {
    @Id
    @Column(name = "turmas_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int ano;
    @Column(nullable = false)
    private int semestre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
}
