package com.example.jpa_h2_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Endereco {

    @Id
    private String id;

    private String logradouro;

    private String endereco;

    private Integer numero;

    private String bairro;

    private String cidade;

    private String estado;

    @ManyToOne
    private Cliente cliente;
}