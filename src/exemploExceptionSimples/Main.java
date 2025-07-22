package exemploExceptionSimples;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Exceptions");

        String fraseAntiga = null;
        String fraseNova = null;

        try {
            fraseNova = fraseAntiga.toUpperCase();

        } catch(NullPointerException e) {
            System.out.println("A frase velha está nula");
            fraseAntiga = "Frase Vazia";
            fraseNova = fraseAntiga.toUpperCase();
        }

        System.out.println("Frase antiga: " + fraseAntiga);
        System.out.println("Frase nova: " + fraseNova);
    }
}