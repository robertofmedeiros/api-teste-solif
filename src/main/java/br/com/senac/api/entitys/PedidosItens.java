package br.com.senac.api.entitys;

import jakarta.persistence.*;

@Entity
public class PedidosItens {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private int quantidade;

    private Double valor;

    @ManyToOne
    private Produtos produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }
}
