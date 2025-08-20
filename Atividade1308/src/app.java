import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class app {

    private static final Map<Integer, Operacaomatematica> OPERACOES = new LinkedHashMap<>();
    static {
        OPERACOES.put(1, new soma());
        OPERACOES.put(2, new subtracao());
        OPERACOES.put(3, new multiplicacao());
        OPERACOES.put(4, new divisao());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Informe o valor de a: ");
            double a = sc.nextDouble();

            System.out.print("Informe o valor de b: ");
            double b = sc.nextDouble();

            System.out.println("\nEscolha a operação:");
            System.out.println("1) Soma");
            System.out.println("2) Subtração");
            System.out.println("3) Multiplicação");
            System.out.println("4) Divisão");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();

            Operacaomatematica op = OPERACOES.get(opcao);
            if (op == null) {
                System.out.println("Opção inválida.");
                return;
            }

            double resultado = op.executar(a, b);
            System.out.printf("%s -> Resultado: %.4f%n", op.descricao(), resultado);

        } catch (IllegalArgumentException e) {            // nossa validação (ex.: divisão por zero)
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {               // usuário digitou algo que não é número
            System.out.println("Entrada inválida: digite números (use ponto como separador decimal).");
        } finally {
            // Relacionado ao que está escrito no quadro: o finally SEMPRE executa
            System.out.println("Finalizando... (o bloco 'finally' sempre é executado)");
            sc.close();
        }
    }
}
