package br.com.senac.api.entitys;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Palestrantes {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @ManyToMany(mappedBy = "palestrantes")
    private List<Palestras> palestras;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Palestras> getPalestras() {
        return palestras;
    }

    public void setPalestras(List<Palestras> palestras) {
        this.palestras = palestras;
    }
}
