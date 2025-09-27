package com.example.jpa_h2_demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Telefone {

    @Id
    private Long id;

    private Integer DDD;

    private Long numero;

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Cliente cliente;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getDDD() {
        return DDD;
    }

    public void setDDD(Integer DDD) {
        this.DDD = DDD;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }
}