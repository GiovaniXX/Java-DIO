import java.time.LocalDateTime;

public record Transacao(String tipo, double valor, String conta, LocalDateTime dataHora) {
    
}
