package github.elias111araujo.msavaliadorcredito.application.ex;

public class DadosClienteNotFoundException extends Exception{
    public DadosClienteNotFoundException() {
        super("Dados do Cliente não encontrados com o CPF informado.");
    }
}
