package com.itb.inf2dm.pizzariad.model.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "Telefone")
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 5, nullable = true)
    private String ddd;
    @Column(length = 15, nullable = true)
    private String numero;
    private boolean codstatus;

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isCodstatus() {
        return codstatus;
    }

    public void setCodstatus(boolean codstatus) {
        this.codstatus = codstatus;
    }
}
