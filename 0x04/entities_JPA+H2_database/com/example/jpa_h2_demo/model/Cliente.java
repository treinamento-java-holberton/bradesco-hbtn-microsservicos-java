package com.example.jpa_h2_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Cliente {

    @Id
    private String id;

    private String nome;

    private Integer idade;

    private String email;

    @OneToMany(targetEntity = Endereco.class, mappedBy = "cliente")
    private Set<Endereco> enderecos;

    @OneToMany(targetEntity = Telefone.class, mappedBy = "cliente")
    private Set<Telefone> telefones;

}