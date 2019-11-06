package com.example.app.apresentacao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteModel {

    private String nome;
    private int idade;
    private String telefone;
    private double limiteCredito;
    private PaisDTO pais;
}
