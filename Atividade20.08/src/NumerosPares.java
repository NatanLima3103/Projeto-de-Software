import java.util.ArrayList;

public class NumerosPares {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
