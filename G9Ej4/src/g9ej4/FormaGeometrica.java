
package g9ej4;

/**
 * @author Carlos Ferrando
 */
public abstract class FormaGeometrica {
    private String nombreFigura;
    private double valorArea;
    private double valorPerimetro;
    
    //Constructores
    public FormaGeometrica() {
    }

    public FormaGeometrica(String nombreFigura, double valorArea, double valorPerimetro) {
        this.nombreFigura = nombreFigura;
        this.valorArea = valorArea;
        this.valorPerimetro = valorPerimetro;
    }
    
    //Getters & Setters
    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public double getValorArea() {
        return valorArea;
    }

    public void setValorArea(double valorArea) {
        this.valorArea = valorArea;
    }

    public double getValorPerimetro() {
        return valorPerimetro;
    }

    public void setValorPerimetro(double valorPerimetro) {
        this.valorPerimetro = valorPerimetro;
    }
    
    
    
}
