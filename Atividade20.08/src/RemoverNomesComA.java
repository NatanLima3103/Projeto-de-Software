import java.util.ArrayList;

public class RemoverNomesComA {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Arlindo");
        nomes.add("Bruno");
        nomes.add("Alberto");
        nomes.add("Carlos");
        nomes.add("Ariel");
        nomes.add("Daniel");

        nomes.removeIf(nome -> nome.startsWith("A"));

        System.out.println("Nomes após remoção dos que começam com 'A':");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
