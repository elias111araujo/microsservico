package github.elias111araujo.mscartoes.application.representation;
//DTO

import github.elias111araujo.mscartoes.domain.BandeiraCartao;
import github.elias111araujo.mscartoes.domain.Cartao;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CartaoSaveRequest {
    private String nome;
    private BandeiraCartao bandeira;
    private BigDecimal renda;
    private BigDecimal limite;

    public Cartao toModel(){
        return new Cartao(nome, bandeira, renda, limite);
    }

}
