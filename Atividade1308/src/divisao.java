public class divisao implements Operacaomatematica {
    @Override
    public double executar(double a, double b) {
        // Em Java, double/0 vira Infinity, então vamos tratar manualmente:
        if (b == 0.0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
    @Override
    public String descricao() {
        return "Divisão: a / b";
    }
}
