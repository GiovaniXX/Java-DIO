import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Banco {
    private Map<String, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta buscarConta(String numero) {
        return contas.get(numero);
    }

    public Collection<Conta> listarContas() {
        return contas.values();
    }
}

