public class multiplicacao implements Operacaomatematica {
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
    @Override
    public String descricao() {
        return "Multiplicação: a * b";
    }
}
