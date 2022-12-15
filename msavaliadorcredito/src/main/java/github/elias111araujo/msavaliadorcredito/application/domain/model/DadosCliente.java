package github.elias111araujo.msavaliadorcredito.application.domain.model;


import lombok.Data;
//Representação dos dados do Cliente
@Data
public class DadosCliente {
    private  Long id;
    private  String nome;
    private  Integer idade;
}
