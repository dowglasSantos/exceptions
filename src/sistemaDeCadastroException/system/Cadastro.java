package sistemaDeCadastroException.system;

import sistemaDeCadastroException.exceptions.ClienteNaoEncontradoException;
import sistemaDeCadastroException.system.dataBase.DataBase;
import sistemaDeCadastroException.system.entity.Cliente;
import java.util.Collection;


public class Cadastro implements ICadastro {
    @Override
    public void cadastrando(Cliente cliente) {
        DataBase dataBase = DataBase.getInstance();

        if(dataBase.getDataBase().containsKey(cliente.getCpf())) {
            System.out.println("Cliente já cadastrado!");
        }

        dataBase.getDataBase().put(cliente.getCpf(), cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    @Override
    public void buscarCliente(String id) throws ClienteNaoEncontradoException {
        DataBase dataBase = DataBase.getInstance();

        if(!dataBase.getDataBase().containsKey(id)) {
            throw new ClienteNaoEncontradoException("Cliente com CPF: " + id + " não foi encontrado");
        }

        System.out.println("Cliente encontrado: " + dataBase.getDataBase().get(id));
    }

    @Override
    public Collection listaClientes() {
        DataBase dataBase = DataBase.getInstance();

        return dataBase.getDataBase().values();
    }
}
