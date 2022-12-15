package github.elias111araujo.msavaliadorcredito.application.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class RetornoAvaliacaoCliente {
    List<CartaoAprovado> cartoes;
}
