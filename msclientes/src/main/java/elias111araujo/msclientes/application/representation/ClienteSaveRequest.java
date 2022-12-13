package elias111araujo.msclientes.application.representation;
//DTO

import elias111araujo.msclientes.domain.Cliente;
import lombok.Data;

@Data
public class ClienteSaveRequest {
    private String cpf;
    private String nome;
    private int idade;

    public Cliente toModel(){
        return new Cliente(nome, cpf,idade);
    }
}
