public class Investimento {
    private double valorInicial;
    private double taxaAnual; // Ex: 0.08 para 8%
    private int meses;

    public Investimento(double valorInicial, double taxaAnual, int meses) {
        this.valorInicial = valorInicial;
        this.taxaAnual = taxaAnual;
        this.meses = meses;
    }

    public double simularRendimento() {
        double taxaMensal = Math.pow(1 + taxaAnual, 1.0 / 12) - 1;
        return valorInicial * Math.pow(1 + taxaMensal, meses);
    }

    public void exibirSimulacao() {
        double rendimento = simularRendimento();
        System.out.printf("Investimento de R$ %.2f por %d meses a %.2f%% a.a. renderá R$ %.2f%n",
                valorInicial, meses, taxaAnual * 100, rendimento);
    }
}

