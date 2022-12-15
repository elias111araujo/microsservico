package github.elias111araujo.msavaliadorcredito.application.domain.model;


import lombok.Data;

import java.math.BigDecimal;
//Representação do Cartão
@Data
public class CartaoCliente {
    private String nome;
    private String bandeira;
    private BigDecimal limite;
}
