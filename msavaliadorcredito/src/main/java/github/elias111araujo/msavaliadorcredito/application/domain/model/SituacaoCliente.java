package github.elias111araujo.msavaliadorcredito.application.domain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SituacaoCliente {
    private  DadosCliente cliente;
    List<CartaoCliente> cartoes;
}
