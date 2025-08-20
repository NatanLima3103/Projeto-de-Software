public class retangulo implements forma, imprimivel{

    private double base;
    private double altura;

    // getter e setter

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculararea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularperimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    @Override
    public void imprimir() {
        System.out.println("base: " + this.base + ", altura: " + this.altura);

    }
}
