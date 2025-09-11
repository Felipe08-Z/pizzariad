package com.itb.inf2dm.pizzariad.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "Pedido")

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "DECIMAL (5,2)", nullable = false)
    private double valorPedido;
    @Column(nullable = false)
    private LocalDateTime dataHoraPedido;
    @Column(nullable = true)
    private LocalDateTime dataHoraentrega;
    @Column(length = 20, nullable = false)
    private String status;
    private boolean codstatus;
    private Long clienteId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public LocalDateTime getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public LocalDateTime getDataHoraentrega() {
        return dataHoraentrega;
    }

    public void setDataHoraentrega(LocalDateTime dataHoraentrega) {
        this.dataHoraentrega = dataHoraentrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCodstatus() {
        return codstatus;
    }

    public void setCodstatus(boolean codstatus) {
        this.codstatus = codstatus;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
}
