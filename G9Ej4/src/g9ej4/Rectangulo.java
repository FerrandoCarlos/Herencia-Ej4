package g9ej4;

/**
 * @author Carlos Ferrando
 */
public class Rectangulo extends FormaGeometrica implements CalculoForma {

    private double base;
    private double altura;

    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, String nombreFigura, double valorArea, double valorPerimetro) {
        super(nombreFigura, valorArea, valorPerimetro);
        this.base = base;
        this.altura = altura;
    }

    //Setters & Getters
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

    //Metodos Sobrescritos implementados por la interface
    @Override
    public double calcularPerimetro() {
        double p = (base + altura) * 2;
        return p;
    }

    @Override
    public double calcularArea() {
        double a = base * altura;
        return a;
    }

}
