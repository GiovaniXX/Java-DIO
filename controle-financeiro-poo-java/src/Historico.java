import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Transacao> transacoes = new ArrayList<>();

    public void registrar(String tipo, double valor, String conta) {
        transacoes.add(new Transacao(tipo, valor, conta, LocalDateTime.now()));
    }

    public void exibir() {
        System.out.println("\n=== HISTÓRICO DE TRANSAÇÕES ===");
        for (Transacao t : transacoes) {
            System.out.printf("[%s] %s de R$ %.2f na conta %s%n",
                    t.dataHora(), t.tipo(), t.valor(), t.conta());
        }
    }
}

