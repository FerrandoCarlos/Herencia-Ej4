package g9ej4;

/**
 * @author Carlos Ferrando
 */
public class Rectangulo extends FormaGeometrica implements CalculoForma {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombreFigura, double valorArea, double valorPerimetro) {
        super(nombreFigura, valorArea, valorPerimetro);
        this.base = base;
        this.altura = altura;
    }
    
    

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
