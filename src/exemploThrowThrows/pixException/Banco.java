package exemploThrowThrows.pixException;

public class Banco {
    private static final Banco instance = new Banco();

    public static Banco getInstance() {
        return instance;
    }

    public void transferenciaViaPix(int value) throws PixException {
        if(value > 5000 ) {
            throw new PixException("Transferência acima do limite diário");
        }
    }
}
