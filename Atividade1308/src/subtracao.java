public class subtracao implements Operacaomatematica {
    @Override
    public double executar(double a, double b) {
        return a - b;
    }
    @Override
    public String descricao() {
        return "Subtração: a - b";
    }
}
