package exemploThrowThrows.pixException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pix Exception");

        try {

            banco.transferenciaViaPix(1000);
            System.out.println("Transferência realizada com sucesso!");
        } catch (PixException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
