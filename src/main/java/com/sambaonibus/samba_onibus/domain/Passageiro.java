package com.sambaonibus.samba_onibus.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Entity(name = "passageiro")
public @Data class Passageiro {

    //TODO: Criar relacionamento das tabelas

    @ManyToMany(targetEntity = Viagem.class)
    private List<Viagem> viagem;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Data de saída inválida")
    @Column(nullable = false, length = 255)
    private String nome;

    // TODO: Criar validação para o CPF
    @NotBlank(message = "Nenhum CPF válido")
    @Column(nullable = false, length = 11)
    private String cpf;

    @NotBlank(message = "Nenhum RG informado")
    @Column(unique = true, length = 10)
    private int rg;

    @NotBlank(message = "Necessita de uma data de nascimento")
    @Column(unique = true)
    private Date nascimento;

    @Column()
    private String telefone;

    @Column()
    private String endereco;

    @Column()
    private String cidade;

}
