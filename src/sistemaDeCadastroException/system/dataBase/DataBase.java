package sistemaDeCadastroException.system.dataBase;

import sistemaDeCadastroException.system.entity.Cliente;

import java.util.Map;
import java.util.HashMap;

public class DataBase {
    private static final DataBase instance = new DataBase();

    private DataBase() {};

    private Map<String, Cliente> dataBase = new HashMap<>();

    public static DataBase getInstance() {
        return instance;
    }

    public Map<String, Cliente> getDataBase() {
        return dataBase;
    }
}
