package io.github.ericnpdev.mscartoes.application.representation;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartoesPorClienteResponse {
    private String nome;
    private String bandeira;
    private BigDecimal limiteLiberado;
}
