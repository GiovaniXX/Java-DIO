import java.util.Scanner;

public class JogoDaForca {
    private Palavra palavra;
    private int tentativasRestantes;
    private StringBuilder letrasUsadas;
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        palavra = new Palavra("PROGRAMACAO"); // pode ser gerada aleatoriamente
        tentativasRestantes = 6;
        letrasUsadas = new StringBuilder();

        while (tentativasRestantes > 0 && !palavra.estaCompleta()) {
            ForcaVisual.desenhar(tentativasRestantes);
            System.out.println("Palavra: " + palavra.getPalavraOculta());
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite uma letra: ");
            char tentativa = scanner.nextLine().toUpperCase().charAt(0);

            if (letrasUsadas.toString().contains(String.valueOf(tentativa))) {
                System.out.println("Você já usou essa letra.");
                continue;
            }

            letrasUsadas.append(tentativa);
            if (!palavra.revelarLetra(tentativa)) {
                tentativasRestantes--;
            }
        }

        if (palavra.estaCompleta()) {
            System.out.println("🎉 Você venceu! A palavra era: " + palavra.getTexto());
        } else {
            ForcaVisual.desenhar(0);
            System.out.println("💀 Você perdeu! A palavra era: " + palavra.getTexto());
        }
    }
}

