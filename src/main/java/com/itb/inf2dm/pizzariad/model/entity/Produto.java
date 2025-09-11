package com.itb.inf2dm.pizzariad.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Produto") // Caso o nome da classe for o mesmo da tabela, o @table é opcional


public class Produto {
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 45, nullable = true)
    private String tipo;
    @Column(length = 250, nullable = true)
    private String descricao;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")
    private double valorCompra;
    @Column(nullable = true, columnDefinition = "DECIMAL(5,2)")
    private double valorVenda;
    @Column(nullable = true)
    private int quantidadeEstoque;
    private boolean codstatus;

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public boolean isCodstatus() {
        return codstatus;
    }

    public void setCodstatus(boolean codstatus) {
        this.codstatus = codstatus;
    }

}
