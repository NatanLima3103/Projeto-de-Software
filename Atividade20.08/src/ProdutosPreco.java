import java.util.HashMap;
import java.util.Map;

public class ProdutosPreco {
    public static void main(String[] args) {

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Arroz", 12);
        produtos.put("Feijão", 8);
        produtos.put("Macarrão", 7);
        produtos.put("Azeite", 15);
        produtos.put("Café", 13);

        System.out.println("Produtos com preço acima de R$10,00:");
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            if (entry.getValue() > 10) {
                System.out.println(entry.getKey() + " - R$" + entry.getValue());
            }
        }
    }
}
