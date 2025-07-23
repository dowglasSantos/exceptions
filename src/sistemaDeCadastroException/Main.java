package sistemaDeCadastroException;

import sistemaDeCadastroException.exceptions.ClienteNaoEncontradoException;
import sistemaDeCadastroException.system.Cadastro;
import sistemaDeCadastroException.system.entity.Cliente;

public class Main {
    public static void main(String[] args) throws ClienteNaoEncontradoException {
        System.out.println("Sistema de Cadastro de Clientes implementando Exceptions");

        Cadastro cadastro = new Cadastro();

        Cliente cliente = new Cliente("Dowglas", "04882985047");

        cadastro.cadastrando(cliente);

        try {
            cadastro.buscarCliente("04882985047");
        } catch (ClienteNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
