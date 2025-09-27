package com.example.jpa_h2_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Telefone {

    @Id
    private String id;

    private Integer DDD;

    private Long numero;

    @ManyToOne
    private Cliente cliente;
}