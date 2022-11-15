package g9ej4;

/**
 * @author Carlos Ferrando
 */
public class Circulo extends FormaGeometrica implements CalculoForma {

    private double diametro;

    public Circulo(double diametro, String nombreFigura, double valorArea, double valorPerimetro) {
        super(nombreFigura, valorArea, valorPerimetro);
        this.diametro = diametro;
    }

    @Override
    public double calcularPerimetro() {
        double p = PI * diametro;
        
        return p;
    }

    @Override
    public double calcularArea() {
        double a = PI * Math.pow((diametro/2),2);
        return a;
    }

}
