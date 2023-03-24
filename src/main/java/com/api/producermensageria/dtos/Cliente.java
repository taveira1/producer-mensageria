package com.api.producermensageria.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Cliente {

    @NotBlank
    private String nome;
    @NotBlank
    private String profissao;



}
