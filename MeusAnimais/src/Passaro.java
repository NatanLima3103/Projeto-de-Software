public class Passaro extends Animal {

    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(this.nome + " faz: Piu piu!");
    }
}