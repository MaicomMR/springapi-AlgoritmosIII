package com.sambaonibus.samba_onibus.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;


@Entity(name = "motorista")
public @Data class Motorista {

        //TODO: Criar relacionamento das tabelas
        //@ManyToMany(targetEntity = Viagem.class)
        //private List<Viagem> viagem;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @NotBlank(message = "Um nome de motorista deve ser informado")
        @Column(nullable = false, length = 255)
        private String nome;

        @NotBlank(message = "o RG do motorista está em branco")
        @Column(unique = true, length = 10)
        private String rg;

        // TODO: Criar validação para o CPF
        @NotBlank(message = "Deve ser informado um CPF válido para o motorista")
        @Column(nullable = false, length = 11)
        private String cpf;

        @Column(length = 30)
        private String telefone;

        @NotBlank(message = "Nenhum endereço informado")
        @Column(nullable = false, length = 60)
        private String endereco;

        @NotBlank(message = "Nenhuma cidade informada")
        @Column(nullable = false, length = 60)
        private String cidade;

        @NotBlank(message = "Nenhuma categoria informada")
        @Column(nullable = false)
        private int categoria;

        @NotBlank(message = "O motorista deve possuir um número de Carteira Nacional de Habilitação")
        @Column(nullable = false, length = 12)
        private String cnh;

        @NotBlank(message = "Vencimento dos documentos do Motorista")
        @Column(nullable = false)
        private Date venc_doc;

        @Column(length = 255)
        private String obs;

        @Column(nullable = false)
        private boolean disponivel;
}

