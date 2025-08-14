package com.itb.inf2dm.pizzariad.model.entity;

public class ItemPedido {
    private Long id;
    private int quantidadeItems;
    private double valorUnitario;
    private boolean sodstatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidadeItems() {
        return quantidadeItems;
    }

    public void setQuantidadeItems(int quantidadeItems) {
        this.quantidadeItems = quantidadeItems;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public boolean isSodstatus() {
        return sodstatus;
    }

    public void setSodstatus(boolean sodstatus) {
        this.sodstatus = sodstatus;
    }
}
