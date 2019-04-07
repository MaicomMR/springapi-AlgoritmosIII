package com.sambaonibus.samba_onibus.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.util.Date;

@Entity(name = "viagem")
public @Data
class Viagem {


    //TODO: Criar relacionamento das tabelas
    //TODO: Criar um COUNT nos passageiros para calcular o número de passageiros da viagem.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column()
    private double dist_pre;

    @Column()
    private double dist_real;

    @NotNull(message = "Origem da viagem inválido")
    @Column(nullable = false)
    private String origem;

    @NotNull(message = "Origem da viagem inválido")
    @Column(nullable = false)
    private int origem_estado;

    @NotBlank(message = "Destino de viagem inválido")
    @Column(nullable = false)
    private String destino;

    @NotNull(message = "Origem da viagem inválido")
    @Column(nullable = false)
    private int destino_estado;

    @Column()
    private double orcamento;

    @NotBlank(message = "Data de saída inválida")
    @Column(nullable = false)
    private Date data_s;

    @NotBlank(message = "Data de saída inválida")
    @Column(nullable = false)
    private Time hora_s;

    @NotBlank(message = "Data de retorno inválido")
    @Column(nullable = false)
    private Date data_r;


}
