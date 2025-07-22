package exemploThrowThrows;

public class Main {
    public static void main(String[] args) {
        try {
            verificarIdade(14);
            System.out.println("Cadastro feito com sucesso");
        } catch (MyExceptions e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void verificarIdade(int idade) throws MyExceptions {
        if(idade < 18) {
            throw new MyExceptions("Você deve ter mais de 18 anos.");
        }
    }
}
