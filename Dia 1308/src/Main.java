public class Main {
    public static void main(String[] args) {
        relatorio r = new relatorio();
        r.imprimir();

        retangulo re = new retangulo();
        re.setBase(12.5);
        re.setAltura(3);
        System.out.println("área de re:" + re.calculararea());
        System.out.println("perímetro de re:" + re.calcularperimetro());
        re.imprimir();
    }

}