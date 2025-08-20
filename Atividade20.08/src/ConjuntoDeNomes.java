import java.util.HashSet;

public class ConjuntoDeNomes {
    public static void main(String[] args) {

        HashSet<String> nomes = new HashSet<>();


        nomes.add("João");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Morisco");
        nomes.add("Eduardo");


        String nomeParaRemover = "Carlos";

        if (nomes.contains(nomeParaRemover)) {
            System.out.println(nomeParaRemover + " está no conjunto. Removendo...");
            nomes.remove(nomeParaRemover);
        } else {
            System.out.println(nomeParaRemover + " não está no conjunto.");
        }

        System.out.println("Conjunto atualizado:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
