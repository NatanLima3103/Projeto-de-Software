public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Dori");
        Gato meuGato = new Gato("Aurora");
        Passaro meuPassaro = new Passaro("Kiko");

        System.out.println("Testando os sons dos animais:");

        meuCachorro.emitirSom();
        meuGato.emitirSom();
        meuPassaro.emitirSom();
    }
}