package com.sambaonibus.samba_onibus.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity(name = "passageiro")
public @Data class Passageiro {

    //TODO: Criar relacionamento das tabelas

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Data de saída inválida")
    @Column(nullable = false, length = 255)
    private String nome;

    @NotBlank(message = "Nenhum RG informado")
    @Column(unique = true, length = 10)
    private int rg;

    // TODO: Criar validação para o CPF
    @NotBlank(message = "Nenhum CPF válido")
    @Column(nullable = false, length = 11)
    private String cpf;
}
