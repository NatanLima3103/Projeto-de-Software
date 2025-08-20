public class Main {
    public static void main(String[] args) {
        // Criando operações
        Operacaomatematica soma = new soma();
        Operacaomatematica sub = new subtracao();
        Operacaomatematica mult = new multiplicacao();
        Operacaomatematica div = new divisao();

        // Testando operações
        double a = 10;
        double b = 5;

        System.out.println(soma.descricao() + " = " + soma.executar(a, b));
        System.out.println(sub.descricao() + " = " + sub.executar(a, b));
        System.out.println(mult.descricao() + " = " + mult.executar(a, b));
        System.out.println(div.descricao() + " = " + div.executar(a, b));

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.IOException;

            public class LeitorArquivo {

                public static int lerNumeroDoArquivo(String caminho) {
                    try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
                    String linha = br.readLine();
                    return Integer.parseInt(linha); // tenta converter para int
                }
                    catch (NumberFormatException e) {
                    System.out.println("Erro: o conteúdo do arquivo não é um número inteiro válido.");
                    }
                    catch (IOException e) {
                        System.out.println("Erro ao ler o arquivo: " + e.getMessage());
                }
                return 0; // valor padrão em caso de erro
            }
        }

    }
}
