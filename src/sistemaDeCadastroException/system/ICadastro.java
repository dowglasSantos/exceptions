package sistemaDeCadastroException.system;

import sistemaDeCadastroException.exceptions.ClienteNaoEncontradoException;
import sistemaDeCadastroException.system.entity.Cliente;

import java.util.Collection;

public interface ICadastro {
    void cadastrando(Cliente cliente);
    void buscarCliente(String id) throws ClienteNaoEncontradoException;
    Collection listaClientes();
}
